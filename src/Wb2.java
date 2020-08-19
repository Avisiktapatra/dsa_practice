import java.util.*;

public class Wb2 {
    public List<String> wordBreak(String s, List<String> wordDict) {
        return DFS(s, wordDict, new HashMap<String, List<String>>());
    }

    public List<String> DFS(String s, List<String> wordDict, Map<String, List<String>> map) {

        if (map.containsKey(s)) return map.get(s);

        List<String> result = new ArrayList<>();
        for (String word : wordDict) {
            if (s.startsWith(word)) {
                String nextWord = s.substring(word.length());
                if (nextWord.length() == 0)
                    result.add(word);
                else {
                    for (String w : DFS(nextWord, wordDict, map))
                        result.add(word + " " + w);
                }
            }
        }
        map.put(s, result);
        return result;
    }



    public static void main(String [] args){
        String s = "catsanddog";
        String [] wordDict = {"cat", "cats", "and", "sand", "dog"};
        List<String>  al = Arrays.asList(wordDict);
        Wb2 w = new Wb2();
        List<String> ans = w.wordBreak(s,al);
        for(String a: ans)
            System.out.print(a+" ");

    }
}
