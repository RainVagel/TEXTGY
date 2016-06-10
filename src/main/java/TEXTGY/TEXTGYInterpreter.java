package TEXTGY;

import TEXTGY.ast.*;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static TEXTGY.TEXTGYParsingUtils.createAst;

/**
 * Created by rainvagel on 10.06.16.
 */
public class TEXTGYInterpreter {

    private static HashMap<String, Object> variables = new HashMap<>();
    private static HashMap<String, Object> functions = new HashMap<>();

    public static void run(String program) {
        AstNode tree = createAst(program);
        run(tree);
    }

    private static void run(AstNode tree) {
        if (tree instanceof Block) {
            Block block = (Block) tree;
            for (Statement statement : block.getStatements()) {
                run(statement);
            }
        }
        else if (tree instanceof ExpressionStatement) {
            ExpressionStatement expressionStatement = (ExpressionStatement) tree;
            eval(expressionStatement.getExpression());
        }
        else if (tree instanceof IfStatement) {
            IfStatement ifStatement = (IfStatement) tree;
            if ((boolean)eval(ifStatement.getCondition())) {
                run(ifStatement.getThenBranch());
            } else {
                int i = 0;
                for (IfStatement elseIf : ifStatement.getElseIfBranch()) {
                    if ((boolean)eval(elseIf.getCondition())) {
                        run(elseIf.getThenBranch());
                        i = 1;
                        break;
                    }
                } if (i != 1) {
                    run(ifStatement.getElseBranch());
                }
            }
        }
        else if (tree instanceof WhileStatement) {
            WhileStatement whileStatement = (WhileStatement) tree;
            while ((boolean)eval(whileStatement.getCondition())) {
                run(whileStatement.getBody());
            }
        }
        else if (tree instanceof FunctionDefinition) {
            FunctionDefinition functionDefinition = (FunctionDefinition) tree;
            for (FunctionParameter parameter : functionDefinition.getParameters()) {
                run(parameter);
            }
            run(functionDefinition.getBody());
        }
        else if (tree instanceof FunctionParameter) {
            FunctionParameter functionParameter = (FunctionParameter) tree;
            eval(functionParameter.getVariableName());
        }
        else if (tree instanceof VariableDeclaration) {
            VariableDeclaration variableDeclaration = (VariableDeclaration) tree;
            variables.put(variableDeclaration.getVariableName(), eval(variableDeclaration.getInitializer()));
        }
        else if (tree instanceof Assignment) {
            Assignment assignment = (Assignment) tree;
            variables.put(assignment.getVariableName(), eval(assignment.getExpression()));
        }
        else if (tree instanceof ReturnStatement) {
            ReturnStatement returnStatement = (ReturnStatement) tree;
            eval(returnStatement.getExpression());
        }
        else throw new RuntimeException("Not supported!");
    }

    private static Object eval(String string) {
        return variables.get(string);
    }

