public class PathSum1 {
    //root to leaf path sum equal to a given number
    static Node root;

    static class Node {
        Node left, right;
        int d;

        Node(int d) {
            this.d = d;
            left = right = null;
        }
    }

    public boolean hasPath(Node root, int sum, int no){
        if(root == null)
            return false;
        sum = sum + root.d;

        if(sum == no)
            return true;

        if((root.left != null) && (hasPath(root.left, sum, no)))
            return true;

        if((root.right != null) && (hasPath(root.right, sum, no)))
            return true;

        sum = sum - root.d;
        return false;
    }

    public static void main(String [] args){
        PathSum1 ps = new PathSum1();
        root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(2);
        root.right.left.right = new Node(9);
       boolean ans = ps.hasPath(root, 0, 11);

System.out.println(ans);

    }
}
