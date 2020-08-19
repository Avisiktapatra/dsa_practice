public class AllWays {

    public static void main(String [] args){
        int arr[][] = new int[2][3];
        int ans = uniquePaths(3,2);
        System.out.println(ans);
    }

    public static int uniquePaths(int m, int n) {

int row = n;
int col=m;

        int a =findWay(0,0, row,col);
return a;
    }

    public static int findWay(int row, int col, int r, int c){
        if(row==r-1 || col==c-1) {
           return 1;
        }
            return findWay(row,col+1, r,c) +  findWay(row+1,col,r,c);
    }
}
