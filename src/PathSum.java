import java.util.ArrayList;
import java.util.List;

public class PathSum {
    static Node root;
    public static class Node {
        Node right;
        Node left;
        int d;

        Node(int d) {
            this.d = d;
            right = left = null;
        }
    }

    public static boolean hasPathSum(Node root, int s, int s1){
        List<Integer> al = new ArrayList<>();
        if(root == null)
            return false;
         s1 = s1 + root.d;
        al.add(root.d);
        if(s1 == s) {
            return true;
        }
        hasPathSum(root.left, s, s1);
        hasPathSum(root.right,s, s1);
        if(s1!=s){
            int f =al.remove(al.size()-1);
            s1 -= f;
        }
        return false;
    }

    public static void main(String[] args) {
        PathSum l = new PathSum();
        root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(11);
        root.right.left = new Node(13);
        root.right.right = new Node(4);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);
        root.right.right.right = new Node(1);
        boolean ans = hasPathSum(root, 22, 0);
        System.out.print(ans);
    }
}
