package TEXTGY.ast;

import java.util.Arrays;
import java.util.List;

public class FunctionDefinition extends Statement {

	private String name;
	private List<FunctionParameter> params;
	private String type;
	private Block body;

	public FunctionDefinition(String name, String type, List<FunctionParameter> params,
			Block body) {
				this.name = name;
				this.type = type;
				this.params = params;
				this.body = body;
	}
	
	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public List<FunctionParameter> getParameters() {
		return this.params;
	}

	public Block getBody() {
		return body;
	}
	
	@Override
	public List<Object> getChildren() {
		return Arrays.asList(name, type, params, body);
	}

}
