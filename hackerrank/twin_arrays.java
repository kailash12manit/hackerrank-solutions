/**
 * 
 */
package hackerrank;

import java.util.Scanner;

/**
 * @author kailash.prajapati
 *
 */
public class twin_arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] ar1 = new int[n];
	        for(int ar1_i = 0; ar1_i < n; ar1_i++){
	            ar1[ar1_i] = in.nextInt();
	        }
	        int[] ar2 = new int[n];
	        for(int ar2_i = 0; ar2_i < n; ar2_i++){
	            ar2[ar2_i] = in.nextInt();
	        }
	        int result = twinArrays(ar1, ar2);
	        System.out.println(result);
	        
	}

	private static int twinArrays(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int first_min_arr = Integer.MAX_VALUE;
		int second_min_arr= Integer.MAX_VALUE;
		int index_arr= -1;
		
		int first_min_brr = Integer.MAX_VALUE;
		int second_min_brr = Integer.MAX_VALUE;
		int index_brr=-1;
		
		int n=arr.length;
		for(int i=0;i<n;i++){
			int temp= arr[i];
			if(temp <=first_min_arr){
				second_min_arr=first_min_arr;
				first_min_arr=temp;
				index_arr=i;
			}			
		}
		for(int i=0;i<n;i++){
			int temp= brr[i];
			if(temp <=first_min_brr){
				second_min_brr=first_min_brr;
				first_min_brr=temp;
				index_brr=i;
			}			
		}
		if(index_arr!= index_brr){
			return first_min_arr+first_min_brr;
		}
		else
			return Math.min(first_min_arr+second_min_brr , first_min_brr+second_min_arr);
	}

}
