package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class MigratoryBirds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int res[]= new int[5];
		Arrays.fill(res, 0);
		for(int i=0;i<n;i++) {
			int temp=sc.nextInt()-1;
			res[temp]=res[temp]+1;
		}
		/*
		for(int kk:res) {
			System.out.print(kk+" ");
		}
		*/
		int max_val=res[0];
		int max=0;
		
		for(int i=1;i<5;i++) {
			if(res[i]>max_val) {
				max_val=res[i];
				max=i;
			}
		}
		System.out.println(max+1);
	}
}
