import java.util.ArrayList;
import java.util.List;

public class LCABT {
    Node root;
    List<Integer> al1 = new ArrayList<Integer>();
    List<Integer> al2 = new ArrayList<Integer>();

    static class Node {
        Node right;
        Node left;
        int d;

     public Node(int d) {
            this.d = d;
            right = left = null;
        }
    }

    public int findAncestor(Node root, int n1, int n2){
if(!findPath(root, n1, al1)||(!findPath(root, n2, al2))){
    return -1;
}
int i;
for(i =0;i<al1.size() && i <al2.size(); i++){
    if(!al1.get(i).equals(al2.get(i))){
        break;
    }
}
return al1.get(i-1);
    }

    public boolean findPath(Node root, int n, List<Integer> al){
        if(root == null) return false;
        al.add(root.d);

         if(root.d == n) return true;


         if(findPath(root.left, n, al)) return true;
        if(findPath(root.right, n, al)) return true;
            al.remove(al.size()-1);
        return false;
    }


        public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);
            LCABT lca = new LCABT();
int n = lca.findAncestor(root, 4,5);
System.out.println(n);
        }
    }
