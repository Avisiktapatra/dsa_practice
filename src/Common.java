public class Common {
    public static void main(String[] args){
        String str="aabbbbaa";

       int ans = findCommon(str);
       System.out.print(ans);
    }
    public static int findCommon(String str){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<str.length();i++){
            int ct=0;
            String a = str.substring(0,i+1);
            String b = str.substring(i+1, str.length());
            int l1=a.length();
            int l2 = b.length();
            if(l1>l2){
                String temp = a;
                a = b;
                b = temp;
            }
            boolean vis[] = new boolean[b.length()];
            for(int j=0;j<a.length();j++){
                for(int k=0;k<b.length();k++){
                    if(a.charAt(j)==b.charAt(k) && !vis[k]){
                        vis[k] = true;
                        ct++;
                        break;
                    }
                }
            }
            max = Math.max(max,ct);
        }
        return max;
    }
}
