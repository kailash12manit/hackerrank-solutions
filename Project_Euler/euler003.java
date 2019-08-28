package Project_Euler;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class euler003 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
	    while(t-->0){
	    	long num= in.nextLong();
	    	System.out.println(Largest_prime_factor(num));	    	
	    }
	}
	
	static long Largest_prime_factor(long num) {
	
		if(num%2==0){
			while(num%2==0){
				num=num/2;
			}
		}
		if(num==1){
			return 2;
		}
		
		int i=0;
		for( i=3;i<=Math.sqrt(num);i+=2){
			if(num%i==0){
				num=num/i;
				i=i-2;
			}			
		}
		if(num>2){
			return num;
		}
		else{
			return i;
		}
	}
}
