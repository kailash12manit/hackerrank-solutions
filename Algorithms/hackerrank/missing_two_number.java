package hackerrank;

import java.util.Locale.LanguageRange;

/*
 * Given an array of n unique integers where each element in the array is in range [1, n]. The array has all 
 * distinct elements and size of array is (n-2). Hence Two numbers from the range are missing from this array. 
 * Find the two missing numbers.
 */
public class missing_two_number {
	public static void main(String[] args) {
		 int arr[] = {1, 3, 5, 6};
		 // Range of numbers is 2 plus size of array
		 int n = 2 + arr.length;
		 
		 findTwoMissingNumbers01(arr, n); 		// O(n) time complexity and O(n) Extra Space
		 findTwoMissingNumbers02(arr, n);		//O(n) time complexity and O(1) Extra Space
		 findTwoMissingNumbers03(arr, n);       //XOR based solution
		 		 		
	}
	
	private static void findTwoMissingNumbers01(int[] arr, int n) {   // O(n) time complexity and O(n) Extra Space
		// TODO Auto-generated method stub
		boolean brr[]= new boolean[n];
		for(int i=0;i<arr.length;i++){
			brr[arr[i]-1]=true;
		}		
		for(int i=0;i<n;i++){
			if(brr[i]!=true){
				System.out.print(i+1+" ");
			}
		}
		System.out.println();
	}
	
	private static void findTwoMissingNumbers02(int[] arr, int n){  //O(n) time complexity and O(1) Extra Space
		 // Sum of 2 Missing Numbers
		int sum= (n*(n+1)/2 -getsum(arr,n-2));
		int avg=sum/2;
		int smallerhalf=0,greaterhalf=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<=avg){
				smallerhalf+=arr[i];
			}
			else{
				greaterhalf+=arr[i];
			}
		}
			
		System.out.println(avg*(avg+1)/2 - smallerhalf + " "+ ((n*(n+1)/2 -avg*(avg+1)/2) - greaterhalf ));
			
	}
	
	//below method : O(n) time, O(1) extra space and causes no overflow
	private static void findTwoMissingNumbers03(int[] arr, int n) {  //XOR based solution 
		// TODO Auto-generated method stub
		System.out.println("XOR based solution ");
		int XOR = arr[0];
		for(int i=1;i<n-2;i++){
			XOR^=arr[i];			
		}
		for(int i=1;i<n+1;i++){
			XOR^=i;			
		}
		int set_bit_no = XOR & ~(XOR-1);
		System.out.println(set_bit_no);
		int x = 0, y = 0;
		for(int i=0;i<n-2;i++){
			if((set_bit_no & arr[i]) >0){
				x= x ^ (arr[i]);
			}
			else{
				y=y^arr[i];
			}	
		}
		
		for(int i=1;i<=n;i++){
			if((set_bit_no & i) >0){
				x= x ^ (i);
			}
			else{
				y=y^i;
			}
			
		}
		System.out.println(x+" "+y);		
	}
	
	private static int getsum(int[] arr,int n) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=arr[i];
		}
		return sum;
	}	
}
