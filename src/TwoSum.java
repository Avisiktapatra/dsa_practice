import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int arr1[] = {20, 50, 40, 25, 30, 10};
        int target = 60;
        TwoSum ts = new TwoSum();
        int ans[] = ts.twoSum(arr1, target);
        for(int k = 0; k<ans.length;k++)
            System.out.print(ans[k] + " ");
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int l = 0;
        int m =0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            hm.put(nums[i], i);
        }
        for (int j = 0; j < len; j++) {
            int complement = target - nums[j];
            if (hm.containsKey(complement) && hm.get(complement) != j){
                if((l<nums[j] && m<nums[j]) || (l<complement && m<complement)){
                   l = j;
                   m= hm.get(complement);
                }
            }
        }
        return new int[]{l,m};
    }
}


