package TEXTGY.ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rainvagel on 07.06.16.
 */
public class AlterAction extends Expression{
    private String objectName;
    private String functionName;
    private List<Expression> parameters;

    public AlterAction(String objectName, String functionName, List<Expression> parameters){
        this.objectName = objectName;
        this.functionName = functionName;
        this.parameters = parameters;
    }

    public AlterAction(String objectName, String functionName, Expression... parameters) {
        this.objectName = objectName;
        this.functionName = functionName;
        this.parameters = Arrays.asList(parameters);
    }

    public List<Expression> getParameters() {
        return parameters;
    }

    public String getFunctionName() {
        return functionName;
    }

    public String getObjectName() {
        return objectName;
    }

    @Override
    public List<Object> getChildren() {
        List<Object> answer = new ArrayList<>();
        answer.add(this.objectName);
        answer.add(this.functionName);
        answer.addAll(this.parameters);
        return answer;
    }
}
