package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class AlmostSorted {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int []arr= new int[n];
		int []brr= new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			brr[i]=arr[i];
		}
		Arrays.sort(brr);
		int u=-1,v=-1;
	    int count=0;
	    for(int i=0;i<n;i++){
			if(arr[i]!=brr[i]){
				count++;
				if(u==-1){
					u=i;
				}
				v=i;
			}
		}
        if(count==0){
			System.out.println("yes");
			return;
		}
		if(count==2){
			System.out.println("yes");
			System.out.println("swap "+(u+1)+" "+(v+1));
            return;
		}
		else{
			
			 if(reverse(arr,brr,u,v)){
				 System.out.println("yes");
				 System.out.println("reverse "+(u+1)+" "+(v+1));
			 }
			 else{
				 System.out.println("no");
			 }		
		}	
	}
	private static boolean reverse(int[] arr, int[] brr, int left, int right) {
		// TODO Auto-generated method stub
		for(int i=left;i<=right;i++){
			if(arr[i]!=brr[right+left-i]){
				return false;
			}
		}
		return true;
	}
}
