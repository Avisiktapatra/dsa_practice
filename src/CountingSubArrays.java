import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CountingSubArrays {

    public static void main(String[] args) {
        int arr[] = {3,2,4,1,5};
        List<Integer> al = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        List<List<Integer>> ans1 = new ArrayList<>();
        printSubArray(arr,0,al,ans);
        HashMap<Integer, List<Integer>> hm = new HashMap<>();

        for(int j=0;j<arr.length;j++){
           hm.put(arr[j], new ArrayList<>());
        }
        for(int j=0;j<ans.size();j++) {
            Collections.sort(ans.get(j));
            int min = Integer.MAX_VALUE;
            min = Math.min(min, ans.get(j).get(0));
           // hm.put(min, ans1.addAll(ans.get(j));
        }


    }

    public static void printSubArray(int [] arr, int currIndex, List<Integer> al, List<List<Integer>> al1){

        if(currIndex == arr.length)
            return;

        for (int i = currIndex; i <arr.length ; i++) {

            al.add(arr[i]);
            al1.add(new ArrayList<Integer>(al));
            if(i == arr.length-1){
                al.clear();
            }
        }

        printSubArray(arr, currIndex+1, al, al1);
    }

}
