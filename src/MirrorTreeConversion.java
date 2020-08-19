public class MirrorTreeConversion {
    Node root;
    static class Node {
        Node left, right;
        int d;

        Node(int d) {
            this.d = d;
            left = right = null;
        }
    }
    public Node mirror(Node root){
        if(root == null){
            return root;
        }
      Node left = mirror(root.left);
        Node right = mirror(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.d);
        inorder((root.right));
    }

        public static void main(String[] args){
            MirrorTreeConversion mtc = new MirrorTreeConversion();
            mtc.root = new Node(1);
            mtc.root.left = new Node(3);
            mtc.root.right = new Node(2);
            mtc.root.right.left = new Node(5);
            mtc.root.right.right = new Node(4);
            mtc.mirror(mtc.root);
            mtc.inorder(mtc.root);

        }
    }

