package hackerrank;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

import javax.crypto.CipherSpi;

public class Roads_and_Libraries {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
	    int q = in.nextInt();
	    for(int a0 = 0; a0 < q; a0++){
	        int n = in.nextInt();  // no of citi
	        int m = in.nextInt();  // no of road
	        long cost_lib = in.nextLong();  // cost_lib
	        long cost_road = in.nextLong(); // cost_road
	        
	        ArrayList<ArrayList<Integer>> ar = new ArrayList<ArrayList<Integer>>();
	        for(int i=0;i<n;i++){
	        	ar.add(new ArrayList<Integer>());
	        }
	        
	        for(int i=0;i<m;i++){
	        	int u=in.nextInt();
	        	int v=in.nextInt();
	        	ar.get(u).add(v);
	        	ar.get(v).add(u);
	        }
	        
	        boolean []visited = new boolean[n];
            long numCC = 0;
            for (int i = 0; i < n; i++) {
            	if(visited[i]){
            		continue;
            	}
            	numCC++;
            	
            	ArrayDeque<Integer> qu = new ArrayDeque<Integer>();
            	qu.add(i);
            	while(!qu.isEmpty())
            	{
            		int u= qu.removeFirst();
            		
            		for(int v: ar.get(u)){
            			if(!visited[v]){
            				qu.add(v);
            				visited[v]=true;
            			}
            		}
            	}
            }
            System.out.println( numCC * cost_lib + (n-numCC)* Math.min(cost_lib, cost_road));
        }
	}
}
