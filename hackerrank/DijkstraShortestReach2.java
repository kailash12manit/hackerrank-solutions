package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class DijkstraShortestReach2 {
    static int V;
    static int start;
    // Complete the shortestReach function below.
    static int[] shortestReach(int n, int[][] edges, int st) {
        V=n;
        start=st;
        int ans[]= new int[n-1];
        int [][]graph=new int[V][V];
        for(int i=0;i<V;i++){
            Arrays.fill(graph[i],0);
        }
        
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0]-1;
            int v=edges[i][1]-1;
            int w=edges[i][2];
            graph[u][v]=w;
            graph[v][u]=w;
        }
        ans=dijkstra(graph,start);
        return ans;
    }
    
    private static int[] dijkstra(int[][] graph, int scr) {
        // TODO Auto-generated method stub
        int dist[]= new int[V];
        boolean stpset[]= new boolean[V];
        for(int i=0;i<V;i++){
            dist[i]=Integer.MAX_VALUE;
            stpset[i]=false;
        }
        dist[scr]=0;
        for(int count=0;count<V-1;count++){
            int u=minDistance(dist,stpset);
            stpset[u]=true;
            
            for(int v=0;v<V;v++){
                
                if(!stpset[v] && graph[u][v]!=0 && 
                        dist[u]!=Integer.MAX_VALUE &&
                        dist[u]+graph[u][v] < dist[v] ){
                    
                    dist[v]=dist[u]+graph[u][v];
                }                
            }            
        }
        return dist;
    }
    
    private static int minDistance(int[] dist, boolean[] stpset) {
        // TODO Auto-generated method stub
        int min=Integer.MAX_VALUE;int min_index=-1;
        for(int i=0;i<V;i++){
            if(stpset[i]==false && dist[i]<=min){
                min=dist[i];
                min_index=i;
            }
        }
        return min_index;
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0]);

            int m = Integer.parseInt(nm[1]);

            int[][] edges = new int[m][3];

            for (int i = 0; i < m; i++) {
                String[] edgesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 3; j++) {
                    int edgesItem = Integer.parseInt(edgesRowItems[j]);
                    edges[i][j] = edgesItem;
                }
            }

            int s = scanner.nextInt()-1;
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] result = shortestReach(n, edges, s);

            for (int i = 0; i < result.length; i++) {
                if(i==start){
                    continue;
                }
                if(result[i]==Integer.MAX_VALUE){
                    System.out.print("-1");
                }
                else{
                    System.out.print(String.valueOf(result[i]));
                }
                if (i != result.length - 1) {
                   System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}