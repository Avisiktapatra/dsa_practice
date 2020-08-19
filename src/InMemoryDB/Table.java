package InMemoryDB;

import java.util.ArrayList;
import java.util.List;

public class Table {

private List<Row> rows;
private List<Column> columns;

public Table(){
    rows = new ArrayList<>();
}

public Table(List<Row> rows) {
        this.rows = rows;
}

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }
}
