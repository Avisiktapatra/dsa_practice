import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PartitionLabels {

        public static List<Integer> partitionLabels(String S) {
            List<Integer> ans = new ArrayList<Integer>();
            int[] lastIndex = new int[26];
            for(int i =0; i<S.length(); i++)
                lastIndex[S.charAt(i)-'a'] = i;

            int i = 0;
            int end = 0;
           // int ct=0;
            while(i<S.length()){
                end = lastIndex[S.charAt(i)-'a'];
                int j = i;
                while(j!=end){
                    end = Math.max(end, lastIndex[S.charAt(j)-'a']);
                    j++;
                }
                ans.add(j-i+1);
               // ans.add(ct);
                i = j+1;
            }

            return ans;
        }

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        //sc.nextLine();
        for (int i=0;i<testCase;i++){
            String s = sc.nextLine();
           al  = partitionLabels(s);
            System.out.println(al.size());
        }


    }
    }

