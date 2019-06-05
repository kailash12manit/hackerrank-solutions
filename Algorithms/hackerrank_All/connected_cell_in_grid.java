package hackerrank;

import java.util.*;
class connected_cell_in_grid {
	
	final static int rowNbr[]={-1,-1,-1,0,0,1,1,1};
	final static int colNbr[]={-1,0,1,-1,1,-1,0,1};
	static int max_count=0;
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int matrix[][]=new int[n][m];
		boolean visited[][]=new boolean[n][m];
        
        for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
		int maxregion=0;
				
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
			    if(!visited[i][j] && matrix[i][j]==1){
			    	maxregion= Math.max(maxregion,  Calregion(matrix,visited,i,j));
			    	max_count++;
			    }
			
			}
		}
		System.out.println(max_count);
		System.out.println(maxregion);		
	}

	static int Calregion(int[][] matrix, boolean[][] visited, int i, int j) {
		// TODO Auto-generated method stub
        
        int row=matrix.length;
        int col=matrix[0].length; 
	
        if(!(i>=0 && i<row && j>=0 && j<col) ||  !( matrix[i][j]==1  && !visited[i][j] )){
        	return 0;
		}
		int region=1;
		
		visited[i][j]=true;
		
		for(int k=0;k<8;k++){
			region+= Calregion(matrix, visited, i+ rowNbr[k] , j+ colNbr[k]);
		
        }		
		return region;
	}
}
