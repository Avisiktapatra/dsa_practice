import java.util.*;

public class test2 {
    public static void main(String args[] ) throws Exception {
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.remove(0);
        al.remove(1);
        al.add(20);
        Iterator<Integer> itr= al.iterator();
        while (itr.hasNext()){
            int ab = (int) itr.next();
            System.out.print(ab+" ");
        }
    }
}
