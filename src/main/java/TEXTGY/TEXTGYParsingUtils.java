package TEXTGY;

import TEXTGY.ast.*;
import TEXTGY.TEXTGYParser.*;
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

    public static AstNode createAst(String program) throws Exception{
        return parseTreeToAst(createParseTree(program));
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

    private static AstNode parseTreeToAst(ParseTree parseTree) throws Exception{
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
            Block body = (Block) parseTreeToAst(parseTree.getChild(parseTree.getChildCount() - 1));
            List<FunctionParameter> params = new ArrayList<>();

            if (parseTree.getText().contains("->")){
                for (int i = 5; i < parseTree.getChildCount() - 6; i += 4) {
                    params.add(new FunctionParameter(parseTree.getChild(i + 2).getText(),
                            parseTree.getChild(i).getText()));
                }
            } else {
                for (int i = 5; i < parseTree.getChildCount() - 4; i += 4) {
                    params.add(new FunctionParameter(parseTree.getChild(i + 2).getText(),
                            parseTree.getChild(i).getText()));
                }
            }
            return new FunctionDefinition(name, params, body);
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
        else {
            return parseTreeToAst(parseTree.getChild(0));
        }
//        throw new Exception();
    }

    public static void main(String[] args) {
        createParseTree("CREATE NEW FUNCTION fnEskimo(): 2 - 3; END;");
    }
}