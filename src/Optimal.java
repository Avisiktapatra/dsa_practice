import java.util.*;

public class Optimal {

    public static List<int[]> solution(List<int[]> a, List<int[]> b, int target){
        Map<Integer, List<int[]>> map = new HashMap<>();//key is sum , value is list of ids from a and b.

        for (int i = 0; i < a.size(); i ++){
            for (int j = 0; j < b.size(); j ++){
                List<int[]> sums = map.getOrDefault(a.get(i)[1] + b.get(j)[1], new ArrayList<int[]>());
                sums.add(new int[] {a.get(i)[0], b.get(j)[0]});
                map.put(a.get(i)[1] + b.get(j)[1], sums);
            }
        }

        List<Integer> allSums = new ArrayList<>();
        for (Integer i : map.keySet()){
            if (i < target){
                allSums.add(i);
            } else if (i == target){
                return map.get(target);
            }
        }
        if (allSums.size() == 0){
            return new ArrayList<>();//target is less than every possible sums.
        }
        return map.get(Collections.max(allSums));
    }

    public static void main(String [] args){
        List<int []> al = new ArrayList<>();
        al.add(new int[]{ 1, 3});
        al.add(new int[]{2,5});
        al.add(new int[]{3,7});
        al.add(new int[]{4,10});
        List<int []> al1 = new ArrayList<>();
        al1.add(new int[]{ 1, 2});
        al1.add(new int[]{2,3});
        al1.add(new int[]{3,4});
        al1.add(new int[]{4,5});
        List<int[]> ans = solution(al,al1,10);
        for(int[] arr : ans){
            for(int i:arr){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
