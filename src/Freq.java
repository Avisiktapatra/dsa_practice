import java.util.*;

public class Freq {
    static List<String> retrieveMostFrequentlyUsedWords(String helpText,
            List<String> wordsToExclude)
    {
        List<String> ans1 = new ArrayList<String>();
        List<Integer> val = new ArrayList<Integer>();
        String banned [] = new String[wordsToExclude.size()];
        for(int i=0;i<wordsToExclude.size();i++){
            banned[i] = wordsToExclude.get(i);
        }
        String[] words = helpText.toLowerCase().split("[ !?',;.]+");
        HashMap<String,Integer> hm = new HashMap();
        for(String word : words)
            hm.put(word,hm.getOrDefault(word,0)+1);
        for(String word : banned)
            if(hm.containsKey(word))
                hm.remove(word);

        for(Map.Entry<String,Integer> e : hm.entrySet()){
            val.add(e.getValue());
        }
        Collections.sort(val);
       int want = val.get(val.size()-1);
        for(Map.Entry<String,Integer> e : hm.entrySet()){
          if(e.getValue()==want)
                ans1.add(e.getKey());
        }
        return ans1;
        // WRITE YOUR CODE HERE
    }
    public static void main(String[] args){
        String help ="Jack and Jill went to the market to buy bread and cheese. Cheese is Jack's and Jill's favourite" +
                " food.";
        List<String> wordsToExclude = new ArrayList<>();
        wordsToExclude.add("and");
        wordsToExclude.add("he"); wordsToExclude.add("the");  wordsToExclude.add("to");  wordsToExclude.add("is");
        List<String> ans = retrieveMostFrequentlyUsedWords(help,wordsToExclude);
        for(String s: ans)
            System.out.println(s);
    }
}
