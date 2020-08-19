import java.util.*;

public class ListOp {
    static Node root;
    TreeMap<Integer, List<Integer>> tm = new TreeMap<>();
    List<List<Integer>> al = new ArrayList<List<Integer>>();

    static int mlevel = 0;
    public static class Node {
        Node right;
        Node left;
        int d;

        Node(int d) {
            this.d = d;
            right = left = null;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        traversal(root, 0);

        return null;
    }

    public void traversal(TreeNode root, int hd){

        if(root == null) return ;
        List<Integer> al = tm.get(hd);
        if(al == null){
            al = new ArrayList();
            al.add(root.val);
        }
        else {
            al.add(root.val);
        }
        tm.put(hd, al);
        traversal(root.left, hd-1);
        traversal(root.right, hd+1);

    }

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        ListOp lop = new ListOp();
        root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);

        root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);

        // root.right.left.left = new Node(7);
        //  root.right.left.right = new Node(7);

       // int g = print(root, 1, al);
    //    System.out.println(g);
    }
}

