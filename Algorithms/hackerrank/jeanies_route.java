package hackerrank;

import java.util.Scanner;

public class jeanies_route {	
	static int N;
	static int jeanisRoute(int[] city, int[][] roads) {
		int k=city.length;
		N=roads.length+1;
		int graph[][] = new int[N][N];
		
		for(int i=0;i<roads.length;i++){
			int a=roads[i][0]-1;
			int b=roads[i][1]-1;
			int c=roads[i][2];
			graph[a][b]=c;
			graph[b][a]=c;
		}
		primMST(graph);
		return 2;
		
    }
	
	private static void primMST(int[][] graph) {
		// TODO Auto-generated method stub
		int parent[] = new int[N];
		int key[] = new int[N];
		boolean []mstset= new boolean[N];
		
		for(int i=0;i<N;i++){
			key[i]=Integer.MAX_VALUE;
			mstset[i]=false;
		}
		key[0]=0; // always include the first vertex
		parent[0]=-1; //root
		
		for(int count=0;count<N-1;count++){
			int u=minKey(key,mstset);
			mstset[u]=true;
			for(int v=0;v<N;v++){
				if(graph[u][v]!=0 && mstset[v]==false  && graph[u][v]<key[v]){
					parent[v]=u;
					key[v]=graph[u][v];
					
				}
			}
		}
		printMST(parent, N, graph);
		
	}
	
	private static void printMST(int[] parent, int n, int[][] graph) {
		// TODO Auto-generated method stub
		int Total=0;
		for (int i = 1; i < N; i++){
            Total+=graph[i][parent[i]];
            System.out.print(parent[i]+" -> ");
		}
		System.out.println();
		System.out.println(Total);
	
	}
	
	private static int minKey(int[] key, boolean[] mstset) {
		// TODO Auto-generated method stub
		int min=Integer.MAX_VALUE,min_index=-1;
		for(int i=0;i<N;i++){
			if(mstset[i]==false && key[i]<min){
				min=key[i];
				min_index=i;
			}
		}
		return min_index;
	}
	
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0].trim());
        int k = Integer.parseInt(nk[1].trim());
        int[] city = new int[k]; //-----------------------------------1
        
        String[] cityItems = scanner.nextLine().split(" ");
        
        for (int i = 0; i < k; i++) {
            int j = Integer.parseInt(cityItems[i].trim());
            city[i] = j;
        }
        /* 
        for(int kk:city){
        	System.out.print(kk+" ");
        }
        System.out.println();
        */
        
        int[][] roads = new int[n-1][3];

        for (int i = 0; i < n-1; i++) {
            String[] str = scanner.nextLine().split(" ");

            for (int j = 0; j < 3; j++) {
                int roadsItem = Integer.parseInt(str[j].trim());
                roads[i][j] = roadsItem; //--------------------------------2
            }
        }

        int result = jeanisRoute(city, roads);

        System.out.println(String.valueOf(result));       
    }
}

