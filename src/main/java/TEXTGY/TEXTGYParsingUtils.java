package TEXTGY;

import TEXTGY.TEXTGYParser.*;
import TEXTGY.ast.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rainvagel on 06.06.16.
 */
public class TEXTGYParsingUtils {

    public static AstNode createAst(String program) {
//        System.out.println(parseTreeToAst(createParseTree(program)));
        ParseTree tree = createParseTree(program);
        return parseTreeToAst(tree);
    }

    private static ParseTree createParseTree(String program) {
        ANTLRInputStream antlrInput = new ANTLRInputStream(program);
        TEXTGYLexer lexer = new TEXTGYLexer(antlrInput);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TEXTGYParser parser = new TEXTGYParser(tokens);
        ParseTree tree = parser.programm();
        System.out.println(tree.toStringTree(parser));
        return tree;
    }

    private static AstNode parseTreeToAst(ParseTree parseTree) {
        if (parseTree instanceof ArvuLiteraalRContext) {
            if (parseTree.getText().contains(".")) return new FloatingPointLiteral(Double.parseDouble(parseTree.getText()));
            else return new IntegerLiteral(Integer.parseInt(parseTree.getText()));
        }
        else if (parseTree instanceof SoneLiteraalRContext) {
            return new StringLiteral(parseTree.getText().substring(1, parseTree.getText().length() - 1));
        }
        else if (parseTree instanceof MuutujaNimiRContext) {
            return new Variable(parseTree.getText());
        }
        else if (parseTree instanceof SuluAvaldisContext) {
            return parseTreeToAst(parseTree.getChild(1));
        }
        else if (parseTree instanceof FunktsiooniloomineContext) {
            String name = parseTree.getChild(3).getText();
            String type;
            Block body = (Block) parseTreeToAst(parseTree.getChild(parseTree.getChildCount() - 2));
            List<FunctionParameter> params = new ArrayList<>();

            if (parseTree.getText().contains("->")){
                type = parseTree.getChild(parseTree.getChildCount() - 4).getText();
                for (int i = 5; i < parseTree.getChildCount() - 6; i += 4) {
                    params.add(new FunctionParameter(parseTree.getChild(i + 2).getText(),
                            parseTree.getChild(i).getText()));
                }
            } else {
                type = null;
                for (int i = 5; i < parseTree.getChildCount() - 4; i += 4) {
                    params.add(new FunctionParameter(parseTree.getChild(i + 2).getText(),
                            parseTree.getChild(i).getText()));
                }
            }
            return new FunctionDefinition(name, type, params, body);
        }
        else if (parseTree instanceof TagastuslauseContext) {
            return new ReturnStatement((Expression)parseTreeToAst(parseTree.getChild(1)));
        }
        else if (parseTree instanceof FunktsiooniValjakutseContext) {
            String functionName = parseTree.getChild(0).getText();

            List<Expression> args = new ArrayList<>();

            if (parseTree.getChildCount() > 3) {
                for (int i = 2; i < parseTree.getChildCount(); i += 2) {
                    args.add((Expression)parseTreeToAst(parseTree.getChild(i)));
                }
            }
            return new FunctionCall(functionName, args);
        }
        else if (parseTree instanceof UnaarneMiinusContext) {
            Expression arg = (Expression) parseTreeToAst(parseTree.getChild(1));
            return new FunctionCall("-", Arrays.asList(arg));
        }
        else if (parseTree instanceof KorrutamineJagamineContext
                | parseTree instanceof LiitmineLahutamineContext
                | parseTree instanceof VordlemineContext) {
            String operator = parseTree.getChild(1).getText();
            Expression leftArg = (Expression) parseTreeToAst(parseTree.getChild(0));
            Expression rightArg = (Expression) parseTreeToAst(parseTree.getChild(2));
            return new FunctionCall(operator, Arrays.asList(leftArg,rightArg));
        }
        else if (parseTree instanceof AlterlauseContext) {
            String type = parseTree.getChild(1).getText();
            Statement action = (Statement) parseTreeToAst(parseTree.getChild(2));
            return new AlterStatement(type, action);
        }
        else if (parseTree instanceof HasItemContext){
            String type = "ITEM";
            List<String> args = new ArrayList<>();
            for (int i = 3; i < parseTree.getChildCount()-1;i+=2){
                args.add(parseTree.getChild(i).getText());
            }
            return new AlterAction("HAS",type, args);
        }
        else if (parseTree instanceof HasAttributeContext){
            String type = "ATTRIBUTE";
            List<String> args = new ArrayList<>();
            for (int i = 3; i < parseTree.getChildCount()-1;i+=2){
                args.add(parseTree.getChild(i).getText());
            }
            return new AlterAction("HAS", type, args);
        }
        else if (parseTree instanceof HasSkillContext){
            String type = "SKILL";
            List<String> args = new ArrayList<>();
            for (int i = 3; i < parseTree.getChildCount()-1;i+=2){
                args.add(parseTree.getChild(i).getText());
            }
            return new AlterAction("HAS", type, args);
        }
        else if (parseTree instanceof AddAttributeContext){
            String type = "ATTRIBUTE";
            List<String> args = new ArrayList<>();
            for (int i = 3; i < parseTree.getChildCount()-1;i+=2){
                args.add(parseTree.getChild(i).getText());
            }
            return new AlterAction("ADD", type, args);
        }
        else if (parseTree instanceof AddItemContext){
            String type = "ITEM";
            List<String> args = new ArrayList<>();
            for (int i = 3; i < parseTree.getChildCount()-1;i+=2){
                args.add(parseTree.getChild(i).getText());
            }
            return new AlterAction("ADD", type, args);
        }
        else if (parseTree instanceof AddSkillContext){
            String type = "SKILL";
            List<String> args = new ArrayList<>();
            for (int i = 3; i < parseTree.getChildCount()-1;i+=4){
                String entry = parseTree.getChild(i).getText() + ":" +
                        parseTree.getChild(i+2).getText();
                args.add(entry);
            }
            return new AlterAction("ADD", type, args);
        }
        else if (parseTree instanceof RemoveAttributeContext) {
            String type = "ATTRIBUTE";
            List<String> args = new ArrayList<>();
            for (int i = 3; i < parseTree.getChildCount()-1;i+=2){
                args.add(parseTree.getChild(i).getText());
            }
            return new AlterAction("REMOVE", type, args);
        }
        else if (parseTree instanceof RemoveItemContext) {
            String type = "ITEM";
            List<String> args = new ArrayList<>();
            for (int i = 3; i < parseTree.getChildCount()-1;i+=2){
                args.add(parseTree.getChild(i).getText());
            }
            return new AlterAction("REMOVE", type, args);
        }
        else if (parseTree instanceof RemoveSkillContext) {
            String type = "SKILL";
            List<String> args = new ArrayList<>();
            for (int i = 3; i < parseTree.getChildCount()-1;i+=2){
                args.add(parseTree.getChild(i).getText());
            }
            return new AlterAction("REMOVE", type, args);
        }
        else if (parseTree instanceof ChangeDescriptionContext) {
            String type = "DESCRIPTION";
            List<String> args = new ArrayList<>();
            args.add(parseTree.getChild(3).getText().substring(1, parseTree.getChild(3).getText().length()-1));
            return new AlterAction("CHANGE", type, args);
        }
        else if (parseTree instanceof ChangeSkillPlusMinusContext) {
            String type = "SKILL";
            List<String> args = new ArrayList<>();
            for (int i = 3; i < parseTree.getChildCount()-1;i+=5){
                String entry = parseTree.getChild(i).getText() + ':' + parseTree.getChild(i+2).getText()
                        + parseTree.getChild(i+3).getText();
                args.add(entry);
            }
            return new AlterAction("CHANGE", type, args);
        }
        else if (parseTree instanceof ChangeSkillRegularContext) {
            String type = "SKILL";
            List<String> args = new ArrayList<>();
            for (int i = 3; i < parseTree.getChildCount()-1;i+=4){
                String entry = parseTree.getChild(i).getText() + ':' + parseTree.getChild(i+2).getText();
                args.add(entry);
            }
            return new AlterAction("CHANGE", type, args);
        }
        else if (parseTree instanceof MuutujadeklaratsioonContext) {
            String name;
            String type;

            Expression start = null;

            //Type and expression
            if (parseTree.getChildCount() == 6) {
                name = parseTree.getChild(3).getText();
                type = parseTree.getChild(2).getText();
                start = (Expression) parseTreeToAst(parseTree.getChild(5));
            }
            //Type, but no expression
            else if (parseTree.getChildCount() == 4 && parseTree.getChild(1).getText().contains(":")){
                name = parseTree.getChild(3).getText();
                type = parseTree.getChild(2).getText();
            }
            //No type, but expression
            else {
                name = parseTree.getChild(1).getText();
                type = null;
                start = (Expression) parseTreeToAst(parseTree.getChild(3));
            }
            return new VariableDeclaration(name, type, start);
        }
        else if (parseTree instanceof OmistamineContext) {
            String name = parseTree.getChild(0).getText();
            Expression expression = (Expression) parseTreeToAst(parseTree.getChild(2));
            return new Assignment(name, expression);
        }
        else if (parseTree instanceof WhilelauseContext) {
            Expression expression = (Expression) parseTreeToAst(parseTree.getChild(2));
            Statement statement = (Statement) parseTreeToAst(parseTree.getChild(5));
            return new WhileStatement(expression,statement);
        }
        else if (parseTree instanceof IflauseContext) {
//            Arvestada juhul, kui lihtsalt if
//            Juhul, kui if ja else
//            Juhul, kui if ja else if
//            Juhul, kui if, else if ja else
            Expression expression = (Expression) parseTreeToAst(parseTree.getChild(2));
            Statement thenBranch = (Statement)parseTreeToAst(parseTree.getChild(5));
            List<IfStatement> elseIfBranch = new ArrayList<>();
            Statement elseBranch;
            //Just IF, no ELSE
            if (parseTree.getChildCount() == 7) {
                elseBranch = null;
            }
            // IF and ELSE
            else if (parseTree.getChildCount() == 9) {
                elseBranch = (Statement) parseTreeToAst(parseTree.getChild(7));
            }
            // IF, ELSE IF and ELSE
            else if (parseTree.getChild(parseTree.getChildCount()-3).getText().contains("ELSE")){
                elseBranch = (Statement) parseTreeToAst(parseTree.getChild(parseTree.getChildCount()-2));
                for (int i = 6; i < parseTree.getChildCount() - 1; i += 6) {
                    Expression elseIfExpression = (Expression) parseTreeToAst(parseTree.getChild(i+2));
                    Statement elseIfThen = (Statement) parseTreeToAst(parseTree.getChild(i+5));
                    elseIfBranch.add(new IfStatement(elseIfExpression,elseIfThen, null, null));

                }
            }
            // IF and ELSE IF
            else {
                elseBranch = null;
                for (int i = 6; i < parseTree.getChildCount(); i += 6) {
                    Expression elseIfExpression = (Expression) parseTreeToAst(parseTree.getChild(i+2));
                    Statement elseIfThen = (Statement) parseTreeToAst(parseTree.getChild(i+5));
                    elseIfBranch.add(new IfStatement(elseIfExpression,elseIfThen, null, null));
                }
            }
            return new IfStatement(expression, thenBranch, elseIfBranch, elseBranch);
        }
        else if (parseTree instanceof ObjektiloomineContext) {
            String name = parseTree.getChild(3).getText();
            String type = parseTree.getChild(6).getText();
            ArrayList<ObjectParameter> parameterArrayList = new ArrayList<>();
            for (int i = 8; i < parseTree.getChildCount() - 1; i+=2) {
                parameterArrayList.add((ObjectParameter) parseTreeToAst(parseTree.getChild(i)));
            }
            return new ObjectDefinition(name, parameterArrayList, type);
        }
        else if (parseTree instanceof DescriptionParameeterContext) {
            String type = parseTree.getChild(0).getText();
            String parameter = parseTree.getChild(2).getText().substring(1, parseTree.getChild(2).getText().length()-1);
            return new ObjectParameter(type, Arrays.asList(parameter));
        }
        else if (parseTree instanceof SkillParameeterContext) {
            String type = parseTree.getChild(0).getText();
            List<String> parameters = new ArrayList<>();
            for ( int i = 2; i < parseTree.getChildCount()-1; i += 4){
                parameters.add(parseTree.getChild(i).getText() + ":" + parseTree.getChild(i+2).getText());
            }
            return new ObjectParameter(type, parameters);
        }
        else if (parseTree instanceof AttributeParameeterContext | parseTree instanceof ItemParameeterContext) {
            String type = parseTree.getChild(0).getText();
            List<String> parameters = new ArrayList<>();
            for (int i = 2; i < parseTree.getChildCount()-1; i+=2) {
                parameters.add(parseTree.getChild(i).getText());
            }
            return new ObjectParameter(type, parameters);
        }
        else if (parseTree instanceof LausetejadaContext) {
            ArrayList<Statement> statementArrayList = new ArrayList<>();
            for (int i = 0; i <= parseTree.getChildCount(); i++) {
                if (parseTree.getChild(i) instanceof LauseContext) {
                    statementArrayList.add((Statement) parseTreeToAst(parseTree.getChild(i)));
                }
            }
            return new Block(statementArrayList);
        }
        else if (parseTree instanceof LauseContext) {
            if (parseTree.getChildCount() == 1) {
                AstNode child = parseTreeToAst(parseTree.getChild(0));
                if (child instanceof Expression) {
                    return new ExpressionStatement((Expression) child);
                }
                else {
                    return child;
                }
            } else {
                assert parseTree.getChildCount() == 2;
                return parseTreeToAst(parseTree.getChild(0));
            }
        }
        else {
            return parseTreeToAst(parseTree.getChild(0));
        }
//        throw new Exception("UnsupportedOperandException");
    }

    public static void main(String[] args) {
        System.out.println(createAst("ALTER X CHANGE SKILL(Damage: -2);"));
    }
}