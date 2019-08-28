package hackerrank;

public class ThePowerSum {
	public static void main(String[] args) {
		System.out.println(powerSum(100,2));
		
	}
    // Complete the powerSum function below.
	static int res=0;
    static int powerSum(int X, int N) {
        return powerSum_cal(X,X,0,N);
    }

     static int powerSum_cal(int num, int x,int k,int n) {
    	 if(x==0) {
    		 res++;
    	 }
    	 int r = (int)Math.floor(Math.pow(num, 1.0/n));
    	 
    	 for(int i=k+1;i<=r;i++) {
    		 int a = x- (int)Math.pow(i, n);    	
    		 if(a>=0) {
    			 powerSum_cal(num,x-(int)Math.pow(i, n),i,n);
    		 }
    	 }
    	 return res;
    }
}
