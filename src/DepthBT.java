public class DepthBT {
     Node root;

    static class Node{
        Node left, right;
        int d;
        Node(int d){
            this.d = d;
            left = right =null;
        }
    }

    public void inorderTraversal(Node root){
        if(root == null)
            return;
        inorderTraversal(root.left);
        System.out.print(root.d + " ");
        inorderTraversal(root.right);
    }

    public int findDepth(Node root){
        if(root == null)
            return 0;
        int left = findDepth(root.left);
        int right = findDepth(root.right);
       int depth = Math.max(left,right)+1;
        return depth;
    }

    public static void main(String [] args){
        DepthBT dbt = new DepthBT();
        dbt.root = new Node(1);
        dbt.root.left = new Node(2);
        dbt.root.right = new Node(3);
        dbt.root.left.left = new Node(4);
        dbt.root.left.right = new Node(5);
//        dbt.root.right.left = new Node(5);
//        dbt.root.right.right = new Node(6);
       // dbt.inorderTraversal(dbt.root);
       int ans = dbt.findDepth(dbt.root);
       System.out.println(ans);
    }
}
