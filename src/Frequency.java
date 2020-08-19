import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Frequency {
    public static void main(String[]args){
       String paragraph = "abc abc? abcd the jeff!" ;

        String [] banned = {"abc","abcd","jeff"};
        String[] words = paragraph.toLowerCase().split("[ !?',;.]+");

        HashMap<String,Integer> hs = new HashMap<>();
        for(String word : words) hs.put(word, hs.getOrDefault(word, 0) + 1);
        for(String word : banned) if(hs.containsKey(word)) hs.remove(word);
        String res = null;
        for(String word : hs.keySet())
            if(res == null || hs.get(word) > hs.get(res))
                res = word;

        System.out.println(res);
    }
}
