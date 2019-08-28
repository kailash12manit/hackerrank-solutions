package challenges;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class LSET_KnightLon_a_Chessboard_2 {
	static int N;
	static class cell  {  
		int x, y;  
		int dis;  
		public cell(int x, int y, int dis) { 
			this.x = x; 
			this.y = y; 
			this.dis = dis; 
		}
	}
	static boolean isInside(int x, int y, int N)  {  
		if (x >= 1 && x <= N && y >= 1 && y <= N)  
			return true;  
		return false;  
	} 

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) { 
		    int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[][] result = knightlOnAChessboard(n);

	        for (int i = 0; i < result.length; i++) {
	            for (int j = 0; j < result[i].length; j++) {
	                System.out.print(String.valueOf(result[i][j]));
	                if (j != result[i].length - 1) {
	                    System.out.print(" ");
	                }
	            }
	            if (i != result.length - 1) {
	                System.out.println();
	            }
	        }
	        System.out.println();
	        scanner.close();
	    }
	    
		
	private static int[][] knightlOnAChessboard(int n) {
		// TODO Auto-generated method stub
		N=n;
		int answer[][]= new int[N-1][N-1];
             
		int knightPos[] = {1, 1}; 
	    int targetPos[] = {N, N}; 
	    
        for(int i=0;i<N-1;i++){
            for(int j=0;j<N-1;j++){
                
            	int min_dist = minStepToReachTarget( knightPos,targetPos ,N,i+1,j+1);
            	
                if(min_dist != Integer.MAX_VALUE) {
                    answer[i][j]=min_dist;
                }
                else {
                    answer[i][j]=-1;
                }
            }
        }        
        return answer;
		
	}
	
	//Method returns minimum step to reach target position  
	static int minStepToReachTarget(int knightPos[], int targetPos[], int N,int a,int b)  {  
		// x and y direction, where a knight can move  
		int dx[] = {a, a, -a, -a, b, b, -b, -b};  
		int dy[] = {b, -b, b, -b, a, -a, a, -a};  

		// queue for storing states of knight in board  
		Vector<cell> q = new Vector<>();  

		// push starting position of knight with 0 distance  
		q.add(new cell(knightPos[0], knightPos[1], 0));  

		cell t ;  
		int x, y;  
		boolean visit[][] = new boolean[N + 1][N + 1];  

		// make all cell unvisited  
		for (int i = 1; i <= N; i++)  
			for (int j = 1; j <= N; j++)  
				visit[i][j] = false;  

		// visit starting state  
		visit[knightPos[0]][knightPos[1]] = true;  

		// loop untill we have one element in queue  
		while (!q.isEmpty()) {  
			t = q.firstElement();  
			q.remove(0);  

			if (t.x == targetPos[0] && t.y == targetPos[1])  
				return t.dis;  

			for (int i = 0; i < 8; i++) {  
				x = t.x + dx[i];  
				y = t.y + dy[i];  

				if (isInside(x, y, N) && !visit[x][y]) {  
					visit[x][y] = true;  
					q.add(new cell(x, y, t.dis + 1));  
				}  
			}  
		}  
		return Integer.MAX_VALUE; 
	} 
}
