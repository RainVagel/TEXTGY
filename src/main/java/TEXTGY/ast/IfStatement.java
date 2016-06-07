package TEXTGY.ast;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * If-lause
 */
public class IfStatement extends Statement {
	
	private final Expression condition;
	private final Statement thenBranch;
	private final Statement elseBranch;
	private final List<IfStatement> elseIfBranch;

	public IfStatement(Expression condition, Statement thenBranch, List<IfStatement> elseIfBranch,
					   Statement elseBranch) {
		this.condition = condition;
		this.thenBranch = thenBranch;
		this.elseIfBranch = elseIfBranch;
		this.elseBranch = elseBranch;
	}

	@Override
	public List<Object> getChildren() {
		return Arrays.asList((Object)condition, thenBranch, elseBranch);
	}
	
	public Expression getCondition() {
		return condition;
	}
	
	public Statement getThenBranch() {
		return thenBranch;
	}

	public List<IfStatement> getElseIfBranch() {
		return Collections.unmodifiableList(elseIfBranch);
	}
	
	public Statement getElseBranch() {
		return elseBranch;
	}
}
