import java.util.*;
    class test6 {
        public static void main(String args[] ) throws Exception {

            Scanner s = new Scanner(System.in);
            int no = s.nextInt();

            List<Integer> al1 =new ArrayList();
            int arr[] = new int[no];
            for(int i=0;i<arr.length;i++){
                List<Integer> al =new ArrayList();
                arr[i] = s.nextInt();
                findDivisor(arr[i],al);
                al1.add(al.size());
            }
            for(int a :al1)
                System.out.print(a+" ");
            //findDivisor()
        }
        public static void findDivisor(int n,List<Integer> al){
            for(int i=1;i<=Math.sqrt(n);i++){
                if(n%i==0) al.add(n/i);
            }
        }
    }


