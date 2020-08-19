
    import java.util.ArrayList;
import java.util.List;

    public class LevelOrder1 {
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

            public static int getHeight(Node root){
                if(root == null) return 0;
                int l = getHeight(root.left);
                int r = getHeight(root.right);
                int max = Math.max(l,r) + 1;
                return  max;
            }

            public List<Double> levelOrder(Node root){
                    List<Double> al = new ArrayList<>();
                int h = getHeight(root);


                for(int i =1; i<= h; i++){
                    double j = (double)printLevelOrder(root, i, 0, 0, 0);
                     al.add(j);
                }

                return al;
            }

            public int printLevelOrder(Node root, int level, int ct, int s, int avg){

                if(root == null) return 0;
                if(level == 1)
                    return root.d;
                else if(level>1){
                    int l = printLevelOrder(root.left, level-1, ct, s, avg);
                    if(l != 0){
                    ct++;}
                    int r = printLevelOrder(root.right, level-1, ct, s, avg);
                    if(r!=0){
                    ct++;}
                    s = s+l+r;
                    System.out.println(s);
                    avg = avg + (s/ct);
                }

                return s;
            }

        public static void main(String[] args){
            LevelOrder1 l = new LevelOrder1();
            root = new Node(3);
            root.left = new Node(9);
            root.right = new Node(20);
            root.left.left = new Node(8);
            root.right.left = new Node(15);
            root.right.right = new Node(7);
            //System.out.println("h");
List<Double> al = l.levelOrder(root);
for(double d:al){
    System.out.println(d);
}
        }



}
