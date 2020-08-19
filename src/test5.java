import java.util.*;

public class test5 {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner s = new Scanner(System.in);

        int no = s.nextInt();
        int arr[] = new int[no];
        for(int i=0;i<no;i++){
            arr[i] = s.nextInt();

        }
        int fmin=Math.min(arr[0],arr[1]);
        int smin=Math.max(arr[0],arr[1]);
        for(int i=2;i<no;i++){
            if(arr[i]<fmin){
                smin=fmin;
                fmin=arr[i];
            }
            else if(arr[i]<smin)
                smin=arr[i];
        }
        System.out.println((long)fmin*smin);
    }
}
