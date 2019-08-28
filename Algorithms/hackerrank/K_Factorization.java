package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class K_Factorization {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[k];
        for(int i = 0; i < k; i++) {
            a[i] = sc.nextInt();
        }
        kFactorization(n,a);                
	}
	
	 // Complete the kFactorization function below.
    static void kFactorization(int n, int[] arr) {
    	
    	ArrayList<Integer> al =new ArrayList<Integer>();
        ArrayList<Integer> sol = new ArrayList<Integer>(); 
        Arrays.sort(arr);
        
        boolean val = true;
        long ans=1, temp=1, copy_n=n;
        
        for(int i = 0;i<arr.length;i++) {
            if(n%arr[i]==0) {
            	al.add(arr[i]);
            }
        }
        
        Collections.reverse(al);
        
        if(al.isEmpty()) {
            val = false;
        }
        else {
            for(int x : al) {
                if(n%x==0) {
                    while(n%x==0){
                    	sol.add(x);
                        temp = temp*x;
                        n = n/x;
                    }
                }
            }
        }
        
        Collections.reverse(sol);
        if(copy_n!=temp) {
            val=false;
        }
        if(val){
            System.out.print(ans+" ");
            for(int x : sol){
                ans = ans*x;
                System.out.print(ans+" ");
            }
        }
        else {
            System.out.println(-1);    	
        }
    }    
}
