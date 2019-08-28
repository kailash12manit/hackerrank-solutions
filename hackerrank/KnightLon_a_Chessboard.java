package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class KnightLon_a_Chessboard {
	static int N;
	// Complete the knightlOnAChessboard function below.
	static int[][] knightlOnAChessboard(int val) {
		N=val;
		int answer[][]= new int[N-1][N-1];
		int mat[][]=new int[N][N];
		for(int i=0;i<N;i++){
			Arrays.fill(mat[i],1);
		}
		
		for(int i=0;i<N-1;i++){
			for(int j=0;j<N-1;j++){
				int[][] visited = new int[N][N];
				for(int k=0;k<N;k++){
					Arrays.fill(visited[k],0);
				}
				
				int min_dist = findShortestPath(mat, visited, 0, 0, N-1, N-1,
						Integer.MAX_VALUE, 0,i+1,j+1);

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

	public static int findShortestPath(int mat[][], int visited[][],
			int i, int j, int x, int y, int min_dist, int dist , int a , int b) {
		// if destination is found, update min_dist
		if (i == x && j == y) {
			return Integer.min(dist, min_dist);
		}

		// set (i, j) cell as visited
		visited[i][j] = 1;

		if (isValid(i + a, j + b) && isSafe( visited, i + a, j + b)) {
			min_dist = findShortestPath(mat, visited, i + a, j + b, x, y,min_dist, dist + 1,a,b);
		}

		if (isValid(i-a, j + b) && isSafe( visited, i-a, j + b)) {
			min_dist = findShortestPath(mat, visited, i-a, j + b, x, y,min_dist, dist + 1,a,b);
		}

		if (isValid(i -a, j-b) && isSafe( visited, i - a, j - b)) {
			min_dist = findShortestPath(mat, visited, i - a, j-b, x, y,min_dist, dist + 1,a,b);
		}

		if (isValid(i+a, j - b) && isSafe( visited, i+a, j - b)) {
			min_dist = findShortestPath(mat, visited, i+a, j - b, x, y,min_dist, dist + 1,a,b);
		}
		
		//-----------------
		
		if (isValid(i + b, j + a) && isSafe( visited, i + b, j + a)) {
			min_dist = findShortestPath(mat, visited, i + b, j + a, x, y,min_dist, dist + 1,a,b);
		}

		if (isValid(i-b, j + a) && isSafe( visited, i-b, j + a)) {
			min_dist = findShortestPath(mat, visited, i-b, j + a, x, y,min_dist, dist + 1,a,b);
		}

		if (isValid(i -b, j-a) && isSafe( visited, i - b, j - a)) {
			min_dist = findShortestPath(mat, visited, i - b, j-a, x, y,min_dist, dist + 1,a,b);
		}

		if (isValid(i+b, j - a) && isSafe( visited, i+b, j - a)) {
			min_dist = findShortestPath(mat, visited, i+b, j - a, x, y,min_dist, dist + 1,a,b);
		}
		
		
		visited[i][j] = 0;

		return min_dist;
	}


	private static boolean isSafe(int visited[][], int x, int y) {
		return !(visited[x][y] != 0);
	}

	private static boolean isValid(int x, int y) {
		return (x < N && y < N && x >= 0 && y >= 0);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args)  {
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
}