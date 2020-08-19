import java.util.*;
public class SearchBST {

        public static void main(String args[] ) throws Exception {

            Scanner sc = new Scanner(System.in);
            int testcase  = sc.nextInt();

            //for(int i=0;i<testcase;i++){
                int no = 3;
                List<String> al = new ArrayList<>();
                findPureNumber(no,al);
                String ans = al.get(no-1);
                System.out.println(ans);
           // }
        }
        public static void  findPureNumber(int n, List<String> al){
            Queue<String> qu = new LinkedList<>();
            qu.add("44");
            qu.add("55");

            while(al.size() < n){
                String pop = qu.poll();
                al.add(pop);
                qu.add("4" + pop + "4");
                qu.add("5" + pop + "5");
            }
            Collections.sort(al, new Comparator<String>()
            {
                @Override
                public int compare(String s1, String s2)
                {
                    Integer val1 = Integer.parseInt(s1);
                    Integer val2 = Integer.parseInt(s2);
                    return val1.compareTo(val2);
                }
            });
          //  return al;
        }
    }




