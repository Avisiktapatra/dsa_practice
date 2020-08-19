import java.util.ArrayList;
import java.util.Scanner;
class TestClass {


    public static int min=Integer.MAX_VALUE;
    public static int minIndex=Integer.MAX_VALUE;

    private static void dfs(ArrayList<Integer>[] adj, int n, int sv,int count, boolean[] present, boolean[] vis) {
        vis[sv]=true;

        if(present[sv]){
            if(count<min){

                min=count;
                minIndex=sv;
            }

        }


        for(int i=0;i<adj[sv].size();i++){
            if(!vis[adj[sv].get(i)]){
                dfs(adj, n, adj[sv].get(i), count+1, present, vis);
            }
        }


    }


    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> adj[]=new ArrayList[n+1];

        for(int i=0;i<=n;i++){
            adj[i]=new ArrayList<>();
        }
        for(int i=0;i<n-1;i++){
            int f=sc.nextInt();
            int s=sc.nextInt();
            adj[f].add(s);
            adj[s].add(f);
        }


        boolean present[]=new boolean[n+1];

        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            present[sc.nextInt()]=true;
        }

        boolean vis[]=new boolean[n+1];


        dfs(adj,n+1,1,0,present,vis);
        System.out.println(minIndex);



    }
}