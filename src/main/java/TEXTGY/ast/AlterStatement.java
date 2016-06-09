package TEXTGY.ast;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rainvagel on 07.06.16.
 */
public class AlterStatement extends AstNode {
    private String name;
    private AlterAction action;

    public AlterStatement(String name, AlterAction action) {
        this.name = name;
        this.action = action;
    }

    public AlterAction getAction() {
        return action;
    }

    public String getName() {
        return name;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList(name, action);
    }
}
