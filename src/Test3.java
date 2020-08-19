public class Test3 {
    int sum=0;
    static Node root;
    static class Node {
        int d;
        Node left, right;

        Node(int d) {
            this.d = d;
            left = right = null;
        }
    }


    public Node findSum(Node root){
        if(root != null) {
            findSum(root.right);
            sum += root.d;
            root.d = sum;
            findSum(root.left);
        }
return root;
    }

        public static void main(String[] args){
            Test3 t3 = new Test3();
            root = new Node(5);
            root.left = new Node(2);
            root.left = new Node(13);
            //root.left.left = new Node(4);
           // root.left.right = new Node(5);
            Node ans = t3.findSum(root);

        }
    }



