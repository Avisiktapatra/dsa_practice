import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevels {

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

    public List<Double> findAverage(Node root){
        Queue<Node> q = new LinkedList<>();
        List<Double> al = new ArrayList<>();
q.add(root);
int level = 0;
double sum = 0;
int ct = 0;
while(!q.isEmpty()){
    int height= q.size();
    for(int i = 0; i<height; ++i){
        Node pop = q.poll();
       // System.out.print(pop.d + " ");
        sum += pop.d;
        ct++;
        if(pop.left!= null)
            q.add(pop.left);
        if(pop.right != null)
            q.add(pop.right);
    }
   // System.out.print(sum  +" ");
    double avg = (double)sum/ct;
    al.add(avg);
    level++;
    sum = 0;
    ct = 0;
}
return al;
    }

    public static void main(String[] args) {
        AverageOfLevels l = new AverageOfLevels();
        root = new Node(2147483647);
        root.left = new Node(2147483647);
        root.right = new Node(2147483647);
       // root.left.left = new Node(8);
       // root.right.left = new Node(15);
      //  root.right.right = new Node(7);
      List<Double> al =  l.findAverage(root);
      for(Double i : al)
          System.out.print(i + " ");
    }
}


