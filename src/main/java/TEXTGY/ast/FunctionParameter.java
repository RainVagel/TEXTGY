package TEXTGY.ast;

import java.util.Arrays;
import java.util.List;

public class FunctionParameter extends AstNode implements VariableBinding {
	private String parameterName;
	private String parameterType;

	public FunctionParameter(String parameterName, String parameterType) {
		this.parameterName = parameterName;
		this.parameterType = parameterType;
	}
	
	@Override
	public String getVariableName() {
		return parameterName;
	}

	@Override
	public String getVariableType() {
		return parameterType;
	}

	@Override
	public List<Object> getChildren() {
		return Arrays.asList(parameterName);
	}
}
