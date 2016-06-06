import TEXTGY.TEXTGYLexer;
import TEXTGY.TEXTGYParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by rainvagel on 22.05.16.
 */
public class GrammarPublicTests {

    public static String lastTestDescription = null;
    public static String successMessage = null;

    @Test
    public void omistamineTest() {
        legal("var : Integer X = 123;");
        legal("var : String Tere = \"Tere päevast, kallid lapsed!\";");
        illegal("tere = 293;");
        illegal("Tere = 023;");
        illegal("Tere = 123");
    }

    @Test
    public void avaldisedTest() {
        legal("3 < 4;");
        legal("3==5;");
        illegal("2 + 3 = 5");
        illegal("3<<4");
    }

    @Test
    public void iflauseTest() {
        legal("IF (2 < 3) THEN 2 - 3; END;");

        legal("IF (2 == 4) THEN 2+3; ELSE var : Integer X = 765; END;");

        legal("IF (2 > 4) THEN 2 + 5; ELSE IF (2 != 5) THEN 2 - 1; ELSE 2 * 4; END;");

        illegal("IF () THEN 2 - 3; END;");

        illegal("IF (2 - 3) 5 - 4; END;");

        illegal("IF (2 - 5) THEN x = 3; ELSE IF (2 + 4) ELSE 2 * 1; END;");
    }

    @Test
    public void whilelauseTest() {
        legal("WHILE (3 < 2) DO 2 - 3; END;");
        illegal("WHILE (2 < 3) 2 - 1; END;");
        illegal("WHILE (3 == 3) DO 3-4;");
        illegal("WHILE() DO 2 + 1; END;");
    }

    @Test
    public void functionCreationSimpleTest() {
        legal("CREATE NEW FUNCTION fnEskimo(): 2 - 3; END;");
        legal("CREATE NEW FUNCTION fnEskimo(Integer : X): 2 == 1; END;");
        legal("CREATE NEW FUNCTION fnHello(Integer : X, Boolean : Y): 2 + 1; END;");
        legal("CREATE NEW FUNCTION fnHello() -> Integer: 2 - 1; END;");
        illegal("CREATE NEW FUNCTION fnEskimo(x): 2 == 1; END;");
        illegal("CREATE NEW FUNCTION Eskimo(Integer : X): 2 + 1; END;");
        illegal("CREATE NEW FUNCTION fnEskimo(Integer : X): 2 - 1; ;");
    }

    @Test
    public void functionUseSimpleTest() {
        legal("fnEskimo();");
        legal("fnEskimo(X,Tere);");
        illegal("Eskimo();");
        illegal("fnEskimo(X,);");
        illegal("fnEskimo(,X);");
    }

    @Test
    public void alterSimpleTest() {
        legal("ALTER Eskimo ADD ITEM(Hello);");
        legal("ALTER Eskimo REMOVE ITEM(Hello);");
        legal("ALTER Eskimo HAS ITEM(Hello);");
        legal("ALTER Eskimo HAS ITEM(Hello, Howareyoudoing);");
        legal("ALTER Eskimo ADD SKILL (Damage:20);");
        legal("ALTER Eskimo CHANGE SKILL (Damage : +2);");
        legal("ALTER Eskimo CHANGE SKILL (Damage : 10);");
        legal("ALTER Eskimo CHANGE DESCRIPTION (\"How are you doing?\");");
        illegal("ALTER Eskimo CHANGE SKILL (Damage : \"Hello\");");
        illegal("ALTER Eskimo ADD ITEM(2);");
        illegal("ALTER Eskimo CHANGE DESCRIPTION (2);");
    }

    @Test
    public void ifTreeTest() {
        legal("IF (2 == 2) THEN IF(2 < 3) THEN fnMESSAGE(\"Hello\"); END; 2 + 3; END;");
        legal("IF (2 -2) THEN IF(2 < 3) THEN 2 + 3; ELSE IF(2 == 1) THEN 2; END; ELSE 2*4; END;");
        illegal("IF (2==0) IF(2 != 3) THEN fnMESSAGE(2); END; END;");
    }

    private void check(String program, boolean legal) {
        try {
            System.err.close();
        } catch (Throwable t) {

        }

        boolean parses = true;
        try {
            parseWithExceptions(program);
        } catch (Throwable e) {
            parses = false;
        }

        lastTestDescription = "Katsetan sellise "
                + (legal ? "legaalse" : "mittelegaalse")
                + " programmiga:\n\n>"
                + program.replaceAll("\n", "\n>");


        successMessage = "";

        if (legal) {
            if (!parses) {
                Assert.fail("sinu grammatika ei aktsepteerinud seda");
            } else {
                successMessage = "sinu grammatika aktsepteeris seda";
            }
        }
        else {
            if (parses) {
                Assert.fail("sinu grammatika aktsepteeris seda");
            } else {
                successMessage = "sinu grammatika ei aktsepteerinud seda";
            }
        }
    }

    private void legal(String program){
        check(program, true);
    }

    private void illegal(String program){
        check(program, false);
    }

    private static ParseTree parseWithExceptions(String program) {
        ANTLRInputStream input = new ANTLRInputStream(program);
        TEXTGYLexer lexer = new TEXTGYLexer(input);
        lexer.addErrorListener(new BaseErrorListener(){
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw e;
            }
        });

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TEXTGYParser parser = new TEXTGYParser(tokens);

        parser.addErrorListener(new BaseErrorListener(){
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw e;
            }
        });

        ParseTree parseTree = parser.programm();
        if (parseTree == null
                || parseTree.getChildCount() == 0
                || parser.getNumberOfSyntaxErrors() != 0
                ) {
            throw new RuntimeException("Problem with parsing");
        }
        return parseTree;
    }
}
