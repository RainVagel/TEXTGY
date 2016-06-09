import TEXTGY.ast.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static TEXTGY.TEXTGYBinding.bindVariables;
import static org.junit.Assert.assertEquals;

/**
 * Created by rainvagel on 08.06.16.
 */
public class BindingPublicTests {
    @Test
    public void test0() {
//        Programm on var : Integer X = 3;\n print(X);
        VariableDeclaration vardecX = new VariableDeclaration("X", "Integer", new IntegerLiteral(3));
        Variable variableX = new Variable("X");
        Block program = new Block(Arrays.asList(
                vardecX,
                new ExpressionStatement(new FunctionCall("fnPrint", variableX))
        ));

        bindVariables(program);
        assertEquals(vardecX, variableX.getBinding());
    }

    @Test
    public void test1() {
//        var : Integer X = 2;
//        CREATE NEW FUNCTION fnEskimo(Integer:X) -> Integer:
//        var : Integer X = 4;
//        fnPrint(X)
//        END;
//        fnPrint(X);
        VariableDeclaration vardecX = new VariableDeclaration("X", "Integer", new IntegerLiteral(2));
        VariableDeclaration vardecX2 = new VariableDeclaration("X", "Integer", new IntegerLiteral(4));
        Variable variableX = new Variable("X");
        Variable variableX2 = new Variable("X");
        List<FunctionParameter> parameters = new ArrayList<>();
        parameters.add(new FunctionParameter("X", "Integer"));
        Block program = new Block(Arrays.asList(
                vardecX,
                new FunctionDefinition("fnEskimo", "Integer", parameters, new Block(Arrays.asList(
                        vardecX2,
                        new ExpressionStatement(new FunctionCall("fnPrint", variableX2))
                )
                )
        ),
                new ExpressionStatement(new FunctionCall("fnPrint", variableX))
        ));
        bindVariables(program);
        assertEquals(vardecX, variableX.getBinding());
        assertEquals(vardecX2, variableX2.getBinding());
    }

    @Test
    public void test2() {
//        var : Object Sword = CREATE NEW OBJECT Sword AS TYPE Item WITH DESCRIPTION("Yo") END;
//        var : Object Human = CREATE NEW OBJECT Human AS TYPE Creature WITH ITEM(Sword) END;
        VariableDeclaration vardecSword = new VariableDeclaration("Sword", "Object", new ObjectDefinition("Sword", Arrays.asList(
                new ObjectParameter("fnDescription", new StringLiteral("Yo!"))
        ), "Creature"));
        Variable variable = new Variable("Sword");
        VariableDeclaration vardecHuman = new VariableDeclaration("X", "Object", new ObjectDefinition("X", Arrays.asList(
                new ObjectParameter("fnDescription", new StringLiteral("Hello")), new ObjectParameter("fnItem", variable)
        ), "Creature"));
        Block program = new Block(Arrays.asList(
                vardecSword,
                vardecHuman
        ));
        bindVariables(program);
        assertEquals(vardecSword, variable.getBinding());
    }

    @Test
    public void test3() {
//        var : Object Sword = CREATE NEW OBJECT Sword AS TYPE Item WITH fnDescription("Hello")END;
//        ALTER Sword fnHasItem(Sword);
        VariableDeclaration vardecSword = new VariableDeclaration("Sword", "Object", new ObjectDefinition("Sword", Arrays.asList(
                new ObjectParameter("fnDescription", new StringLiteral("Yo!"))
        ), "Item"));
        Variable variable = new Variable("Sword");
        Block program = new Block(Arrays.asList(
                vardecSword,
                new ExpressionStatement(new AlterAction("X", "fnHasItem", variable))
        ));
        bindVariables(program);
        assertEquals(vardecSword, variable.getBinding());
    }
}
