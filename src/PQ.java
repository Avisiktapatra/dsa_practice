import java.util.*;

public class PQ {
    public static void main(String [] args){
        PQ pq = new PQ();
        String[] words = {"Anacell provides the best services in the city",
                "betacellular has awesome services",
                "Best services provided by anacell, everyone should use anacell"};
        String[] keywords = {"anacell", "cetracular", "betacellular"};
       List<String> al = pq.topKFrequent(words,2, keywords);
       Collections.reverse(al);
       for(String s :al)
           System.out.println(s);
    }

    public List<String> topKFrequent(String[] words, int k, String[] keyword) {
        List<String> w1 = Arrays.asList(keyword);
        List<String> al = new ArrayList<>();
        Map<String, Integer> hm = new HashMap();

        for(String str: words){
String s1[] = str.split("\\W");
            Set<String> added = new HashSet<>();
            for (String s : s1) {
                s = s.toLowerCase();
                if (w1.contains(s) && !added.contains(s)){
                    added.add(s);
                    hm.put(s, hm.getOrDefault(s, 0) + 1);
                }

        }
        }
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>((a,b) -> a.getValue() == b.getValue() ?
                b.getKey().compareTo(a.getKey()) : a.getValue() - b.getValue());

        for(Map.Entry e :hm.entrySet()){
            pq.offer(e);
            if(pq.size() > k)
                pq.poll();
        }
        while(!pq.isEmpty()){
            al.add(pq.poll().getKey());
        }
        return al;
    }
}
