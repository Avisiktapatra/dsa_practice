import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MaximumCount {
    public static void main(String [] args) {

        int a[] = {10, 7, 8, 15, 200};
        int b[] = {15, 8, 10, 17, 300};
        int c[] = {10, 2, 7};
        int max = 20;
        int sum = 0;

        ArrayList<Integer> al = new ArrayList<>();
        if (a.length == b.length){
            for(int i =0; i<a.length;i++){
                int diff = b[i] - a[i];
                al.add(diff);
            }
            HashMap<Integer,Integer> hm = new HashMap<>();

for(int j=0; j<c.length;j++)
{

}
        }

        List<Integer> al1 = new ArrayList<>();
        Collections.sort(al);
        for(int k=0;k<al.size();k++){
            sum = sum + al.get(k);
            al1.add(k);
        if(sum > max){
            break;
        }}

      int ans = al1.size()-1    ;
        System.out.println(ans);
    }

    public static int getMax(ArrayList<Integer> al, int sum, int max) {

        if (al.size() > 0) {
            if (sum > max) {
                sum = sum - al.get(al.size() - 1);
                al.remove(al.size() - 1);
                getMax(al, sum, max);
            }
        }
        return al.size();
    }

}
