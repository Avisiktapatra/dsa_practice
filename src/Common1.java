public class Common1 {
    public static void main(String[] args) {
        String str = "abcdedeara";

        int ans = findCommon(str);
        System.out.print(ans);
    }

    public static int findCommon(String str) {
        int max = Integer.MIN_VALUE;
        int ct = 0;
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
        }
        for (int j = 0; j < str.length(); j++) {
            if (arr[str.charAt(j) - 'a'] > 1) {
                ct++;
                arr[str.charAt(j) - 'a'] -= 2;
            }
            max = Math.max(max, ct);
        }
        return max;
    }
}
