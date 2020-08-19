import java.util.ArrayList;

public class KSumPath {
    static ArrayList<Integer> al = new ArrayList<>();
    static Node root;
    int ans =0;

    static class Node {
        Node left, right;
        int d;

        Node(int d) {
            this.d = d;
            left = right = null;
        }
    }

    public void hasPath(Node root, int sum){
        if(root == null){
            return;
        }
        al.add(root.d);
        ans = ans+ root.d;

        if(ans == sum){
            for(int i=0;i<al.size();i++){
                System.out.print(al.get(i) + " ");
            }
            System.out.println();
        }
        if(root.left != null) {
            hasPath(root.left, sum);
        }
        if(root.right != null) {
            hasPath(root.right, sum);
        }
        ans = ans - root.d;
        al.remove(al.size()-1);
    }
    public static void main(String [] args) {
        KSumPath ps = new KSumPath();

        root = new Node(10);
        root.left = new Node(28);
        root.right = new Node(13);
        root.right.left = new Node(14);
        root.right.right = new Node(15);
        root.right.left.left = new Node(21);
        root.right.left.right = new Node(22);
        root.right.right.left = new Node(23);
        root.right.right.right = new Node(24);
        ps.hasPath(root,38);
    }
}
