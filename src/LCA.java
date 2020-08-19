import java.util.ArrayList;

public class LCA {
    static Node head;

    public static int findAncestor( int r1, int r2){
        int i=0;
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        Boolean b1 = findPath(head, r1, al1);
        Boolean b2 = findPath(head, r2, al2);
        System.out.println(b1 != false ? "the path " +r1+ " exists" : "path " +r1+ " doesn't exists");
        System.out.println(b2 != false ? "the path " +r2+ " exists" : "path " +r2+ " doesn't exists");

       if(b1 == true && b2 == true) {
            while (i < al1.size() && i < al2.size() && al1.get(i) == al2.get(i)) {
                i++;
            }
        }
       return al1.get(i-1);
    }
    public static boolean findPath (Node root, int r1, ArrayList<Integer> al){
        if(root==null){
            return false;
        }
        al.add(root.data);
        if(root.data == r1)
            return true;
        if(root.left != null && findPath(root.left, r1, al)){
            return true;
        }
        if(root.right != null && findPath(root.right, r1, al)){
            return  true;
        }
        al.remove(al.size()-1);
        return false;
    }
    public static void main(String [] args){
        head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);
        int r1 = 4;
        int r2 = 5;
        int ans = findAncestor(r1, r2);
System.out.println(ans);
    }
}
