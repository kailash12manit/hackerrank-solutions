package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

 class Array_Manipulation {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int []arr= new int[n+1];
		Arrays.fill(arr, 0);
		long x=0,max=0;
		
		for(int i=0;i<m;i++){
			int p=sc.nextInt();
			int q=sc.nextInt();
			int sum=sc.nextInt();
			
			arr[p]+=sum;
			if((q+1)<=n){
				arr[q+1]-=sum;
			}
			
		}
		for (int i=1;i<=n;i++){
			x=x+arr[i];
			if(max<x){
				max=x;
			}
		}
		System.out.println(max);
		
	}
}