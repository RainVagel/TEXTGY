package TEXTGY.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rainvagel on 07.06.16.
 */
public class AlterAction extends Statement{
    private String action;
    private String type;
    private List<String> parameters;

    public AlterAction(String action, String type, List<String> parameters){
        this.action = action;
        this.type = type;
        this.parameters = parameters;
    }

    public String getType() {
        return type;
    }

    public List<String> getParameters() {
        return parameters;
    }

    @Override
    public List<Object> getChildren() {
        List<Object> answer = new ArrayList<>();
        answer.add(action);
        answer.add(type);
        for (String s: parameters) {
            answer.add(s);
        } return answer;
    }
}
