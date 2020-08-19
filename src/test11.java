import java.util.*;

public class test11 {
    public static int firstUniqChar(String s) {
        int ans = -1;
        HashMap<Character,Integer> hm = new HashMap();
        char[] arr = s.toCharArray();
        for(char c : arr)
            hm.put(c,hm.getOrDefault(c,0)+1);
        for(int i=0;i<s.length();i++){
            if(hm.get(s.charAt(i))==1) {

                ans = i;
                break;
            }

        }
        return ans;
    }
    public static void main(String[] args){
        int anss = firstUniqChar("loveleetcode");
        System.out.print(anss);

    }
}
