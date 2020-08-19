public class WalletUtil {

    public static String hashcode(String password){
        int hash = 7;
        hash = 31 * hash + (password == null ? 0 : password.hashCode());
        return String.valueOf(hash);
    }

    public static void main(String[] args) {
        String s = hashcode("kity3000");
        System.out.print(s);
        System.out.print(hashcode("kity3000"));
    }
}