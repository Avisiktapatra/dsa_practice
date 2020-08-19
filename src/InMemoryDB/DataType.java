package InMemoryDB;

import java.util.ArrayList;
import java.util.List;

public class DataType {

 private Type dataType;
 List<Constraints> constraints;

    public DataType(Type dataType) {
        this.dataType = dataType;
    }

    public DataType(){
        constraints = new ArrayList<>();
    }

    public Type getDataType() {
        return dataType;
    }

    public void setDataType(Type dataType) {
        this.dataType = dataType;
    }

    public List<Constraints> getConstraints() {
        return constraints;
    }

    public void setConstraints(List<Constraints> constraints) {
        this.constraints = constraints;
    }
}
