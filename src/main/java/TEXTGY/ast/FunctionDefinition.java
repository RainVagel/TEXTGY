package TEXTGY.ast;

import java.util.Arrays;
import java.util.List;

public class FunctionDefinition extends Statement {

	private String name;
	private List<FunctionParameter> params;
	private Block body;

	public FunctionDefinition(String name, List<FunctionParameter> params,
			Block body) {
				this.name = name;
				this.params = params;
				this.body = body;
	}
	
	public String getName() {
		return name;
	}
	
	public List<FunctionParameter> getParameters() {
		return this.params;
	}

	public Block getBody() {
		return body;
	}
	
	@Override
	public List<Object> getChildren() {
		return Arrays.asList(name, params, body);
	}

}
