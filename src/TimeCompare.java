import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeCompare {
    public static void main(String[] args) throws Exception {
        String d1 = "11:00:00";
        String d2 = "12:00:00";


       //   String string = "Oct 19, 2017 9:15:12 PM"; if(d1.compareTo(d2) == 0)
        Date x =dateFormatter(d1);
Date x1 = dateFormatter(d2);
        String start = "09:12:33";
        String end = "12:37:00";
        Date y = dateFormatter(start);
        Date y1 = dateFormatter(end);
        int ct = 0;

        if(start.compareTo(d1) == 0 || start.compareTo(d1) < 0 && end.compareTo(d2)==0 || end.compareTo(d2) > 0)
            ct++;
        System.out.print(ct);
    }

    private static Date dateFormatter(String d1) throws ParseException {
        DateFormat inFormat = new SimpleDateFormat( "hh:mm:ss");
        Date date = inFormat.parse(d1);

        String ans = date.toString().split("\\s")[3].split("\\.")[0];
       return date;
    }
}
