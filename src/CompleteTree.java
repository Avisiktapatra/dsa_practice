public class CompleteTree {

   static Node head;
    static int ct=0;

    public int getCount(Node root){
        if(root == null)
            return 0;
        ct++;
        getCount(root.left);
        getCount(root.right);
       return ct;
    }

    public boolean isComplete(Node root, int i){
        if(root == null)
            return true;
        if(i>=ct){
            return false;
        }
        boolean left = isComplete(root.left, (2*i)+1);
        boolean right = isComplete(root.right, (i*2) +2);
        if(left == true && right == true) {
            return true;
        }
        return false;
    }

    public static void main(String [] args){
        CompleteTree ct = new CompleteTree();
        ct.head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.right = new Node(6);
        int ct1 = ct.getCount(head);
        boolean ans = ct.isComplete(head, 0);
        System.out.println(ct1);
    }
}
