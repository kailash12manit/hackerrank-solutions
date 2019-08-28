package Project_Euler;

import java.util.Scanner;

class euler002 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
        	long num= in.nextLong();
        	System.out.println(fib(num));
        }
          
    }
	static long fib(long n)
	{
		long i=1;
		long sum=0;
		long f0 = 2;
		long f1 = 8;
		long f2=0;
		while(f1<=n){
		      sum+=f1;
		      f2 = 4*f1 + f0;
		      f0=f1;
		      f1=f2;
		}
		return sum+2;
	}	
}
