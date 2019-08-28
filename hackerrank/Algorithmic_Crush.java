package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class Algorithmic_Crush {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		long M=sc.nextLong();
		ArrayList<Long> list= new ArrayList<Long>();
		for(int i=0;i<N;i++){
			list.add(i,(long) 0);
		}
        //System.out.println(list.size());
		long max=0; 
		while(M-->0){
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			int k=sc.nextInt();
			list.add(a,(long) k);
			
			
			
			
			
		}
		System.out.println(max);
	}
}