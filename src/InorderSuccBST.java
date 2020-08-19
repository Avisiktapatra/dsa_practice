public class InorderSuccBST {
    static Node root, temp;
    InorderSuccBST(){
        root = null;
    }

    public static void main(String[] args) {
        InorderSuccBST bst = new InorderSuccBST();
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
        if (root.data <= data) {
            temp = insertNode(data, root.right);
            root.right = temp;
            temp.parent = root;
        }
        else if(root.data >= data) {
            temp = insertNode(data, root.left);
            root.left = temp;
            temp.parent = root;
        }
        return root;
    }

    public void inorder(Node root, Node dest ){
        if(dest.right != null){
            findSmallest(dest);
        }

    }

    public int findSmallest(Node node){

        return 0;
    }
}



