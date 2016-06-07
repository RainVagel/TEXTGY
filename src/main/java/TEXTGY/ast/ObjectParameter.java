package TEXTGY.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rainvagel on 07.06.16.
 */
public class ObjectParameter extends AstNode implements VariableBinding {
    private String parameterType;
    private List<String> parameter;

    public ObjectParameter(String parameterType, List<String> parameter){
        this.parameterType=parameterType;
        this.parameter=parameter;
    }

    @Override
    public String getVariableType() {
        return parameterType;
    }

    @Override
    public String getVariableName() {
        return parameterType;
    }

    @Override
    public List<Object> getChildren() {
        List<Object> answer = new ArrayList<>();
        for (String s : parameter){
            answer.add(s);
        }
        return answer;
    }
}
