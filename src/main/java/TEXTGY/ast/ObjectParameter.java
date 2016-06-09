package TEXTGY.ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rainvagel on 07.06.16.
 */
public class ObjectParameter extends Expression {
    private String parameterType;
    private List<Expression> parameter;

    public ObjectParameter(String parameterType, List<Expression> parameter){
        this.parameterType=parameterType;
        this.parameter=parameter;
    }

    public ObjectParameter(String functionName, Expression... arguments) {
        this(functionName, Arrays.asList(arguments));
    }


    @Override
    public List<Object> getChildren() {
        List<Object> result = new ArrayList<>();
        result.add(this.parameterType);
        result.addAll(this.parameter);
        return result;
    }

    public String getParameterType() {
        return parameterType;
    }

    public List<Expression> getParameter() {
        return parameter;
    }
}
