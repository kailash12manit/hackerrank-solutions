import java.io.*;
import java.util.*;
 
class graph{
    private int n;
    private LinkedList<Integer> adj[];
    boolean visited[];
    graph(int n){
        this.n = n;
        adj = new LinkedList[n];
        for(int i = 0;i<n;i++){
            adj[i] = new LinkedList();   
        }   
        visited = new boolean[n];        
    }
    void addEdge(int a,int b){
        adj[a].add(b);
        adj[b].add(a);
    }
    int BFS(int s) {
        if(!visited[s]) {
            LinkedList<Integer> queue = new LinkedList<Integer>();
            int k = 0;
            visited[s]=true;
            queue.add(s);
           
            while (queue.size() != 0) {
                s = queue.poll();
                Iterator<Integer> i = adj[s].listIterator();
                while (i.hasNext()) {
                    int x = i.next();
                    if (!visited[x]) {
                        k++;
                        visited[x] = true;
                        queue.add(x);
                    }
                }
            }
            return k;
        }else{
            return -1;
        }
    }
}
 
 
public class solution {
 
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        
       int t = in.nextInt();
       in.nextLine();
       
       for(int i = 0;i<t;i++){
           int n = in.nextInt();
           int m = in.nextInt();
           int clib = in.nextInt();
           int croad = in.nextInt();
           graph g = new graph(n);
          
           for(int j = 0;j<m;j++){
               int a = in.nextInt();
               int b = in.nextInt();
               
               g.addEdge(a-1,b-1);               
           }
           long sum = 0;
           for(int k = 0;k<n;k++){
               int p = g.BFS(k);
            // System.out.println(p +" " + k);
               if(p!= -1){
                   sum += Math.min(p*croad + clib, (p+1)*clib);                               
               }
           }
           System.out.println(sum);          
       }       
    }
}
