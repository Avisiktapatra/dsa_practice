package InMemoryDB;

import java.util.ArrayList;
import java.util.List;

public class Column {

    private DataType type;
    private String name;
    private List<Constraints> constraints;

    public Column(){
        constraints = new ArrayList<>();
    }

    public Column(DataType type, String name) {
        this.type = type;
        this.name = name;
    }

    public List<Constraints> getConstraints() {
        return constraints;
    }

    public void setConstraints(List<Constraints> constraints) {
        this.constraints = constraints;
    }

    public DataType getType() {
        return type;
    }

    public void setType(DataType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
