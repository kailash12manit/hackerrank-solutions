package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Closest_Numbers {

	static String findMinDiff(int[] arr, int n)
    {
           
           Arrays.sort(arr);
          
           StringBuilder s = new StringBuilder("");
           int diff = Integer.MAX_VALUE;
          
         
           for (int i=0; i<n-1; i++){
               
               if (arr[i+1] - arr[i] == diff){
                  s.append(arr[i] + " "+ arr[i+1] + " ");
               }
              if (arr[i+1] - arr[i] < diff){
                  diff = arr[i+1] - arr[i];
                  s.setLength(0);
                  s.append(arr[i] + " "+ arr[i+1] + " ");
              }
                  
           }
           
           return s.toString();
    }
 
    
    public static void main(String[] args)
    {
        
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int arr[] = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println(findMinDiff(arr, arr.length));

	
     
    }
}