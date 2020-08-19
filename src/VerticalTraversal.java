import java.util.*;

public class VerticalTraversal {
    static Node root;
    public static class Node {
        Node right;
        Node left;
        int d;

        Node(int d) {
            this.d = d;
            right = left = null;
        }
    }

static class Pair{
   Node node;
   int val;
   Pair(int d, Node n){
       val = d;
       node = n;
   }
}

public void traversal(Node root){

    TreeMap<Integer, List<Integer>> tm = new TreeMap<>();
    Queue<Pair> q = new LinkedList<>();
    q.add(new Pair(0, root));

    if(root == null) return;
    while(!q.isEmpty()){
        Pair pop = q.poll();
        int hd = pop.val;
        Node node = pop.node;
         if(tm.get(hd) == null){
             tm.put(hd, new ArrayList<>());
         }
         tm.get(hd).add(node.d);

         if(node.left != null)
             q.add(new Pair(hd-1, node.left));
        if(node.right != null)
            q.add(new Pair(hd+1, node.right));
    }

    for(Map.Entry<Integer, List<Integer>> e : tm.entrySet()){
       List<Integer> al = e.getValue();
       for(Integer c:al){
           System.out.print(c + " ");
       }
       System.out.println();
    }
}

    public static void main(String[] args) {
        VerticalTraversal vt = new VerticalTraversal();
        root = new Node(1);
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        root.right.right.right = new Node(9);
        root.right.right.left= new Node(10);
        root.right.right.left.right= new Node(11);
        root.right.right.left.right.right= new Node(12);
        vt.traversal(root);
    }
}