import java.util.*;

public class PalindromeFRom {

    public static String palindromeChecker(String s, List<Integer> startIndex, List<Integer> endIndex, List<Integer> subs) {
        List<Boolean> list = new ArrayList<>();

        String str ="";
        int n = s.length();
        int[][] map = new int[n+1][26];

        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<26;j++)
                map[i+1][j] = map[i][j];

            map[i+1][s.charAt(i) - 'a']++;
        }

        for(int i=0; i<startIndex.size(); i++){
            int start = startIndex.get(i);
            int end = endIndex.get(i);
            int sub = subs.get(i);
            int count = 0;

            for(int j =0; j<26; j++){
                count = count + (map[end+1][j]-map[start][j]) % 2;
            }

            boolean b = count/2 <= sub;
            if(b){
                str = str+"1";

            }
            else{
                str = str+"0";

            }
        }


        return str;
        }


    public static void main(String[] args) {
        int arr[][]= {{1,3,2},{2,3,0},{1,1,0}};
        List<Integer> start = new ArrayList<>();
        start.add(1);
        start.add(2);
        start.add(1);

        List<Integer> end = new ArrayList<>();
        end.add(3);
        end.add(3);
        end.add(1);

        List<Integer> subs = new ArrayList<>();
        subs.add(2);
        subs.add(0);
        subs.add(0);
        String s = "bcba";
        String s1 = palindromeChecker(s, start,  end, subs);
        System.out.println(s1);
    }
}
