public class FullTree {

    public boolean isFullTree(Node root){
        if(root == null)
            return true;
        if(isLeaf(root) || root.left!=null && root.right!=null){
            return (isFullTree(root.left) && isFullTree(root.right));
        }
        return false;
    }
    public boolean isLeaf(Node root){
        if(root.right==null && root.left==null)
            return true;
        return false;
    }

    public static void main (String args[]){
        FullTree ft = new FullTree();
        Node root = new Node(1);
        root.left = new Node(2);
       // root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        //root.left.left.left = new Node(6);
        //root.left.left.right = new Node(7);
       boolean ans = ft.isFullTree(root);
       System.out.println(ans);
    }

}
