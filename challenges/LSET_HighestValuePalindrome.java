package challenges;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class LSET_HighestValuePalindrome {
	 private static final Scanner scanner = new Scanner(System.in);
	 
	 public static void main(String[] args) {
		 
	        String[] nk = scanner.nextLine().split(" ");
	        int n = Integer.parseInt(nk[0]);
	        int k = Integer.parseInt(nk[1]);
	        String s = scanner.nextLine();
	        String result = highestValuePalindrome(s, n, k);
	        System.out.println(result);
	        scanner.close();
		
		
	}
	
	static String highestValuePalindrome(String str, int n, int k) {
           char arr[]= str.toCharArray();
          
          
          
		
		
          
		
		return "";	
		
    }
	
	
}
