public class Islands {
    public static void main(String args[])
    {
        int [][] grid = {{1,1,0,0,0},{1,1,0,0,0},{0,0,1,0,0},{0,0,0,1,1}};
        int r = grid.length;
        int c = grid[0].length;
        int ct=0;

        boolean[][] vis=new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1 && !vis[i][j]) {
                    dfs(i, j, r, c, vis, grid);
                    ct++;
                }
            }
        }
        System.out.println(ct);
    }

    public static void dfs(int i,int j, int r, int c, boolean vis[][], int grid[][]){
        vis[i][j]=true;
        int[] rb ={-1,1,0,0};
        int[] cb ={0,0,-1,1};
        for(int ct=0;ct<4;ct++){
            int er = i+rb[ct];
            int ec = j+cb[ct];
            if(er>=0 && er<r && ec>=0 && ec<c && !vis[er][ec] && grid[er][ec]==1){
               dfs(er,ec,r,c,vis,grid);
            }
        }
    }
}
