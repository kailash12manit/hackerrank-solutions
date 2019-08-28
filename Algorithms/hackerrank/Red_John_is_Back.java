package hackerrank;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Red_John_is_Back {
	
	 // Complete the redJohn function below.
    static int redJohn(int n) {
        int dp[]= new int[41];
        dp[0]=1;
        dp[1]=1;
        dp[2]=1;
        dp[3]=1;
        for(int i=4;i<41;i++){
            dp[i]= dp[i-1]+dp[i-4];
        }
        //System.out.println(dp[40]);
        boolean prime[] = new boolean[240000];        
        prime[0]=false;
        prime[1]=false;
        for(int i = 2; i < 240000; i++) {
            prime[i] = true;
        }
        
        for(int i = 2; i*i < 240000; i++) {
            if(prime[i]==true) {
                for(int j = i*i; j < 240000; j+=i) {
                    prime[j] = false;
                }
            }
        }
        
        int ans=0;
        for(int i=2;i<=dp[n];i++){
            if(prime[i]==true){
                ans++;
            }
        }
        return ans;
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = redJohn(n);

            System.out.println(String.valueOf(result));            
        }       

        scanner.close();
    }
}