package hackerrank;

import java.util.Scanner;
import java.util.Stack;

class Operation{
	int type;
	String argument;
	
	Operation(int type, String args){
		this.type=type;
		this.argument= args;
	}
}
public class simple_text_editor {
	 
	public static void main(String[] args) {
			
			Stack<Operation> operation = new Stack<Operation>();
			
			Scanner sc = new Scanner(System.in);
	        StringBuffer sb = new StringBuffer();
	        
	        int q = sc.nextInt();
	        while(q-->0){
	            
	        	
	        	int type = sc.nextInt();
	        	
	        	if(type==1){
	        		String w= sc.nextLine();
	        		sb.append(w);
	        		operation.push(new Operation( type,w));
	        	}
	        	else if(type==2){
	        			int k= sc.nextInt();
	        			operation.push(new Operation( type, sb.substring(sb.length()-k)));
	                    sb.delete(sb.length()-k,sb.length());
	        	}
	        	else if(type==3){
	        			int k= sc.nextInt();
	        			System.out.println(sb.charAt(k-1));
	        	}
	        	else{
	        		
	        		Operation op= operation.pop();
	        		
	        		if(op.type==1){
	        			sb.delete( sb.length()- op.argument.length(), sb.length() );        			
	        		}
	        		
	        		else{
	        			sb.append(op.argument);
	        		}
	        	}
	        System.out.println(sb);
	        
	        }
	        sc.close();
	   }
}
