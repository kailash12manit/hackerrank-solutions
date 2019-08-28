package hackerrank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class Node_graph{
	int index;
	List<Integer> adjacent = new ArrayList<Integer>();
	int distance = -1;
	
	Node_graph(int i){
		index=i;
	}
}

public class Breadth_First_Search_Shortest_Reach {

	static final int EDGE_DISTANCE = 6;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int q = sc.nextInt();
		while(q-->0){
			int n = sc.nextInt();
			
			Node_graph[] nodes= new Node_graph[n];
			
			for(int i=0;i<n;i++){
				nodes[i]= new Node_graph(i);
			}
			
			int m = sc.nextInt();
			for(int i = 0; i < m; i++) {
				int u = sc.nextInt() - 1;
				int v = sc.nextInt() - 1;
				
				nodes[u].adjacent.add(v);
				nodes[v].adjacent.add(u);
			}
			
			int s = sc.nextInt() - 1;
			
			bfs(nodes, s);
			
			for(int i=0;i<n;i++){
				if(i==s){
					continue;
				}
				else{
						System.out.print(nodes[i].distance+" ");
				}
			}
			System.out.println();	
		}
	}

	private static void bfs(Node_graph [] nodes, int s) {
		// TODO Auto-generated method stub
		Queue<Node_graph> queue = new LinkedList<Node_graph>();
		
		nodes[s].distance = 0;
		
		queue.add(nodes[s]);
		while (!queue.isEmpty()) {
			
			Node_graph head = queue.poll();
			
			for (int adjacent : head.adjacent) {
				
				if (nodes[adjacent].distance < 0) {
					nodes[adjacent].distance = head.distance + EDGE_DISTANCE;
					queue.add(nodes[adjacent]);
				}
			}
		}
	}

}
