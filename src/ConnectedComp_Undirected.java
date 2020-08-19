import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class ConnectedComp_Undirected {

    int v;
    LinkedList<Integer> adj [] ;
    int count =0;

    ConnectedComp_Undirected(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void dfs(){
        int ans = 0;
        boolean[] vis = new boolean[v];
        Arrays.fill(vis, false);
        for (int i=0;i<v;i++){
            if(!vis[i]){
              getCount(i, vis);
            }
            System.out.println();
        }
    }

    public void getCount(int src, boolean[] vis){
        if(!vis[src]){
            vis[src] = true;
            System.out.print(src + " ");
            Iterator<Integer> itr = adj[src].listIterator();
            while (itr.hasNext()){
                int x = itr.next();
                getCount(x, vis);
            }
          //
        }
    }

    public void addEdge(int src, int des) {
        adj[src].add(des);
        adj[des].add(src);
    }
    public static void main(String [] args){
        ConnectedComp_Undirected cu = new ConnectedComp_Undirected(5);
         cu.addEdge(0, 1);
         cu.addEdge(1, 2);
         cu.addEdge(3, 4);
         cu.dfs();
    }
}
