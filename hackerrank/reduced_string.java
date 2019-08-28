package hackerrank;

import java.util.Scanner;

public class reduced_string {
	
	static String super_reduced_string(String str){ 
       String  ans="Empty String";
       boolean flag=true;
       int i=0;
       while(flag) {
    	   for(i=0;i<str.length()-1;i++) {
    		   if(str.charAt(i)==str.charAt(i+1)) {
    			   str=str.substring(0,i)+str.substring(i+2);
    			   //System.out.println(str);
    			   i=-1;
    			   flag=false;
    		   }   		   
    	   }
    	   if(flag==true) {
			   break;
		   }
       }
       if(str.length()>0) {
    	   ans=str;       
       }
       return ans;
     
    }
	
	public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        String result = super_reduced_string(s);
	        System.out.println(result);	       
	    }
	}