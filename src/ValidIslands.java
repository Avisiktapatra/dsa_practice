public class ValidIslands {
    String str = "saurbhmi";
    static int ROW = 3;
    static int COL = 4;
    int prod = 1;
    int ans = 0;

    String arr[][] = {{"s", "a", "u", "r"}, {"i", "m", "h", "b"}, {"*", "*", "*", "*"}};

    public int findPath() {
        int x = 0;
        boolean vis[][] = new boolean[ROW][COL];
        String arrString[] = str.split("");

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (arr[i][j].equalsIgnoreCase(arrString[0]) && !vis[i][j]) {
                     x = findNeighbour(i, j, arr, 0, arrString, vis);
                }
            }
        }
        return x;
    }

    public int findNeighbour(int i, int j, String arr[][], int syl, String arrString[], boolean vis[][]) {

        int rownbr[] = {-1, -1, -1, 0, 0, 1, 1, 1}; //diagonal, horizontal, vertical
        int colnbr[] = {-1, 0, 1, -1, 1, -1, 0, 1}; //diagonal, horizontal, vertical

        vis[i][j] = true;
        if (syl + 1 < arrString.length) {
        for (int k = 0; k < 8; k++) {
                String keyword = arrString[syl + 1];
                if (checkDimension(i + rownbr[k], j + colnbr[k], arr, keyword, vis)) {
                    findNeighbour(i + rownbr[k], j + colnbr[k], arr, syl + 1, arrString, vis);
                    ans = 1;
                    break;
                }
            }
        }
        else if(syl+1 == arrString.length)
            ans =1;
        prod *= ans;
        System.out.println(i +" "+ j+ " " + prod);
        return prod;
    }

    public boolean checkDimension(int i, int j, String arr[][], String key, boolean vis[][]) {
        return ((i >= 0) && (i < ROW) && (j >= 0) && (j < COL) && arr[i][j].equals(key) && !vis[i][j]);
    }

    public static void main(String[] args) {

        ValidIslands vkb = new ValidIslands();
        int canBeTyped = vkb.findPath();
        System.out.println(canBeTyped);

    }
}

