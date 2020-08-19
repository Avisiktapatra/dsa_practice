import java.util.*;
public class Solut {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); //testcase
        for (int k = 0; k < t; k++) {
            int arr[] = new int[3];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            sc.nextLine();
            String word = sc.nextLine();
            Character[][] ans = makeMat(arr[0], arr[1], arr[2], word);
            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans[0].length; j++) {
                    System.out.print(ans[i][j]);
                }
                System.out.println();
            }
        }

    }

    public static Character[][] makeMat(int r, int c, int len, String word){
        int total = r*c;
        String w = "";
        int entryno = (int)Math.ceil((total/len)) +1;
       // System.out.println(entryno);
        for(int i=0;i<entryno;i++){
           w= w +  word;
        }
       // System.out.print(w);

        Character[][] matrix = new Character[r][c];

        // Edge Case
        if (r == 0) {
            return matrix;
        }

        int rowStart = 0;
        int rowEnd = r-1;
        int colStart = 0;
        int colEnd = c-1;
        int num = 0;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i ++) {
                matrix[rowStart][i] = w.charAt(num++);
            }
            rowStart ++;

            for (int i = rowStart; i <= rowEnd; i ++) {
                matrix[i][colEnd] = w.charAt(num++);
            }
            colEnd --;

            for (int i = colEnd; i >= colStart; i --) {
                if (rowStart <= rowEnd)
                    matrix[rowEnd][i] = w.charAt(num++);
            }
            rowEnd --;

            for (int i = rowEnd; i >= rowStart; i --) {
                if (colStart <= colEnd)
                    matrix[i][colStart] = w.charAt(num++);
            }
            colStart ++;
        }

        return matrix;
    }
    }
