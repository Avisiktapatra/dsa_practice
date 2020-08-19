public class Subarray {

    public static void main(String[]args){
        int arr[] = {1,2,4};
        Subarray s = new Subarray();
        int left = 0;
        int sum = 0;
        int target = 8;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
sum += arr[i];
while(sum > target){
    sum -= arr[left];
    min = Math.min(min, i-left+1);
    left++;
}
        }
        System.out.println(min == Integer.MAX_VALUE ? 0 : min);
    }
}
