package hackerrank;

import java.util.Scanner;

public class CircularArrayRotation {
	 // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int len=a.length;
        k=(k%len);
        int q_len=queries.length;
        int brr[]= new int[len];
        int result[]=new int[q_len];

        for(int i=0;i<len;i++){
            brr[(i+k)%len]=a[i];
        }
        for(int i=0;i<q_len;i++){
          int var=queries[i];
          result[i]=brr[var];
        }
        return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nkq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nkq[0]);

        int k = Integer.parseInt(nkq[1]);

        int q = Integer.parseInt(nkq[2]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] queries = new int[q];

        for (int i = 0; i < q; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        int[] result = circularArrayRotation(a, k, queries);

        for (int i = 0; i < result.length; i++) {
           System.out.print(String.valueOf(result[i]));

            if (i != result.length - 1) {
            	 System.out.println();
            }
        }     

        scanner.close();
    }
}

