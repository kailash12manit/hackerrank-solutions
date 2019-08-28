package hackerrank;

public class Sam_and_substrings_sumOfSubstrings {
	public static void main(String[] args) {
		  String num = "1234"; 
		  System.out.println(sumOfSubstrings(num)); 
		  System.out.println(sumOfSubstrings_2(num));
		  System.out.println(sumOfSubstrings_3(num));
		 
	}

	private static int sumOfSubstrings_3(String num) {
		// TODO Auto-generated method stub
		int n=num.length();
		int MOD=1000000007;
		long sum = 0;
		long mf = 1; 
		for(int i = n - 1; i >= 0; i --) {
		    sum=(sum+(num.charAt(i) - '0') * (i + 1) * mf)%MOD;
		    mf=(mf*10+1)%MOD;             
		}
		return (int)sum;
	}

	private static int sumOfSubstrings_2(String num) {
		// TODO Auto-generated method stub
		int n=num.length();
		long sum = 0;
		long mf = 1; 
		for(int i = num.length() - 1; i >= 0; i --) {
			 sum += (num.charAt(i) - '0') * (i + 1) * mf;
			 mf = mf * 10 + 1; 			
		}
		return (int)sum;
	}

	private static int sumOfSubstrings(String num) {
		// TODO Auto-generated method stub
		int n=num.length();
		int sumofdigit[] = new int[n];
		sumofdigit[0] = num.charAt(0)-'0'; 
        int res = sumofdigit[0]; 
        
        for (int i = 1; i < n; i++) {
        	int numi =num.charAt(i)-'0';
        	sumofdigit[i] = (i+1) * numi + 10 * sumofdigit[i-1];
        	res += sumofdigit[i];
         }
        
        return res%1000000007;
	}
}
