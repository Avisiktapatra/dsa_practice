import java.util.*;

class Constructor {
    public static void main(String[] args) {
        HashMap<Integer,Integer> register=new HashMap<>();
      int a[] = {2,4,6,7,4,6};
        for(int i : a){
            register.put(i,register.getOrDefault(i, 0) +1);
        }
    }

}
