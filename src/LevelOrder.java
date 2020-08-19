import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    Node root;
    public static class Node{
        Node right ;
        Node left;
        int d;
        Node(int d){
            this.d = d;
            right = left = null;
        }

        public static void levelOrder(Node root){
            Queue<Node> q = new LinkedList<>();
            q.add(root);

            while(!q.isEmpty()){
                Node x = q.poll();
                System.out.print(x.d + " ");
                if(x.left != null){
                    q.add(x.left);
                }
                if(x.right != null){
                    q.add(x.right);
                }
            }
        }
        public static void main(String[] args){
            Node root = new Node(3);
            root.left = new Node(9);
            root.right = new Node(20);
            root.right.left = new Node(15);
            root.right.right = new Node(7);
            levelOrder(root);
        }
    }
}
