//package hackerrank;

import java.util.Scanner;

public class Bricks_Game {
    
    /*
     * Complete the bricksGame function below.
     */
    static long bricksGame(int[] arr) {
        int n = arr.length + 1;
        for(int i = 0; i < arr.length/2 ; i++) {
            int temp=arr[i];
            arr[i] = arr[arr.length - i - 1];        
            arr[arr.length - i - 1] = temp;
        }
        long[] sums = new long[n];
        for (int i = 1; i < n; i++) {
              sums[i] = sums[i - 1] + arr[i - 1];
        }
        
        long[] dp = new long[n];
        dp[1] = sums[1];
        dp[2] = sums[2];
        dp[3] = sums[3];
        
        for (int i = 4; i < n; i++) {
            dp[i] = Math.max(
                sums[i] - dp[i - 1],
                Math.max(
                    sums[i] - dp[i - 2],
                    sums[i] - dp[i - 3]
                )
            );
          }
          return dp[n - 1];          
    }
       
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = Integer.parseInt(scanner.nextLine().trim());
        for (int tItr = 0; tItr < t; tItr++) {
            int arrCount = Integer.parseInt(scanner.nextLine().trim());

            int[] arr = new int[arrCount];

            String[] arrItems = scanner.nextLine().split(" ");

            for (int arrItr = 0; arrItr < arrCount; arrItr++) {
                int arrItem = Integer.parseInt(arrItems[arrItr].trim());
                arr[arrItr] = arrItem;
            }

            long result = bricksGame(arr);

            System.out.println(String.valueOf(result));
            
        }       
    }
}
