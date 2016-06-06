package TEXTGY.ast;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rainvagel on 06.06.16.
 */
public class Assignment extends Statement {
    private final String variableName;
    private final Expression expression;
    private VariableBinding binding = null;

    public Assignment(String variableName, Expression expression) {
        this.variableName = variableName;
        this.expression = expression;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object)variableName, expression);
    }

    public Expression getExpression() {
        return expression;
    }

    public String getVariableName() {
        return variableName;
    }

    public VariableBinding getBinding() {
        return binding;
    }

    public void setBinding(VariableBinding binding) {
        this.binding = binding;
    }
}
