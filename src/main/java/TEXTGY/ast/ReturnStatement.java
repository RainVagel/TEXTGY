package TEXTGY.ast;

import java.util.Arrays;
import java.util.List;

public class ReturnStatement extends Statement {
	private final Expression expression;
	
	public ReturnStatement(Expression expression) {
		this.expression = expression;
	}
	
	public Expression getExpression() {
		return expression;
	}
	
	@Override
	public List<Object> getChildren() {
		return Arrays.asList(expression);
	}

}
