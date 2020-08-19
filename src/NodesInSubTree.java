
import java.util.ArrayList;

    public class NodesInSubTree
    {
        // variables used to store data globally
        static final int N = 8;
        static int count1[] = new int[N];

        // adjacency list representation of tree
        static ArrayList<Integer> adj[] = new ArrayList[N];

        // function to calculate no. of nodes in subtree
        static void numberOfNodes(int s, int e)
        {
            count1[s] = 1;
            for(Integer u: adj[s])
            {
                // condition to omit reverse path
                // path from children to parent
                if(u == e)
                    continue;

                // recursive call for DFS
                numberOfNodes(u ,s);
                count1[s] ++;
                // update count[] value of parent using
                // its children

            }
        }

        // function to add edges in graph
        static void addEdge(int a, int b)
        {
            adj[a].add(b);
            adj[b].add(a);
        }

        // function to print result
        static void printNumberOfNodes()
        {
            for (int i = 1; i < N; i++)
                System.out.println("Node of a subtree of "+ i+
                        " : "+ count1[i]);
        }

        // Driver function
        public static void main(String[] args)
        {
            // Creating list for all nodes
            for(int i = 0; i < N; i++)
                adj[i] = new ArrayList<>();

            // insertion of nodes in graph
            addEdge(1, 2);
            addEdge(1, 4);
            addEdge(1, 5);
            addEdge(2, 6);
            addEdge(4, 3);
            addEdge(4, 7);

            // call to perform dfs calculation
            // making 1 as root of tree
            numberOfNodes(1, 0);

            // print result
            printNumberOfNodes();

        }

    }
// This code is contributed by Sumit Ghosh


