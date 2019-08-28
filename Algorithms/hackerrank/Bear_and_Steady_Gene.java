package hackerrank;
import java.io.*;
import java.util.*;

public class Bear_and_Steady_Gene {
	
	 // Complete the steadyGene function below.
    static int steadyGene(String str) {
    	int arr[]=new int[4];
    	int len=str.length();
    	int req_fre=len/4;
    	int front=0;
    	int back_index=len;
    	
    	for(int i=0;i<len;i++) {
    		if(str.charAt(i)=='A') {
    			arr[0]++;
    			if(arr[0]>req_fre) {
    				front=i;
    				break;
    			}
    		}
    		else if(str.charAt(i)=='C') {
    			arr[1]++;
    			if(arr[1]>req_fre) {
    				front=i;
    				break;
    			}
    		}
    		else if(str.charAt(i)=='T') {
    			arr[2]++;
    			if(arr[2]>req_fre) {
    				front=i;
    				break;
    			}
    		}
    		else if(str.charAt(i)=='G') {
    			arr[3]++;
    			if(arr[3]>req_fre) {
    				front=i;
    				break;
    			}
    		}
    	}
    	
    	
    	
    	for(int i=len-1;i>=0;i--) {
    		if(str.charAt(i)=='A') {
    			if(arr[0]>req_fre) {
    				back_index=i;
    				break;
    			}
    			else {
    				arr[0]++;
    			}
    		}
    		else if(str.charAt(i)=='C') {    			
    			if(arr[1]>req_fre) {
    				back_index=i;
    				break;
    			}
    			else {
    				arr[1]++;
    			}
    		}
    		else if(str.charAt(i)=='T') {
    			if(arr[2]>req_fre) {
    				back_index=i;
    				break;
    			}
    			else {
    				arr[2]++;
    			}
    		}
    		else if(str.charAt(i)=='G') {    			
    			if(arr[3]>req_fre) {
    				back_index=i;
    				break;
    			}
    			else {
    				arr[3]++;
    			}
    		}
    	}
    	    	
        return back_index-front+1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String gene = scanner.nextLine();

        int result = steadyGene(gene);

        System.out.println(String.valueOf(result));        
        scanner.close();
    }
}
