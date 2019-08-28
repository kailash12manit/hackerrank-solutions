package challenges;

public class LSET_SherlockandGCD {
	public static void main(String[] args) {
		int arr[]= {5,5,5};
		
		System.out.println(solve(arr));
	}

	static String solve(int[] arr) {
		int n=arr.length;
		 int result = arr[0]; 
	        for (int i = 1; i < n; i++) {
	            result = gcd(arr[i], result); 
	        }
	     if(result==1) {
	    	 return "YES";
	     }
	     return "NO";
    }
	
	static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
        return gcd(b % a, a); 
    }

}
