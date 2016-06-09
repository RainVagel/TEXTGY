package TEXTGY.ast;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rainvagel on 09.06.16.
 */
public class SkillLiteral extends Expression{
    private String name;
    private Integer value;

    public SkillLiteral(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList(name,value);
    }
}
