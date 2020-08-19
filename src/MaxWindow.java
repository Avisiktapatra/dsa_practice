import java.util.ArrayList;

public class MaxWindow {
    public static void main(String [] args) {
        MaxWindow mw = new MaxWindow();
        int arr[] = {1};
        int k = 1;
        int end = k - 1;
int start=0;
        ArrayList<Integer> al = new ArrayList<>();
        while (end < arr.length) {
            int ans=Integer.MIN_VALUE;
            for (int i = start; i <= end; i++) {
                ans = Math.max(ans, arr[i]);
            }
            al.add(ans);
            end++;
            start++;
        }

        for(int i:al)
            System.out.print(i + " ");
    }
}
