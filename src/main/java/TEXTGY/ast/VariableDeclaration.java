package TEXTGY.ast;

import java.util.Arrays;
import java.util.List;

/**
 * Muutuja deklaratsioon
 */
public class VariableDeclaration extends Statement implements VariableBinding {
	private final String variableName;
	private final String variableType;
	private final Expression initializer;

	/**
	 * @param variableName muutuja nimi.
	 * @param initializer võib olla {@code null}.
	 */
	public VariableDeclaration(String variableName, String variableType, Expression initializer) {
		this.variableName = variableName;
		this.variableType = variableType;
		this.initializer = initializer;
	}

	@Override
	public List<Object> getChildren() {
		return Arrays.asList((Object)variableName, initializer);
	}
	
	@Override
	public String getVariableName() {
		return variableName;
	}

	public String getVariableType() {
		return variableType;
	}

	/**
	 * @return Võib tagastada {@code null}.
	 */
	public Expression getInitializer() {
		return initializer;
	}

	@Override
	public String toString() {
		return "VariableDeclaration("+ "\""+this.getVariableName()+"\"" + ", "+ this.getVariableType()
				+ ", "+ this.getInitializer() + ")";
	}
}
