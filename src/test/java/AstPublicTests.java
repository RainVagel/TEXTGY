import TEXTGY.TEXTGYParsingUtils;
import TEXTGY.ast.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by rainvagel on 06.06.16.
 */
public class AstPublicTests {
    @Test
    public void variableDeclTest() {
        //var : Integer X = 2;
        assertEquals(
                new Block(Arrays.asList(new VariableDeclaration("X", "Integer", new IntegerLiteral(2)))),
                TEXTGYParsingUtils.createAst("var : Integer X = 2;")
        );

        //var : Integer x
        assertEquals(
                new Block(Arrays.asList(new VariableDeclaration("X", "Integer", null))),
                TEXTGYParsingUtils.createAst("var : Integer X;")
        );

        //var X = 2;
        assertEquals(
                new Block(Arrays.asList(new VariableDeclaration("X", null, new IntegerLiteral(2)))),
                TEXTGYParsingUtils.createAst("var X = 2;")
        );
    }

    @Test
    public void assignmentTest() {
        //X = 2;
        assertEquals(
                new Block(Arrays.asList(new Assignment("X", new IntegerLiteral(2)))),
                TEXTGYParsingUtils.createAst("X = 2;")
        );
    }

    @Test
    public void functCreateTest(){
//        CREATE NEW FUNCTION fnEskimo():2;END;
        assertEquals(
                new Block(Arrays.asList(new FunctionDefinition("fnEskimo", null, new ArrayList<FunctionParameter>(),
                        new Block(Arrays.asList(new ExpressionStatement(new IntegerLiteral(2))))))),
                TEXTGYParsingUtils.createAst("CREATE NEW FUNCTION fnEskimo():2;END;")
        );

//        CREATE NEW FUNCTION fnEskimo() -> Integer:2;END;
        assertEquals(
                new Block(Arrays.asList(new FunctionDefinition("fnEskimo", "Integer", new ArrayList<FunctionParameter>(),
                        new Block(Arrays.asList(new ExpressionStatement(new IntegerLiteral(2))))))),
                TEXTGYParsingUtils.createAst("CREATE NEW FUNCTION fnEskimo() -> Integer: 2; END;")
        );

//        CREATE NEW FUNCTION fnEskimo(Integer : X) -> Integer: 2; END;
        assertEquals(
                new Block(Arrays.asList(new FunctionDefinition("fnEskimo", "Integer", Arrays.asList(new FunctionParameter("X", "Integer")),
                        new Block(Arrays.asList(new ExpressionStatement(new IntegerLiteral(2))))))),
                TEXTGYParsingUtils.createAst("CREATE NEW FUNCTION fnEskimo(Integer:X) -> Integer: 2; END;")
        );
    }

    @Test
    public void objCreateTest(){
//        CREATE NEW OBJECT X AS TYPE Creature WITH DESCRIPTION("Hey")END;
        assertEquals(
                new Block(Arrays.asList(new ObjectDefinition("X", Arrays.asList(new ObjectParameter("Description",Arrays.asList("Hey"))), "Creature"))),
                TEXTGYParsingUtils.createAst("CREATE NEW OBJECT X AS TYPE Creature WITH DESCRIPTION(\"Hey\")END;")
        );
    }

}
