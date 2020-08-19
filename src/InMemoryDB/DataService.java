package InMemoryDB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataService {

    public void insertRow(Table table, List<Object> values){

        List<Row> rows = table.getRows();
        for(Row rowElement : rows){
            List<Object> value = new ArrayList<>();
            HashMap<List<Column>, List<Object>> map = rowElement.getValuesMap();
            for(Map.Entry<List<Column>, List<Object>> entry : map.entrySet()){
                mapRecordsRowWise(entry, values);
            }
        }
    }

    public void mapRecordsRowWise(Map.Entry<List<Column>, List<Object>> entry, List<Object> values){
        List<Column> column = entry.getKey();
        if(column == null || column.size() < 1){
            List<Column> al = new ArrayList<>();

        }

    }
}
