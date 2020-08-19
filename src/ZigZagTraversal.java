public class ZigZagTraversal {
    static Node root;

    static class Node {
        Node left, right;
        int d;

        Node(int d) {
            this.d = d;
            left = right = null;
        }
    }
    public int height(Node root){
        if(root == null)
            return -1;

        int left = height(root.left);
        int right = height(root.right);
        int height = Math.max(left,right) +1;
        return height;
    }

    public void traversalProcess(Node root, int height, boolean itr){

        for(int i=1; i<= height+1; i++){
            traversal(root, i, itr);
            itr = !itr;
        }
    }

    public void traversal(Node root, int level, boolean itr){
        if(root == null)
            return;
        if(level == 1)
            System.out.print(root.d + " ");
        if(level > 1){
            if(itr) {
                traversal(root.left, level - 1, itr);
                traversal(root.right, level - 1, itr);
            }
            if(!itr){
                traversal(root.right, level - 1, itr);
                traversal(root.left, level - 1, itr);
            }
        }
    }
    public static void main(String [] args){
        ZigZagTraversal zt = new ZigZagTraversal();
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(8);
        root.right.left = new Node(6);
        root.left.left.left = new Node(13);
        root.left.right.left = new Node(12);
        int height = zt.height(root);
        zt.traversalProcess(root, height, false);
        //System.out.println(height);
    }
}


