package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class DivisibleSumPairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if( (arr[i]+arr[j])%k==0) {
					count++;
				}
			}			
		}
		System.out.println(count);
	}
}
