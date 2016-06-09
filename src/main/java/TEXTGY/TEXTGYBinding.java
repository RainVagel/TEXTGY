package TEXTGY;

import TEXTGY.ast.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rainvagel on 07.06.16.
 */
public class TEXTGYBinding {

    public static void bindVariables(AstNode node){
        Map<String, VariableBinding> visibleDeclarations = new HashMap<>();
        Map<String, String> visibleTypes = new HashMap<>();
        bindVariables(node, visibleDeclarations, visibleTypes);
    }

    private static void bindVariables(AstNode node, Map<String, VariableBinding> bindingMap,
                                      Map<String, String> visibleTypes) {
        if (node instanceof VariableDeclaration) {
            VariableDeclaration declaration = (VariableDeclaration) node;
            bindingMap.put(declaration.getVariableName(), declaration);
            visibleTypes.put(declaration.getVariableName(), declaration.getVariableType());
            if (((VariableDeclaration) node).getInitializer() instanceof ObjectDefinition) {
                bindVariables(((VariableDeclaration) node).getInitializer(), bindingMap, visibleTypes);
            }
        }
        else if (node instanceof Variable) {
            Variable var = (Variable) node;
            var.setBinding(bindingMap.get(var.getName()));
        }
        else if (node instanceof Assignment) {
            Assignment assignment = (Assignment) node;
            assignment.setBinding(bindingMap.get(assignment.getVariableName()));
            bindVariables(assignment.getExpression(), bindingMap, visibleTypes);
        }
        else if (node instanceof Block) {
            HashMap<String, VariableBinding> blockBindings = new HashMap<>(bindingMap);
            for (Statement statement : ((Block) node).getStatements()) {
                bindVariables(statement, blockBindings, visibleTypes);
            }
        }
        else if (node instanceof FunctionDefinition) {
            Map<String, VariableBinding> funBindings = new HashMap<>(bindingMap);
            for (FunctionParameter parameter : ((FunctionDefinition) node).getParameters()) {
                funBindings.put(parameter.getVariableName(), parameter);
            }
            for (Statement statement : ((FunctionDefinition) node).getBody().getStatements()) {
                bindVariables(statement, funBindings, visibleTypes);
            }
        }
        else if (node instanceof AlterAction) {
            for (Expression expression : ((AlterAction) node).getParameters()) {
                bindVariables(expression, bindingMap, visibleTypes);
            }
        }
        else if (node instanceof ObjectDefinition) {
            for (ObjectParameter parameter : ((ObjectDefinition) node).getParameterList()) {
                bindVariables(parameter, bindingMap, visibleTypes);
            }
        }
        else {
            List<Object> children = node.getChildren();
            for (Object child : children) {
                if (child instanceof AstNode) {
                    AstNode childNode = (AstNode) child;
                    bindVariables(childNode, bindingMap, visibleTypes);
                }
            }
        }
    }

    public static void main(String[] args) {
        bindVariables(new Block(Arrays.asList(
                new VariableDeclaration("Sword", "Object", new ObjectDefinition("Sword", Arrays.asList(
                        new ObjectParameter("fnDescription", new StringLiteral("Yo!"))
                ), "Creature")),
                new VariableDeclaration("X", "Object", new ObjectDefinition("X", Arrays.asList(
                        new ObjectParameter("fnDescription", new StringLiteral("Hello")), new ObjectParameter("fnItem", new Variable("Sword"))
                ), "Creature"))
        )));
//        bindVariables(new Block(Arrays.asList(
//                new VariableDeclaration("X", "Integer", new IntegerLiteral(3)),
//                new ExpressionStatement(new FunctionCall("fnPrint", new Variable("X")))
//        )));
    }
}
