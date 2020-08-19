import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class test23 {

    Set<String> getAllPalindromicSubstring(String str){
        //Your code goes here
        Set<String> hs = new HashSet<>();
        Set<String> im = new HashSet<>();//intermediate
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                hs.add(str.substring(i,j));
                if(isPalindrome(str.substring(i,j)))
                    im.add(str.substring(i,j));
                else if(canFormPalindrome(str.substring(i,j)))
                    im.add(str.substring(i,j));
            }
        }
        return im;
    }
    static boolean isPalindrome(String s){
        if(s.length() == 0 || s.length() == 1) return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
            return isPalindrome(s.substring(1,s.length()-1));
        return false;
    }
    static boolean canFormPalindrome(String s){
        List<Character> al = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(al.contains(s.charAt(i)))
                al.remove((Character)s.charAt(i));
            else al.add(s.charAt(i));
        }
        if(s.length() %2 == 0 && al.isEmpty()|| s.length()%2==1 && al.size()==1) return true;
        else return false;
    }

    //Please do not change the code snippet given below
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input = br.readLine();
            if(input.equals("NULL")) input = null;
            test23 palindromeString = new test23();
            Set<String> substrings = palindromeString.getAllPalindromicSubstring(input);
            if(substrings == null || substrings.isEmpty()) System.out.println("NULL");
            else {
                List<String> list = new ArrayList<>(substrings);
                Collections.sort(list);
                System.out.println(list);
            }
        }
    }
}