    private static Object eval(Expression expression) {
        if (expression instanceof Literal<?>) {
            return ((Literal) expression).getValue();
        }
        else if (expression instanceof Variable) {
            return variables.get(((Variable) expression).getName());
        }
        else if (expression instanceof FunctionCall) {
            FunctionCall functionCall = (FunctionCall) expression;
            String name = functionCall.getFunctionName();
            List<Object> args = new ArrayList<>();
            for (Expression expression1 : functionCall.getArguments()) {
                args.add(eval(expression1));
            }
            if (name.equals("fnPrint")) {
                if (variables.containsKey(args.get(0).toString())) {
                    try {
                        return TEXTGYBuiltins.class.getDeclaredMethod("fnPrint", Object.class).invoke(null,
                                variables.get(args.get(0).toString()));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    return TEXTGYBuiltins.class.getDeclaredMethod("fnPrint", Object.class).invoke(null, args.get(0));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
            else if (name.equals("fnInput")) {
                try {
                    return TEXTGYBuiltins.class.getDeclaredMethod("fnInput", String.class).invoke(null, args.get(0));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
            else if (name.equals("+")){
                boolean d = false;
                for (Object object : args) {
                    if (object.toString().contains(".")) {
                        d = true;
                    }
                }
                if (d) {
                    Double sum = 0.0;
                    for (Object arg : args) {
                        if (arg.toString().contains(".")) {
                            sum += (Double) arg;
                        } else {
                            sum += (Integer) arg;
                        }
                    } return sum;
                } else {
                    Integer left = (Integer) args.get(0);
                    Integer right = (Integer) args.get(1);
                    return left + right;
                }
            }
            else if (name.equals("-")) {
                if (variables.containsKey(args.get(1).toString()) && variables.containsKey(args.get(0).toString())) {
                    Integer left = (Integer) variables.get(args.get(0).toString());
                    Integer right = (Integer) variables.get(args.get(1).toString());
                    return left - right;
                } else if (variables.containsKey(args.get(0).toString())) {
                    Integer left = (Integer) variables.get(args.get(0).toString());
                    Integer right = (Integer) args.get(1);
                    return left - right;
                } else if (variables.containsKey(args.get(1).toString())) {
                    Integer left = (Integer) args.get(0);
                    Integer right = (Integer) variables.get(args.get(1).toString());
                    return left - right;
                }
                boolean d = false;
                for (Object object : args) {
                    if (object.toString().contains(".")) {
                        d = true;
                    }
                }
                if (d) {
                    Double sum = 0.0;
                    for (Object arg : args) {
                        if (arg.toString().contains(".")) {
                            sum -= (Double) arg;
                        } else {
                            sum -= (Integer) arg;
                        }
                    }
                    return sum;
                } else {
                    Integer left = (Integer) args.get(0);
                    Integer right = (Integer) args.get(1);
                    return left - right;
                }
            }
            else if (name.equals(">")) {
                if (variables.containsKey(args.get(0).toString()) && variables.containsKey(args.get(1).toString())) {
                    return (Integer) variables.get(args.get(0).toString()) > (Integer) variables.get(args.get(1).toString());
                } else if (variables.containsKey(args.get(0).toString())) {
                    return (Integer) variables.get(args.get(0).toString()) > (Integer) args.get(1);
                } else if (variables.containsKey(args.get(1).toString())) {
                    return (Integer) args.get(0) > (Integer) variables.get(args.get(1).toString());
                }
                return (Integer) args.get(0) > (Integer) args.get(1);
            } else if (name.equals("!=")) {
                return !args.get(0).equals(args.get(1));
            }
            else if (name.equals("<")) {
                if (variables.containsKey(args.get(0).toString()) && variables.containsKey(args.get(1).toString())) {
                    return (Integer) variables.get(args.get(0).toString()) < (Integer) variables.get(args.get(1).toString());
                } else if (variables.containsKey(args.get(0).toString())) {
                    return (Integer) variables.get(args.get(0).toString()) < (Integer) args.get(1);
                } else if (variables.containsKey(args.get(1).toString())) {
                    return (Integer) args.get(0) < (Integer) variables.get(args.get(1).toString());
                }
            }
            else if (name.equals("<=")) {
                if (variables.containsKey(args.get(0).toString()) && variables.containsKey(args.get(1).toString())) {
                    return (Integer) variables.get(args.get(0).toString()) <= (Integer) variables.get(args.get(1).toString());
                } else if (variables.containsKey(args.get(0).toString())) {
                    return (Integer) variables.get(args.get(0).toString()) <= (Integer) args.get(1);
                } else if (variables.containsKey(args.get(1).toString())) {
                    return (Integer) args.get(0) <= (Integer) variables.get(args.get(1).toString());
                }
            }
            else if (name.equals(">=")) {
                if (variables.containsKey(args.get(0).toString()) && variables.containsKey(args.get(1).toString())) {
                    return (Integer) variables.get(args.get(0).toString()) >= (Integer) variables.get(args.get(1).toString());
                } else if (variables.containsKey(args.get(0).toString())) {
                    return (Integer) variables.get(args.get(0).toString()) >= (Integer) args.get(1);
                } else if (variables.containsKey(args.get(1).toString())) {
                    return (Integer) args.get(0) >= (Integer) variables.get(args.get(1).toString());
                }
            }
            else if (name.equals("==")) {
                if (variables.containsKey(args.get(0).toString()) && variables.containsKey(args.get(1).toString())) {
                    return (Integer) variables.get(args.get(0).toString()) == (Integer) variables.get(args.get(1).toString());
                } else if (variables.containsKey(args.get(0).toString())) {
                    return (Integer) variables.get(args.get(0).toString()) == (Integer) args.get(1);
                } else if (variables.containsKey(args.get(1).toString())) {
                    return (Integer) args.get(0) == (Integer) variables.get(args.get(1).toString());
                }
            }
            else if (name.equals("!=")) {
                if (variables.containsKey(args.get(0).toString()) && variables.containsKey(args.get(1).toString())) {
                    return (Integer) variables.get(args.get(0).toString()) != (Integer) variables.get(args.get(1).toString());
                } else if (variables.containsKey(args.get(0).toString())) {
                    return (Integer) variables.get(args.get(0).toString()) != (Integer) args.get(1);
                } else if (variables.containsKey(args.get(1).toString())) {
                    return (Integer) args.get(0) != (Integer) variables.get(args.get(1).toString());
                }
            }
            else if (name.equals("fnNot")) {
                if (variables.containsKey(args.get(0).toString())) {
                    try {
                        return TEXTGYBuiltins.class.getDeclaredMethod("fnNot", Object.class).invoke(null,
                                variables.get(args.get(0).toString()));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    return TEXTGYBuiltins.class.getDeclaredMethod("fnNot", Object.class).invoke(null, args.get(0));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
            else if (name.equals("fnAnd")) {
                if (variables.containsKey(args.get(0).toString()) && variables.containsKey(args.get(1).toString())) {
                    try {
                        return TEXTGYBuiltins.class.getDeclaredMethod("fnAnd", boolean.class, boolean.class).invoke(null,
                                variables.get(args.get(0).toString()), variables.get(args.get(1).toString()));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                } else if (variables.containsKey(args.get(0).toString()) && !variables.containsKey(args.get(1).toString())){
                    try {
                        return TEXTGYBuiltins.class.getDeclaredMethod("fnAnd", boolean.class, boolean.class).invoke(null,
                                variables.get(args.get(0).toString()), args.get(1));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                } else if (variables.containsKey(args.get(1).toString())) {
                    try {
                        return TEXTGYBuiltins.class.getDeclaredMethod("fnAnd", boolean.class, boolean.class).invoke(null,
                                args.get(0), variables.get(args.get(1).toString()));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        return TEXTGYBuiltins.class.getDeclaredMethod("fnAnd", boolean.class, boolean.class).invoke(null,
                                args.get(0), args.get(1));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                }
            }
            else if (name.equals("fnOr")) {
                if (variables.containsKey(args.get(0).toString()) && variables.containsKey(args.get(1).toString())) {
                    try {
                        return TEXTGYBuiltins.class.getDeclaredMethod("fnOr", boolean.class, boolean.class).invoke(null,
                                variables.get(args.get(0).toString()), variables.get(args.get(1).toString()));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                } else if (variables.containsKey(args.get(0).toString()) && !variables.containsKey(args.get(1).toString())){
                    try {
                        return TEXTGYBuiltins.class.getDeclaredMethod("fnOr", boolean.class, boolean.class).invoke(null,
                                variables.get(args.get(0).toString()), args.get(1));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                } else if (variables.containsKey(args.get(1).toString())) {
                    try {
                        return TEXTGYBuiltins.class.getDeclaredMethod("fnOr", boolean.class, boolean.class).invoke(null,
                                args.get(0), variables.get(args.get(1).toString()));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        return TEXTGYBuiltins.class.getDeclaredMethod("fnOr", boolean.class, boolean.class).invoke(null,
                                args.get(0), args.get(1));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                }
            }
            else if (name.equals("fnUpper")) {
                if (variables.containsKey(args.get(0).toString())) {
                    try {
                        return TEXTGYBuiltins.class.getDeclaredMethod("fnUpper", Object.class).invoke(null,
                                variables.get(args.get(0).toString()));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    return TEXTGYBuiltins.class.getDeclaredMethod("fnUpper", Object.class).invoke(null, args.get(0));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
            else if (name.equals("fnLower")) {
                if (variables.containsKey(args.get(0).toString())) {
                    try {
                        return TEXTGYBuiltins.class.getDeclaredMethod("fnLower", Object.class).invoke(null,
                                variables.get(args.get(0).toString()));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    return TEXTGYBuiltins.class.getDeclaredMethod("fnLower", Object.class).invoke(null, args.get(0));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
            else if (name.equals("fnPwr")) {
                if (variables.containsKey(args.get(0).toString()) && variables.containsKey(args.get(1).toString())) {
                    try {
                        return TEXTGYBuiltins.class.getDeclaredMethod("fnPwr", int.class, int.class).invoke(null,
                                variables.get(args.get(0).toString()), variables.get(args.get(1).toString()));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                } else if (variables.containsKey(args.get(0).toString()) && !variables.containsKey(args.get(1).toString())){
                    try {
                        return TEXTGYBuiltins.class.getDeclaredMethod("fnPwr", int.class, int.class).invoke(null,
                                variables.get(args.get(0).toString()), args.get(1));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                } else if (variables.containsKey(args.get(1).toString())) {
                    try {
                        return TEXTGYBuiltins.class.getDeclaredMethod("fnPwr", int.class, int.class).invoke(null,
                                args.get(0), variables.get(args.get(1).toString()));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        return TEXTGYBuiltins.class.getDeclaredMethod("fnPwr", int.class, int.class).invoke(null,
                                args.get(0), args.get(1));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                }
            }
        } throw new RuntimeException("Usupported!");
    }
}
