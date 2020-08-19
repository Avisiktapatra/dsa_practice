

  import java.util.*;
import java.lang.*;
import java.io.*;

    class test46 {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- > 0){
                int r = sc.nextInt();
                int c = sc.nextInt();
                String[][] arr = new String[r][c];
                int[][] ans = new int[r][c];
                Arrays.stream(ans).forEach(a -> Arrays.fill(a, Integer.MAX_VALUE));
                for(int i=0; i<r; i++){
                    for(int j =0; j<c; j++){
                        arr[i][j] = sc.next();
                    }
                }
                for(int i=0; i<r; i++){
                    for(int j =0; j<c; j++){

                        if( arr[i][j].equals(String.valueOf('B')))
                            ans[i][j] = 0;
                        else if(arr[i][j].equals(String.valueOf('W')))
                            ans[i][j] = -1;

                    }
                }

                for(int i=0; i<r; i++){
                    for(int j =0; j<c; j++){
                        if (ans[i][j] == 0) dfs(i, j, 0, ans, r, c);
                    }
                }
                for(int i=0; i<r; i++){
                    for(int j =0; j<c; j++){
                        System.out.print(ans[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }

        public static void dfs(int i, int j, int d, int[][] ans, int r, int c) {
            if (i < 0 || i >= r || j < 0 || j >= c || ans[i][j] < d) return;
            ans[i][j] = d;
            dfs(i - 1, j, d + 1, ans, r, c);
            dfs(i + 1, j, d + 1, ans, r, c);
            dfs( i, j - 1, d + 1, ans, r, c);
            dfs(i, j + 1, d + 1, ans, r, c);
        }
    }
