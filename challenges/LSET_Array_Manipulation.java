package challenges;

import java.util.Arrays;
import java.util.Scanner;

public class LSET_Array_Manipulation {
	 private static final Scanner sc = new Scanner(System.in);
	 static long[] arr= new long[1000];
	 
	 public static void main(String[] args) {
		
		 int n = sc.nextInt();
		 int m = sc.nextInt();
		 int[][] queries = new int[m][3];
		 for (int i = 0; i < m; i++) {
			 queries[i][0]=sc.nextInt();
			 queries[i][1]=sc.nextInt();
			 queries[i][2]=sc.nextInt();
		 }
		 System.out.println(arrayManipulation(n,queries));
		 		 
		 
	}
	 
	 // Complete the arrayManipulation function below.
	 static long arrayManipulation(int n, int[][] queries) {
		 int m = queries.length;
		 //System.out.println(m);
		 long max=0;
		 
		 for (int i = 0; i < m; i++) {
			 int a= queries[i][0]-1;
			 int b= queries[i][1]-1;
			 long sumval= queries[i][2];
			 long temp=0;
			 
			 int mid=(a+b)/2;
			 if((a+2)%2==0) {
				 temp = cal_val(a,mid,b,sumval); 
			 }
			 else {
				 temp = cal_val(a,mid-1,b,sumval);
			 }
			 if(temp>max) {
				 max=temp;
			 }			            
         }
		 return max;
	 }
	 
	 public  static long cal_val(int a, int mid, int b,long sumval){
		 long max=0;
		 
		 for(int j=a;j<=mid;j++) {
             arr[j]=arr[j]+sumval;
             if(max<arr[j]){
                 max=arr[j];
             }                 
             arr[j+mid]=arr[j+mid]+sumval;
             if(max<arr[j+mid]){
                 max=arr[j+mid];
             }
         }
		return max;        
	  }	 
}
