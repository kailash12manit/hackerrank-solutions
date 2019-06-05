package string;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Count_max_Solution{
	public static final int NUM_LETTERS =26;

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	     int length = scan.nextInt();
	     String str = scan.next();
	     
	     if(length<=1){
	    	 System.out.println(0);
	    	 return;
	     }
	     
	     int [][]pair= new int[NUM_LETTERS ][NUM_LETTERS];
	     int [][]count= new int[NUM_LETTERS][NUM_LETTERS];
	     
	     for(int i=0;i<length;i++){
	    	 char letter=str.charAt(i);
	    	 int letterNumber= letter-'a';
	    	 
	    	 //update row	    	 
	    	 for(int col=0;col<NUM_LETTERS; col++){
	    		 
	    		 if(pair[letterNumber][col]==letter){
	    			 count[letterNumber][col]=-1;
	    		 }
	    		 if(count[letterNumber][col]!=-1){
	    			 pair[letterNumber][col]=letter;
	    			 count[letterNumber][col]++;
	    		 }
	    	 }
	    	 
	    	 //update column
	    	//update row	    	 
	    	 for(int row=0;row<NUM_LETTERS; row++){
	    		 
	    		 if(pair[row][letterNumber]==letter){
	    			 count[row][letterNumber]=-1;
	    		 }
	    		 if(count[row][letterNumber]!=-1){
	    			 pair[row][letterNumber]=letter;
	    			 count[row][letterNumber]++;
	    		 }
	    	 }
	    	 	    	 
	     }
	     int max=0;
	     for(int row=0;row<NUM_LETTERS;row++){
	    	 for(int col=0;col<NUM_LETTERS;col++){
	    		 max= Math.max(max,count[row][col]);
	    	 }
	    	 
	     }
	     System.out.println(max);
	    
	}
}