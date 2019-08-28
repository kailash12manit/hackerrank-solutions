package hackerrank;
import java.util.*;

public class DijkstraShortestReach2_3 {

	final static int inf = 99999999;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int k=0;k<t;k++) {
			int n = in.nextInt(); //nodes
			int m = in.nextInt(); //edges

			int[][] dist = new int[n+1][n+1];

			for (int j=1;j<n+1;j++) {
				for (int u=1;u<n+1;u++) {
					dist[j][u]=inf;
				}
				dist[j][j]=0;
			}

			for (int u=0;u<m;u++) {
				int x = in.nextInt();
				int y = in.nextInt();
				int r = in.nextInt();

				dist[x][y] = Math.min(dist[x][y],r);
				dist[y][x] = Math.min(dist[y][x],r);

			}

			int start = in.nextInt();


			int[] dis = new int[n+1];

			boolean[] visited = new boolean[n+1];


			for (int j=1;j<n+1;j++) {
				visited[j]=false;
				dis[j]=dist[start][j];

			}

			visited[start] = true;

			int cursor = start;

			for (int j=1;j<n+1;j++) {
				int min = inf;
				for (int u=1;u<n+1;u++) {
					if (visited[u]==false &&dis[u]<min) {
						min=dis[u];
						cursor=u;
					}
				}

				visited[cursor]=true;

				if (min==inf) {
					continue;
				}

				for (int u=1;u<n+1;u++) {
					if (visited[u]==true) continue;

					if (dist[cursor][u]<inf) {
						dis[u]=Math.min(dis[u],min+dist[cursor][u]);
					}

				}
			}

			for (int j=1;j<n+1;j++) {
				if (j==start) continue;

				if (dis[j]==inf) {
					System.out.print("-1 ");
				} else {
					System.out.print(dis[j]+" ");
				}    
			}

			System.out.println("");
		}
	}
}