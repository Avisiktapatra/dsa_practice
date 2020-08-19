import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("promotion",2);
        hm.put("msg",1);
        hm.put("push notification",9);
        hm.put("newsletter",6);
        hm.put("letter",4);
        hm.put("post",5);

        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue()-a.getValue());
        for(Map.Entry<String,Integer> e : hm.entrySet()){
           pq.add(e);
        }
        String name = pq.poll().getKey();
        System.out.print(name);
    }
}
