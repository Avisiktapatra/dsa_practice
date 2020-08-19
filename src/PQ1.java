import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PQ1 {

    public static void main(String[] args) {
        int arr[] ={1,23,12,9,30,2,50};
        List<Integer> al = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a-b);
        for(int x : arr){
            pq.add(x);
            if(pq.size() > 3)
                pq.poll();
        }
        while(!pq.isEmpty()) {
            al.add(pq.poll());
        }
        Collections.reverse(al);
        for(int x : al)
            System.out.println(x);
    }
}
