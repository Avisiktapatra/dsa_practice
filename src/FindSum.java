import java.util.HashMap;

public class FindSum {

    public static void main(String[] args) {
        int arr[] = {2, 8, 4, 9, 3, 10, 45, 6}; //2 pairs-4,10--8,6
        int key = 14;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ans = 0;

        for(int i=0;i<arr.length;i++){
            int diff = key - arr[i];
            if(hm.containsKey(diff)){
                ans++;
            }
            hm.put(arr[i],i); //2,0
        }
        System.out.print(ans);
    }

}
