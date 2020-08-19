package InMemoryDB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Row {

      String id;
   HashMap<List<Column>, List<Object>> valuesMap;

    public Row() {
       valuesMap = new HashMap<>();
    }

    public Row(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HashMap<List<Column>, List<Object>> getValuesMap() {
        return valuesMap;
    }

    public void setValuesMap(HashMap<List<Column>, List<Object>> valuesMap) {
        this.valuesMap = valuesMap;
    }
}
