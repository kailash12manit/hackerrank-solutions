package challenges;

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
            int k = 1;
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

public class LSET_Journey_to_the_Moon {
	
/*
5 3
0 1
2 3
0 4

 */
	public static void main(String[] args) {
	       Scanner in = new Scanner(System.in);
	           int n = in.nextInt();
	           int m = in.nextInt();
	           graph g = new graph(n);
	          
	           for(int j = 0;j<m;j++){
	               int a = in.nextInt();
	               int b = in.nextInt();
	               
	               g.addEdge(a,b);               
	           }
	           ArrayList<Integer>al = new ArrayList<Integer>();
	           
	           for(int k = 0;k<n;k++){
	               int p = g.BFS(k);
	               if(p!=-1) {
	            	   al.add(p);
	               }
	           }
	           Collections.sort(al);
	           Collections.reverse(al);
	           int sum=0;
	           for(int i=0;i<al.size();i++) {
	        	   for(int j=i+1;j<al.size();j++) {
	        		   sum=sum+( al.get(i)*al.get(j));
	        	   }
	           }
	           
	           
	           //System.out.println(al);
	           System.out.println(sum);
	    }
	}