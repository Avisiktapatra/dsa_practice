import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {

   static Node root;
   List<Integer> list1 = new ArrayList<>();
   List<Integer> list2 = new ArrayList<>();

    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    public int findAncestor(Node root, int a, int b){
        if(root == null) return 0;
        if(!isPresent(root, a, list1) || !isPresent(root, b, list2)) return 0;
        int i = 0;

        while(i < list1.size() && i < list2.size()){
            if(list1.get(i) != list2.get(i)){
                break;
            }
            i++;
        }
        int distance1 = 0; int distance2 = 0;  //list1 [1,3,5,7], List2 [1,3,6,9]

           int j = i-1;
      //  for(x; j< list1.size() && j < list2.size(); j++){
            while(list1.get(i-1) != a){
                distance1++;
                i++;
            }

            while(list2.get(j) != b){
                distance2++;
                j++;
            }

       // return list1.get(i-1);
        return distance1 + distance2;

    }

    public boolean isPresent(Node root, int val, List<Integer> list){
        if(root == null) return false;

        list.add(root.data);
        if(root.data == val) return true;

        if(root.left != null && isPresent(root.left, val, list)) return true;
        if(root.right != null && isPresent(root.right, val, list)) return true;
        list.remove(list.size()-1);
        return false;
    }

    public static void main (String[] args){
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.right.left = new Node(8);
        root.right.right.right= new Node(9);
        LowestCommonAncestor lca = new LowestCommonAncestor();
        int ancestor = lca.findAncestor(root,7,9);

        System.out.print(ancestor);
    }
}
