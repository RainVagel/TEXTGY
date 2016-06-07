package TEXTGY.ast;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rainvagel on 07.06.16.
 */
public class ObjectDefinition extends Statement {
    private String name;
    private List<ObjectParameter> parameterList;
    private String type;

    public ObjectDefinition(String name, List<ObjectParameter> parameterList, String type) {
        this.name = name;
        this.parameterList = parameterList;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public List<ObjectParameter> getParameterList() {
        return parameterList;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList(name, parameterList, type);
    }
}
