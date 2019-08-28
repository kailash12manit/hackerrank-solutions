/**
 * 
 */
package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author kailash.prajapati
 *
 */
public class transform_to_palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int m = in.nextInt();
        int arr[] = new int[k];
        int brr[] = new int[k];
        
        for(int a0 = 0; a0 < k; a0++){
            arr[a0] = in.nextInt();
            brr[a0] = in.nextInt();
        }
        int[] str = new int[m];
        for(int a_i=0; a_i < m; a_i++){
            str[a_i] = in.nextInt();
        }
        
        for(int i=0;i<n;i++){
        	if(str[i]==str[n-i-1]){
        		continue;
        	}
        	else {
        		   for(int j=0;j<n;j++){
        			   if(arr[j]==str[i]){
        				   
        			   }
        			   
        		   }
        		
        	}
        		
        }
        

	}

}
