public class serDes {
    static Node root;
  static class Node {
       Node left, right;
       int d;
       Node(int d){
           left=right=null;
           this.d=d;
       }
   }

   public static String serialise(Node root, String sb){
      if(root == null)
        return sb+= "null," ;
      String left = serialise(root.left, sb);
      String right = serialise(root.right, sb);
      String ans = root.d + ",";
      return sb+= ans + left + right;
   }
   public static void main(String[] args){
       String sb = new String();
       root = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       root.right.left = new Node(4);
       root.right.right = new Node(5);
       String ans = serialise(root, sb);
       System.out.print(ans);
   }

}
