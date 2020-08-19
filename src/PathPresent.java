import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class PathPresent {

        static int v;
        LinkedList<Integer> al[];

    PathPresent(int v) {
            this.v = v;
            al = new LinkedList[v];
            for (int i = 0; i < v; i++) {
                al[i] = new LinkedList<>();
            }
        }
        public void addEdge(int src, int dest){
            al[src].add(dest);
        }

        public boolean dfsTraversal(int src, int des, boolean[] vis){
            Stack st = new Stack();
            st.push(src);
            while(!st.isEmpty()) {
                int x = (int) st.pop();
                if (!vis[x]) {
                    vis[x] = true;

                    Iterator<Integer> itr = al[x].listIterator();
                    while (itr.hasNext()) {
                        int y = itr.next();
                        if (y == des)
                            return true;
                        st.push(y);
                    }
                }
            }
            return false;
        }

        public static void main(String[] args){
            PathPresent g = new PathPresent(4);
//            g.addEdge(2,9);
//            g.addEdge(7,2);
//            g.addEdge(7,9);
//            g.addEdge(9,5);
            g.addEdge(0,1);
            g.addEdge(0,2);
            g.addEdge(1,2);
            g.addEdge(2,0);
            g.addEdge(2,3);
            g.addEdge(3,3);

            boolean vis[] = new boolean[v];
            Arrays.fill(vis, false);
            boolean  ans =  g.dfsTraversal(3, 1, vis);
            System.out.println(ans);
        }
    }


