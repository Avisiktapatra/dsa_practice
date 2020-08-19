import java.util.ArrayList;
import java.util.List;

public class Replacement {
    public static void main(String[] args){

        String fieldValue = "()_+}|{\":?><,./;'[]\\=-~!@#$%^&*";
        String arr[] = fieldValue.split("");
        String newstr = "";
        for(int i = 0; i < arr.length;i++) {
            String str = arr[i];
            if (str.equals("&"))
                newstr = newstr + "&amp;";
            else if (str.equals("\""))
                newstr = newstr + "&quot;";
            else if (str.equals("\'"))
                newstr = newstr + "&apos;";
            else if (str.equals("<"))
                newstr = newstr + "&lt;";
            else if (str.equals(">"))
                newstr = newstr + "&gt;";
            else
                newstr = newstr + str;

        }


            System.out.println(newstr);
      // List<Character> al = new ArrayList<>();

    }
}
