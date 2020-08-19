import java.util.*;
import java.util.stream.Collectors;

public class test45 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int l = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            String[] arr1 = str.split(" ");
            int arr[] = new int[l];
            for(int j=0;j<l;j++){
                arr[j] = Integer.parseInt(arr1[j]);
            }
            int k = sc.nextInt();
           List<Integer> ans = findids(arr, k);
           for(int in : ans)
               System.out.print(in+" ");
        }
    }

    public static List<Integer> findids(int[] arr, int k){
        List<Integer> al = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq =
                new PriorityQueue<>((a,b) -> a.getValue() == b.getValue()? a.getKey()-b.getKey():
                        a.getValue()-b.getValue());

        for(Map.Entry<Integer,Integer> e : hm.entrySet()){
            pq.add(e);
            if (pq.size() > k){
                pq.poll();
            }
        }
        while(!pq.isEmpty()){
            al.add(pq.poll().getKey());
        }
        Collections.reverse(al);
        return al;
    }
}
