import java.util.*;

public class WordSearch2 {
    public static void main(String [] args){
        char[][] board = {{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
        String words [] = {"oath","pea","eat","rain"};

        WordSearch2 ws = new WordSearch2();
       List<String> al = ws.findWords(board,words);
       for(String s : al)
           System.out.print(s+" ");
    }

    public List<String> findWords(char[][] board, String[] words) {
        List<String> al = new ArrayList();
        int r = board.length;
        int c = board[0].length;
        boolean vis[][] = new boolean[r][c];
        for(String word : words){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                    if(!vis[i][j] && word.charAt(0) == board[i][j] && dfs(board, word, r,c, i, j, vis, 0)){
                        al.add(word);
                        break;
                    }
                }
            }
        }
        return al;
    }

    public boolean dfs(char[][] b, String word, int r, int c, int i, int j, boolean[][] vis, int start){
        if(word.length() == start)
            return true;
        if(i<0 || j<0 || i>=r || j>=c || vis[i][j] || b[i][j] != word.charAt(start))
            return false;
        vis[i][j] =true;
        if(dfs(b,word,r,c,i-1,j,vis,start+1) || dfs(b,word,r,c,i+1,j,vis,start+1)
                || dfs(b,word,r,c,i,j-1,vis,start+1) || dfs(b,word,r,c,i,j+1,vis,start+1))
            return true;
        vis[i][j] = false;
        return false;
    }
}
