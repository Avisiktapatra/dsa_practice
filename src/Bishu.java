    import java.util.*;


public class Bishu {
        // Array  of lists for Adjacency List Representation
        public static  LinkedList<Integer> adj[];
        public static HashMap<Integer,Integer> map=new HashMap<>();
        public static int count=0;
        public static int min=Integer.MAX_VALUE;
        public static int minValue =Integer.MIN_VALUE;
        // Constructor
          Bishu(int v)
        {

            adj = new LinkedList[v+1];
            for (int i=0; i<=v; ++i)
                adj[i] = new LinkedList();
        }

        //Function to add an edge into the graph
        public static void addEdge(int v, int w)
        {
            adj[v].add(w);
            adj[w].add(v);// Add w to v's list.
        }

        // A function used by DFS
        public static    void DFSUtil(int v,boolean visited[], boolean present[])
        {
            // Mark the current node as visited and print it
            visited[v] = true;
            if(present[v]){
                if(min>count){
                    min=count;
                    minValue =v;

                }
                else if(min==count){
                    if(v< minValue){
                        minValue =v;
                    }
                }
            }

            // Recur for all the vertices adjacent to this vertex
            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n]) {
                    count++;
                    DFSUtil(n, visited, present);
                }
            }
        }

        public static void main(String args[])
        {
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            Bishu s = new Bishu(n);

            for(int z=0;z<n-1;z++){
                int h=in.nextInt();
                int k=in.nextInt();
                addEdge(h,k);
              //  addEdge(k-1,h-1);

            }
            int t=in.nextInt();

            boolean present [] = new boolean[n+1];

            for(int i=0;i<t;i++){
                int j=in.nextInt();
               present[j] = true;
            }
            boolean visited[] = new boolean[n+1];
            DFSUtil(1, visited, present);
            System.out.println(minValue);

        }
    }




