public class fibbonaci {

    public static void main(String[] args){
        fibbonaci f = new fibbonaci();
       int res = findAns(5);
       System.out.print(res);
    }

    static int findAns(int n){
        int ans =1;
        if(n ==0 || n==1){
            return 1;
        }
     ans =  n *findAns(n-1);
        return ans;
    }
}
