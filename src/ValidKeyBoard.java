public class ValidKeyBoard {

    int count = 0;
    static int ROW = 4;
    static int COL = 5;
    int arr[][] = new int[][] { { 1, 1, 0, 0, 0 },
            { 1, 1, 0, 0, 0 },
            { 0, 0, 1, 0, 0 },
            { 0, 0, 0, 1, 1 } };
           // { 1, 0, 1, 0, 1 } };
     String arr1 [][] = {{"s", "a", "u", "r"},{"i","m","h","b"},{"*","*","*","*"}};

public int findPath() {
        boolean vis[][] = new boolean[ROW][COL];
       // Arrays.fill(vis,false);
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (arr[i][j] == 1 && !vis[i][j]) {
                    findNeighbour(i, j, arr, vis);
                    count++;
                }
            }
        }
        return count;
    }

public void findNeighbour(int i, int j, int arr[][], boolean vis[][]) {
        //int rownbr[] = {-1, -1, -1, 0, 0, 1, 1, 1}; //diagonal, horizontal, vertical
    int rownbr[] = {-1, 0, 0, 1}; //horizontal, vertical
    int colnbr[] = {0, -1, 1, 0}; //horizontal, vertical
        //int colnbr[] = {-1, 0, 1, -1, 1, -1, 0, 1}; //diagonal, horizontal, vertical
        vis[i][j] = true;
        for (int k = 0; k < 4; k++) {
            if (checkDimension(i + rownbr[k], j + colnbr[k], arr, vis)) {
                findNeighbour(i + rownbr[k], j + colnbr[k], arr, vis);
            }
        }
    }

    public boolean checkDimension(int i, int j, int arr[][], boolean vis[][]) {
        return ((i >= 0) && (i < ROW) && (j >= 0) && (j < COL) && (!vis[i][j]) && arr[i][j] == 1);
    }
    public static void main(String [] args) {

        ValidKeyBoard vkb = new ValidKeyBoard();
        int noOfIslands = vkb.findPath();
        System.out.println(noOfIslands);

    }
}
