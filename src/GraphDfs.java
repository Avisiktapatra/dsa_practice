import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class GraphDfs {

    static int v;
    LinkedList<Integer> al[];

    GraphDfs(int v) {
        this.v = v;
        al = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            al[i] = new LinkedList<>();
        }
    }
    public void addEdge(int src, int dest){
        al[src].add(dest);
    }

    public void dfsTraversal(int src, boolean[] vis){
        if(vis[src])
            return;
        System.out.print(src + " ");
        vis[src] = true;
        Iterator<Integer> itr = al[src].listIterator();
        while(itr.hasNext()){
            int x = itr.next();
            dfsTraversal(x, vis);
        }

    }

    public static void main(String[] args){
        GraphDfs g = new GraphDfs(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);
        boolean vis[] = new boolean[v];
        Arrays.fill(vis, false);
        g.dfsTraversal(2, vis);
    }
}
