package challenges;

public class LSET_Sam_and_substrings {
	public static void main(String[] args) {
		System.out.println(substrings("123"));
		System.out.println(substrings_2("123"));
	}
	static int substrings(String num) {
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
	
	 static int substrings_2(String num) {
	        
	        int n=num.length();
	        int MOD=1000000007;
	        long save[]= new long[n];
	        save[0]=1;
	        for(int i=1;i<n;i++){
	            save[i]=(save[i-1]*10+1)%MOD;
	        }
	        long ans=0;
	        for(int i=1;i<=n;i++){
	            int digit=num.charAt(i-1)-'0';
	            ans=(ans+ digit*i*save[n-i])%MOD;
	        }
	        return (int)ans%MOD;
	    }
}