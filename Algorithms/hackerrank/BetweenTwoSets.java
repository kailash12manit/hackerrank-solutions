/**
 * 
 */
package hackerrank;

import java.util.Scanner;

/**
 * @author kailash
 *
 */
public class BetweenTwoSets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int[] a = new int[n];

     n = in.nextInt();
     int[] b = new int[n];

     int min = Integer.MAX_VALUE;
     int max = Integer.MIN_VALUE;

     for(int i = 0; i < a.length; i++){
         a[i] = in.nextInt();
         if(a[i] > max){
             max = a[i];
         }
     }

     for(int i = 0; i < b.length; i++){
         b[i] = in.nextInt();
         if(b[i] < min){
             min = b[i];
         }
     }

     if(min > max){
         int temp = min;
         min = max;
         max = temp;
     }

     int count = 0;
     for(int i = min; i <= max; i++){
         if(isSetAFactor(i, a) && isFactorOfSet(i, b)){
             count++;
         }
     }

     System.out.println(count);
 }

 public static boolean isSetAFactor(int x, int[] a){
     for(int i : a){
         if((x % i) != 0){
             return false;
         }
     }
     return true;
 }

 public static boolean isFactorOfSet(int x, int[] a){
     for(int i : a){
         if((i % x) != 0){
             return false;
         }
     }
     return true;
 }

}
