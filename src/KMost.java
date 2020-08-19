import java.util.*;

public class KMost {

    public static void main(String[] args){
        String arr[] = {"i", "love", "leetcode", "i", "love", "coding"};

        int k = 2;
        HashMap<String, Integer> hm = new HashMap<>();
        List<String> al = new ArrayList<>();
        for(String s : arr){
            hm.put(s, hm.getOrDefault(s,0)+1);
        }
        PriorityQueue<String> pq = new PriorityQueue<String>((a,b) -> hm.get(a).equals(hm.get(b)) ? b.compareTo(a) :
                hm.get(a) - hm.get(b));
        for(String str : hm.keySet()){
            pq.add(str);
            if(pq.size() > k)
                pq.poll();
        }
        for(String word : pq)
            al.add(word);
        Collections.reverse(al);
      //  return al;

        for(String i : al){
           System.out.print(i);
        }
    }

}
