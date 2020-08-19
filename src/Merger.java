import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.io.*;

public class Merger {
    public static void main(String[] args) {
int mergesum = 0;
        Map<Long, Integer> map = new HashMap<Long, Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[][] data = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                data[i][j] = sc.nextLong();
                if (map.containsKey(data[i][j])) {
                    int occurrence = map.get(data[i][j]);
                    occurrence++;
                    map.put(data[i][j], occurrence);
                } else {
                    map.put(data[i][j], 1);
                }
            }
        }
        for (Long key : map.keySet()) {
            int occurrence = map.get(key);
            if(occurrence > 2){
                int q= occurrence/2;
                int r=occurrence%2;
                mergesum = q+r;
            }
            //System.out.println(key + " occur " + occurrence + " time(s).");
        }
        System.out.println(mergesum);
    }
}




