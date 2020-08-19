public class BSTInsertion {
   static Node root;
    BSTInsertion(){
        root = null;
    }

    public static void main(String[] args) {
        BSTInsertion bst = new BSTInsertion();
        root = bst.add(20);
        root = bst.add(8);
        root = bst.add(22);
        root = bst.add(4);
        root = bst.add(12);
        root = bst.add(10);
        root = bst.add(14);
    }

    public Node add(int data) {
        return insertNode(data, root);
    }

    public Node insertNode(int data, Node root) {
        if (root == null) {
            return new Node(data);
        }
        if (root.data <= data)
            root.right = insertNode(data , root.right);
        else if(root.data >= data)
            root.left = insertNode(data, root.left);
            return root;
    }
}


 class Node{
    Node left, right, parent;
    int data;
    Node(int d){
        data = d;
    }
}
