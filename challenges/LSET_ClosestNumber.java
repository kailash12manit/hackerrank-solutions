package challenges;

public class LSET_ClosestNumber {
	public static void main(String[] args) {
		System.out.println(closestNumber(349,1,4));
		
	}
	
	static int closestNumber(int a, int b, int x) {
        /*
         * Write your code here.
         */
		//The closest multiple of 4 to 349 is 348. 
        
		long res = (long) Math.pow(a, b);
        
        long multi = res/x;
         
        long curr = multi*x;
        
        long next = (multi+1)*(x);
        
        if((res-curr) < (next-res)) {
        	return (int) curr; 
        }
        else {
        	return (int) next;
        }		       

    }

}
