import java.util.*;

public class PrintPath {
    public static void main(String [] args){
        int arr[][] = {{1,2,3},{4,5,6}};
        List<Integer> al = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<List<Integer>> ans = new ArrayList<>();
        printpath(0,0,al,res,2,3, arr);

    }

    public static void print(List<Integer> al, int last){

            for(int i:al) {
                System.out.print(i + " ");
            }
        System.out.print(last);
            System.out.println();
        }

    public static void printpath(int x, int y, List<Integer> al, List<List<Integer>> res, int r, int c,
            int[][]arr){

        if(x==r-1 && y==c-1){
           print(al, arr[x][y]);
            return;
        }
//if(x>=0 && x<r && y>=0 && y<c) {
    al.add(arr[x][y]);
    if (y + 1 < c)
        printpath(x, y + 1, al, res, r, c, arr);
    if (x + 1 < r)
        printpath(x + 1, y, al, res, r, c, arr);
    al.remove(al.size() - 1);

    }
}
