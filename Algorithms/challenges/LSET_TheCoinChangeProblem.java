package challenges;

import java.util.Arrays;

public class LSET_TheCoinChangeProblem {
	public static void main(String[] args) {
		long n=4;
		long []arr= {1,2,3};
	
		long res=getWays(n,arr);
		
		System.out.println(res);
		
	}
	
	// Complete the getWays function below.
    static long getWays(long n, long[] c) { 
        Arrays.sort(c);
        long m=c.length;
       
        long []res=new long[(int)n+1];
        res[0]=1;
        for(long i=0;i<m;i++) {
        	for(long j=c[(int) i];j<=n;j++) {
        		res[(int) j]+=res[(int) (j-c[(int) i])];        		
        	}
        }
        
        /*
         for(long kk: res) {
        	System.out.print(kk+" " );
        }
        */
        System.out.println("kk");
        return res[(int) n];
    }
}
