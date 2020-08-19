import java.util.ArrayList;
import java.util.List;

public class LeftView {

    static Node root;
    static int mlevel = 0;
    public static class Node {
        Node right;
        Node left;
        int d;

        Node(int d) {
            this.d = d;
            right = left = null;
        }
    }

public static int print(Node root, int level,  List<Integer> al ){
        if(root == null){
            return 0;
        }
        if(mlevel < level){
            al.add(root.d);
            mlevel = level;
        }
        print(root.left, level+1, al);
        print(root.right, level+1, al);
    if(al.size()> 0){
        return al.get(al.size()-1);
    }
    return 0;

}

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        LeftView l = new LeftView();
        root = new Node(1);
       // root.left = new Node(1);
       // root.right = new Node(3);

        //root.left.left = new Node(4);
       // root.right.left = new Node(5);
       // root.right.right = new Node(6);

       // root.right.left.left = new Node(7);
      //  root.right.left.right = new Node(7);

        int g = print(root, 1, al);
        System.out.println(g);
    }
}
