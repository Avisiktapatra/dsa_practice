public class WordSearch {
    char m [][] = {{'A','B','C', 'E'}, {'S','F','C','S'}, {'A','D','E','E'}};
    int r = m.length;
    int c = m[0].length;
    String  arr = "ABCB";

    public boolean exist(char[][] m, String word) {
      //  boolean vis[][] = new boolean[r][c];
        boolean res = false;
        for(int i =0;i<r;i++){
            for(int j = 0; j<c; j++){
              if(m[i][j] == word.charAt(0))
                  res =  dfs(i,j,m,word, 1);

               if(res) break;

            }
            if(res)
                break;
        }
return res;
    }

    public boolean dfs(int i,int j, char m[][], String word, int index){
      //  vis[i][j] = true;
        boolean ans = false;
        int row[] = {-1,1,0,0};
        int col[] = {0,0,1,-1};
        if(index>=word.length())
            return true;
        for(int k = 0; k<4; k++){
           if(isSafe(i+row[k], j+col[k],m,word, index )){
            ans = dfs(i+row[k], j+col[k],m,word, index+1);
             if(ans) {
                 break;
             }
           }

        }
        return ans;
    }

     boolean isSafe(int i,int j, char m[][], String word, int index){
return (i>=0 && i<r && j>=0 && j<c && m[i][j] == word.charAt(index));
    }

    public static void main(String [] args){
       WordSearch ws = new WordSearch();
      boolean ans = ws.exist(ws.m,ws.arr);
      System.out.println(ans);
    }
}
