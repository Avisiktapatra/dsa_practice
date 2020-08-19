public class Level_OrderTraversal_Recursion {

    Node root;

     static class Node {
        Node left, right;
        int d;

        Node(int d) {
            this.d = d;
            left = right = null;
        }
    }

    public int height(Node root){
         if(root.left == null || root.right == null)
             return 0;

         int left = height(root.left);
         int right = height(root.right);
         int height = Math.max(left,right) +1;
         return height;
    }

    public void traversalProcess(Node root, int height){

         for(int i=1; i<= height+1;i++){
             traversal(root, i);
         }
    }

    public void traversal(Node root, int level){
         if(root == null)
             return;
         if(level == 1)
             System.out.print(root.d + " ");
         if(level > 1){
             traversal(root.left, level-1);
             traversal(root.right, level-1);
         }
    }
    public static void main(String [] args){
        Level_OrderTraversal_Recursion lot = new Level_OrderTraversal_Recursion();
        lot.root = new Node(1);
        lot.root.left = new Node(2);
        lot.root.right = new Node(3);
        lot.root.left.left = new Node(7);
        lot.root.left.right = new Node(6);
        lot.root.right.left = new Node(5);
        lot.root.right.right = new Node(4);
        int height = lot.height(lot.root);
        lot.traversalProcess(lot.root, height);
        //System.out.println(height);
    }
}
