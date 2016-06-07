package TEXTGY.ast;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rainvagel on 07.06.16.
 */
public class AlterStatement extends Statement {
    private String name;
    private Statement action;

    public AlterStatement(String name, Statement action) {
        this.name = name;
        this.action = action;
    }

    public Statement getAction() {
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
