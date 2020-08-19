import java.util.*;

public class LongestSubstring {
    public static void main(String[] args){
        String s = "abbaba";
       int a= longestRepeatingSubstring(s);
       System.out.print(a);
    }
    public static int longestRepeatingSubstring(String S) {
        int n = S.length();
        int start = 1;
        int end = n - 1;
        int maxLen = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (search(mid, S)) {
                maxLen = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return maxLen;
    }

    public static boolean search(int len, String S) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i + len <= S.length(); i++) {
            String curr = S.substring(i, i + len);
            if (seen.contains(curr)) {
                return true;
            }
            seen.add(curr);
        }
        return false;
    }
}
