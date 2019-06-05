/**
 * 
 */
package hackerrank;

import java.util.Arrays;

/**
 * @author kailash
 *
 */
public class countN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,20},{9,19}};
		countN.countNumbers(arr);

	}
	static void countNumbers(int[][] arr) {
        int len = arr.length;
        Boolean status=false;
        int count=0;
        for(int i=0;i<len;i++){
        	count=0;
        	int N=arr[i][0];
        	int M=arr[i][1];
        	for(int k=N;k<=M;k++){
        		status=ishavig_distict_Digit(k);
        	    if(status==true){
        	    	count++;
        	    }
        	}
        	System.out.println(count);
          }
        
    }
	static Boolean ishavig_distict_Digit(int k) {
		int [] myarray = new int[10];
		Arrays.fill(myarray, 0);
		while (k != 0)
	    {   int temp = k%10;
	        myarray[temp]++;
	        k=k/10;
	    }	
		for (int i = 0; i < myarray.length; i++) {
			if(myarray[i]>1){
			  return false;
			}
		}
	
	 return true;
   }
}
