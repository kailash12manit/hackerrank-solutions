package hackerrank;

import java.util.Scanner;

public class strong_password {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String ss = sc.nextLine();
		System.out.println(minimumNumber(n,ss));
		
		
	}
	
	static int minimumNumber(int n, String str) {
        // Return the minimum number of characters to make the password strong
		int res=0;
	    int len=str.length();
	    char arr[]= str.toCharArray();
	    int digit=0;
	    int Capital_Char=0;
	    int lower_char=0;
	    int spec_char=0;
	    String special_characters = "!@#$%^&*()-+";
	    for( char ch : arr) {
	       		   if(Character.isDigit(ch)) {
	       			digit++;
	       		   }
	       		   if(Character.isLowerCase(ch)) {
	       			lower_char++;
	       		   }
	       		   if(Character.isUpperCase(ch)) {
	       			   Capital_Char++;
	       		   }
	       		   if(special_characters.contains(""+ch)) {
	       			spec_char++;
	       		   }
	    }
	    if(digit==0) {
	    	res++;
	    }
	    if(Capital_Char==0) {
	    	res++;
	    }
	    if(lower_char==0) {
	    	res++;
	    }
	    if(spec_char==0) {
	    	res++;
	    }
	        
		return Math.max(res, 6-len);
    }

}
