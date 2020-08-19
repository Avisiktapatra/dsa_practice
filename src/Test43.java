public class Test43 {

    public static void main(String[] args) {
        int arr[] = {15,20,35,18,19,16,40,39,37}; //8

        int len = arr.length;

        int dp[] = new int[len + 1];

        if(len == 0) System.out.print("0");

        dp[0] = arr[0];
        dp[1] = Math.max(dp[0], arr[1]); //dp[15,20,50,50

        for(int i=2;i<len;i++){
            dp[i] = Math.max((dp[i-2] + arr[i]), dp[i-1]); //50
        }

        System.out.println(dp[dp.length-1]);
    }

}

