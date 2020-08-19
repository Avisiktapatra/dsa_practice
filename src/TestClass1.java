import java.util.*;
    class TestClass1 {
        public static void main(String args[] ) throws Exception {

            Scanner s = new Scanner(System.in);
            int testcase = s.nextInt();
           /* String s1 = "abcdbc";
            String s2 = "adxxyy";*/
           boolean ans = false;

            for (int i = 0; i < testcase; i++) {
                Scanner sc2 = new Scanner(System.in);
                String s1 = s.nextLine();
                String s2 = s.nextLine();
                 ans = checkOccurence(s1, s2);
                if (ans == true)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }

            }

        public static boolean checkOccurence(String s1, String s2){
            HashMap<Character, Integer> h1 = new HashMap();
            if(s1.length() != s2.length())
                return false;
            for(int j = 0; j<s1.length();j++){
                h1.put(s1.charAt(j), h1.getOrDefault(s1.charAt(j),0)+1);
                h1.put(s2.charAt(j), h1.getOrDefault(s2.charAt(j),0)+1);
            }
            for(Map.Entry<Character, Integer> e : h1.entrySet()){
                if(e.getValue() % 2 != 0)
                    return false;

            }
            return true;
        }

}
