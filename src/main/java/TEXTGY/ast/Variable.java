package TEXTGY.ast;

import java.util.Arrays;
import java.util.List;

/**
 * Viide muutujale.
 * 
 * Seda kasutatakse ainult avaldiste kontekstis. St. seda ei saa kasutada näiteks 
 * omistuslause vasakus pooles.
 */
public class Variable extends Expression {
	
	private final String name;
	private VariableBinding binding = null;

	public Variable(String name) {
		this.name = name;
	}

	public Variable(String name, VariableBinding binding) {
		this(name);
		this.binding = binding;
	}

	@Override
	public List<Object> getChildren() {
		return Arrays.asList((Object)name);
	}
	
	public String getName() {
		return name;
	}
	
	public VariableBinding getBinding() {
		return binding;
	}
	
	public void setBinding(VariableBinding binding) {
		this.binding = binding;
	}
}
