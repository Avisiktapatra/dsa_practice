import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution2 {

    public static void main(String[] args){
        String digits = "23";
        List<String> ans = letterCombinations("23");
        for(String s: ans)
            System.out.print(s +" ");
    }
    public static List<String> letterCombinations(String digits) {
        Map<String, String> hm = new HashMap<String, String>();
        hm.put("2", "abc");
        hm.put("3", "def");
        hm.put("4", "ghi");
        hm.put("5", "jkl");
        hm.put("6", "mno");
        hm.put("7", "pqrs");
        hm.put("8", "tuv");
        hm.put("9", "wxyz");
        List<String> al = new ArrayList();
        dfs(digits, al, hm, 0, "");
        return al;
    }

    public static void dfs(String digits,List<String> al, Map<String, String> hm, int start, String str){
        if(start == digits.length())
            al.add(str);
        else{
            String w= String.valueOf(digits.charAt(start));
            String word = hm.get(w);
            for(int i=0;i<word.length();i++){
                dfs(digits,al,hm,start+1,str+word.charAt(i));
                //str = str.replace(String.valueOf(str.charAt(str.length()-1)), "");
            }
        }
    }
}
