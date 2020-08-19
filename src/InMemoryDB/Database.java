package InMemoryDB;

import sun.jvm.hotspot.opto.HaltNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Database {

    public static void main(String [] args){
        Table student = new Table();

        DataType dataType1 = new DataType(Type.INTEGER);
        DataType dataType2 = new DataType(Type.INTEGER);

        List<Row> rows = new ArrayList<>();
        List<Column> columns = new ArrayList<>();
        List<Object> ids = new ArrayList<>();
        List<Object> names = new ArrayList<>();
        List<Object> subjects = new ArrayList<>();
        List<Object> marks = new ArrayList<>();

       ids.add(1); ids.add(2);
       names.add("Rohit"); names.add("Krish");
       subjects.add("maths"); names.add("maths");
       marks.add(23); marks.add(45);


        Row row1 = new Row("1");
        Row row2 = new Row("2");
        Row row3 = new Row("3");
        Row row4 = new Row("4");

        Column column1 = new Column(dataType1, "id");
        Column column2 = new Column(dataType2, "name");
        Column column3 = new Column(dataType2, "subject");
        Column column4 = new Column(dataType1, "marks");

        HashMap<Column, List<Object>> map = new HashMap<>();
        map.put(column1, ids);
        map.put(column2, names);


        columns.add(column1);
        columns.add(column2);
        columns.add(column3);
        columns.add(column4);
        /*row1.setColumns(columns);
        row2.setColumns(columns);
        row3.setColumns(columns);
        row4.setColumns(columns);*/

        rows.add(row1);
        rows.add(row2);
        rows.add(row3);
        rows.add(row4);

        student.setRows(rows);
    }
}
