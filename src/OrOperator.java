import java.util.ArrayList;
import java.util.Arrays;

public class OrOperator {

    public static void main(String [] args) {
        long[][] q = {{2, 1, 5}, {1, 3, 5}, {2, 4, 5}};
        long[] arr = {1, 2, 3, 4, 5};
        long[] ans = solve(q, arr);

            for (int k = 0; k < ans.length; k++) {
                System.out.println(ans[k]);
            }

    }
    static long[] solve (long[][] query, long[] arr){
        //long[] ans = new long[arr.length];
        ArrayList<Long> ans = new ArrayList<>();
        long[] arr1 = new long[arr.length];
        arr1[0] = arr[0];
        for(int i =0;i<query.length;i++){
            for(int j =0;j<query[i].length;j++){
                if(j==0){
                    if(query[i][j]==2){
                        for(int k =1;k<arr1.length;k++){
                           arr1[k] = arr[k] | arr1[k-1];
                        }
                        int l = (int) query[i][j+1];
                        int h = (int) query[i][j+2];
                        long newarr []= Arrays.copyOfRange(arr1, l-1, h-1);
                        Arrays.sort(newarr);
                        ans.add(newarr[0]);
                    }
                    else if(query[i][j] == 1){
                        int pos = (int) query[i][j+1];
                        int replacement = (int) query[i][j+2];
                        arr1[pos] = replacement;
                    }
                }

            }
        }

        return null;
    }
}
