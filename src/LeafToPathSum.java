public class LeafToPathSum {
    static Node root;
    int sum = 0;

    public static class Node {
       Node right;
       Node left;
        int d;

        Node(int d) {
            this.d = d;
            right = left = null;
        }
    }

    public int sum(Node root, String str){
        if(root == null) return 0;
        str = str + root.d;
        if(root.left == null && root.right == null) {
            int ans = Integer.parseInt(str);
            sum = sum + ans;
        }
        if(root.left != null) sum(root.left, str);
        if(root.right != null) sum(root.right, str);
        str = str.substring(0, str.length() - 1);
        return sum;
    }

    public static void main(String[] args) {
        String str = new String();
        LeafToPathSum l = new LeafToPathSum();
        root = new Node(4);
         root.left = new Node(9);
         root.right = new Node(0);

        root.left.left = new Node(5);
         root.left.right = new Node(1);
       //  root.right.right = new Node(6);

        // root.right.left.left = new Node(7);
        //  root.right.left.right = new Node(7);
int ans = l.sum(root, str);
        System.out.println(ans);
    }
}
