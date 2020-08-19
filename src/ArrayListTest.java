import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

    public static void main(String [] args){
        ArrayList<Integer> al = new ArrayList<Integer>();
al.add(10);
al.add(20);
al.add(30);
al.remove(0);
al.remove(0);
al.add(20);
        Iterator i =al.iterator();
        for(Integer j : al){
            System.out.println(j);
        }
    }
}
