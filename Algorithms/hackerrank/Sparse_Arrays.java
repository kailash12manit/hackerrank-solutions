package hackerrank;

import java.util.Scanner;

public class Sparse_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
        int N=kb.nextInt();
        String[] str= new String[N];
        for(int i=0;i<N;i++){
        	str[i]=kb.next();
        }
        int Q=kb.nextInt();
        for(int i=0;i<Q;i++){
        	int count=0;
        	String arr=kb.next();
        	for(int j=0;j<N;j++){
        		if(arr.equals(str[j])){
        			count++;
        		}
        	}
        	System.out.println(count);
         }
    }
}
