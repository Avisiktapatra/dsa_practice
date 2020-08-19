import java.util.*;
import java.util.Map;

public class Test48 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str  = sc.nextLine();

        Test48 s = new Test48();

        int count = s .solution(str);

        System. out. println(" Count :" + count);

    }

    public int solution(String givenCharacter) {

        char[] arr = givenCharacter. toCharArray();

        List<Character> cList = new ArrayList<Character>();

        String b = "BALLOON";

        for (char c : arr) {

            cList.add(c);

        }

        char[] arrBallon = b .toCharArray();

        boolean isRetuen = true;

        int count = 0;

        while (isRetuen) {

            for (int i = 0; i < arrBallon .length; i++) {

                if (cList. contains(arrBallon[i])) {

                    cList. remove((Character) arrBallon[i]);

                } else {

                    isRetuen = false;

                }

            }

            if (isRetuen) {

                count++;

            }

        }

        return count;

    }



}



