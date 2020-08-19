public class Text47 {

   static Node root;

   static class Node{
        Node left, right;
        int data;
        public Node(int data){
            left = right = null;
            this.data = data;
        }
    }

    public static void postOrder(Node root){
       if(root == null) return;
       postOrder(root.left);
       postOrder(root.right);
       System.out.print(root.data + " ->");
    }

    public static void main(String[] args) {
       root = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
       // root.right = new Node(3);
       postOrder(root);

    }
}
