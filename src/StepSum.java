public class StepSum {
    public static void main(String[] args) {
        int arr[]={-3,2,-3,4,2};
       int x= minStartValue(arr);
       System.out.println(x);
    }
    public static int minStartValue(int[] nums) {
        int sum = 0; int no = 0; int ans = 0;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i<nums.length; i++){
            sum += nums[i];
            if(sum < 0){
                if(min > sum)
                    min=sum;
            }
        }
        if (no == 0)
            ans = 1;
        else
            ans = (min*-1)+1;
        return ans;
    }
}
