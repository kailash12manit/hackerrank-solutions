package hackerrank;

import java.util.Scanner;

public class pangrams {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        String str = in.nextLine();        
        System.out.println(pangram(str));         
	}
	
	static String pangram(String str) {
		int flag=1;
		int len=str.length();
		int small[]=new int[26];
		int cap[]= new int[26];
		int space=0;	
		
		char arr[]= str.toCharArray();
		for(char ch : arr) {
			if(ch==' ') {
				space++;
			}
			if( Character.isLowerCase(ch) ) {
				small[ ch-'a' ]=1;
			}
			if(Character.isUpperCase(ch)) {
				cap[ ch-'A' ]=1;
			}		
		}
	    if(space==0) {
	    	flag=0;
	    }
	    for(int i=0;i<26;i++) {
	    	if(small[i]==0 || cap[i]==0 ) {
	    		flag=0;
	    		break;
	    	}
	    }	    
		
		if(flag==0){ 
            return "not pangram";
        }
        else{
            return "pangram";
        }
    }

}
