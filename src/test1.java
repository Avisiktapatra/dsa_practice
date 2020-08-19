import java.util.Scanner;

public class test1 {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        float n = input.nextFloat();
        float k = input.nextFloat();
//        float n =9;
////        float k = 11;
        int no;
        float half = n/2;
        int flr = (int)Math.floor(half); //4
        int ceil = (int)Math.ceil(half); //5

        int flr_sum = (flr *(flr+1))/2; //10
        int ceil_sum = (ceil *(ceil+1))/2; //15

        if(flr_sum > k){
            no = flr_sum;
        }
        else{
            no = ceil_sum;
        }
int ans = (int)(no -k );
        System.out.println(ans);
    }

}
