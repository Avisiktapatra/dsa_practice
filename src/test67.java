import java.util.HashMap;
import java.util.Map;

public class test67 {

    public static void main(String[] args) {
        String ingredient = "CARBBeetroot FIBERCarrot FATOlive CARBCorn CARBPotato FIBERBroccoli FATEgg FIBERBeans FATCheese CARBRice FIBERSpinach FATOil FIBERBanana";
        String[] arr = ingredient.split(" ");
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("FAT", 0);
        hm.put("CARB", 0);
        hm.put("FIBER", 0);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(arr[i].contains("FAT")){
                hm.put("FAT",hm.getOrDefault("FAT",0)+1);
            }
            else if(arr[i].contains("CARB")){
                hm.put("CARB",hm.getOrDefault("CARB",0)+1);
            }
            else if(arr[i].contains("FIBER")){
                hm.put("FIBER",hm.getOrDefault("FIBER",0)+1);
            }

            if((hm.get("FAT") == 3 && hm.get("FIBER") == 1) || (hm.get("FAT") == 2 && hm.get("FIBER") == 2) ||
                    (hm.get("FAT") == 4 && hm.get("FIBER") == 0)){
                sb.append("X");
                hm.put("FAT",0);
                hm.put("FIBER", 0);
            }
            else if((hm.get("CARB") == 2 && hm.get("FIBER") == 2) || (hm.get("CARB") == 1 && hm.get("FIBER") == 3)
                    || (hm.get("CARB") == 3 && hm.get("FIBER") == 1)){
                sb.append("Y");
                hm.put("CARB",0);
                hm.put("FIBER", 0);
            }
            else
                sb.append("-");
        }

        String ans = sb.toString().replace("-","");
        char[] arr1 = ans.toCharArray();
        for(int i =0; i<arr1.length; i++){
            if(arr[i] == arr[i+1])
            {

            }
        }
        System.out.print(ans);

    }
}
