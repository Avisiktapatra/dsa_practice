
import java.util.*;

    class LevelOfNode
    {
        private static LinkedList<Integer> adj[];
        private static LinkedList<Integer> queue;
        private static boolean visited[];
        static int n;
        static void printLevels( int V, int x)
        {
            queue.add(x);

            visited[x] = true;
            List<Integer> al = new ArrayList<>();
            while (queue.size() > 0)
            {
                int n = queue.poll();
                al.add(n);
                visited[n] = true;
                Iterator<Integer> i = adj[n].listIterator();

                while(i.hasNext()) {
                    int next = i.next();

                    if (!visited[next])
                    {
                        queue.add(next);
                        visited[next] = true;
                    }
                }
            }
            System.out.println(al.get(al.size()-1));

        }
        static void graph(int v) {
            queue = new LinkedList<Integer>();
            visited = new boolean[v+1];
            adj = new LinkedList[v+1];

            for(int i = 0 ; i <= v ; i++) {
                adj[i] = new LinkedList<Integer>();
            }
        }

        // Driver Code
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            int u, v;
            for (int n = 0; n < t; n++) {
                int V = sc.nextInt();
                graph(V);
                for(int i=1;i<V;i++) {
                    u = sc.nextInt();
                    v = sc.nextInt();
                    addEdge(u,v);
                }
                int src = sc.nextInt();
                printLevels(V, src);
            }
        }

        static void addEdge(int s , int d) {
            adj[s].add(d);
        }
    }

