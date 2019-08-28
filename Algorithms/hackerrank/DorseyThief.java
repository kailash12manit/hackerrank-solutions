package hackerrank;
import java.util.*;

public class DorseyThief {
	static int total=0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int w=sc.nextInt();
		int []val= new int[n];
		int []wt = new int[n];
		for(int i=0;i<n;i++){
			val[i]=sc.nextInt();
			wt[i] =sc.nextInt();
		}
	    //Arrays.sort(wt);
	    
	   	if(isSubsetSum(wt,n,w)){	    
	   		System.out.println(knapsack(w,wt,val,n));
	   	}
	   	else{
	   		System.out.println("Got caught!");
	   	}
	}
	private static boolean isSubsetSum(int[] set, int n, int sum) {
		// TODO Auto-generated method stub
		/*
		 * isSubsetSum(int[] wt, int n, int w);
		 * 
		if(w==0){
			return true;
		}	
		if(n==0 && w!=0){
			return false;
		}
		
		if(wt[n-1]>w){
			return isSubsetSum(wt, n-1, w);
		}
		else {
			return (isSubsetSum(wt,n-1,w)|| isSubsetSum(wt, n-1, w-wt[n-1]));
		}
		*/
		boolean subset[][]= new boolean[sum+1][n+1];
		for(int i=0;i<=n;i++){
			subset[0][i]=true;
		}
		for(int i=1;i<=sum;i++){
			subset[i][0]=false;
		}
		for(int i=1;i<=sum;i++){
			for(int j=1;j<=n;j++){
				subset[i][j]=subset[i][j-1];
				
				if(i>=set[j-1]){
					subset[i][j]= subset[i][j-1] || subset[i-set[j-1]][j-1];
				}
			}
		}
		
		return subset[sum][n];	
	}
	 private static long knapsack(int w, int[] wt, int[] val, int n) {
		// TODO Auto-generated method stub
		/*
		if( w==0 || n==0){
			return 0;
		}
		if(wt[n-1]>w){
			return knapsack(w,wt,val,n-1);
		}
		else {
			total+=val[n-1];
			return Math.max( val[n-1]+knapsack(w-wt[n-1],wt,val,n-1 ) , knapsack(w,wt,val,n-1));
		}
		*/
		long dp[][]= new long[n+1][w+1];
		for(int i=0;i<=n;i++){
			for(int j=0;j<=w;j++){
				
				if(i==0 || j==0){
					dp[i][j]=0;
				}
				else if(wt[i-1]<=j){
					dp[i][j]=Math.max(val[i-1]+ dp[i-1][j-wt[i-1]] , dp[i-1][j] );
				}
				else{
					dp[i][j]=dp[i-1][j];
				}
				
			}
		}
		return dp[n][w];	
	}
}