import java.util.Iterator;
import java.util.LinkedList;

public class NoOfNodes {

    static int v;
    static int arr[];
    LinkedList<Integer> al[];

    NoOfNodes(int v) {
        this.v = v;
        arr = new int[v];
        al = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            al[i] = new LinkedList<>();
        }
    }
    public void addEdge(int src, int dest){
        al[src].add(dest);
        al[dest].add(src);
    }

    public void findCount(int src, int e){
        arr[src] = 1;
        Iterator<Integer> itr = al[src].listIterator();
        while (itr.hasNext()){
            int x = itr.next();
            if(x == e)
                continue;
            findCount(x,src);
            arr[src]+= arr[x];
        }
    }

    public static void main(String[] args){
        NoOfNodes nodes = new NoOfNodes(8);

        nodes.addEdge(1,2);
        nodes.addEdge(1,3);
        nodes.addEdge(1,4);
        nodes.addEdge(2,5);
        nodes.addEdge(4,7);
        nodes.addEdge(4,6);

          nodes.findCount(1, 0);
          for(int i: arr){
              System.out.println(i);
          }

    }
}
