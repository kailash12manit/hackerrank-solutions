package challenges;

import java.util.Scanner;
import java.util.Stack;
/*
8
1 abc
3 3
2 3
1 xy
3 2
4
4
3 1
 
 
 
append - Append string  to the end of .
delete - Delete the last  characters of .
print - Print the  character of .
undo - Undo the last (not previously undone) operation of type  or , reverting  to the state it was in prior to that operation.

 */
public class LSET_SimpleTextEditor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q=sc.nextInt();		
		Stack<String>stack= new Stack<String>();
		String str="";
		stack.push(str);
		
		while(q-->0) {
			int type =sc.nextInt();
			
			if(type==4) {   // 4
				stack.pop();
				str=stack.peek();
			}
			else if(type==1) {
					String aa=sc.next();
					str+=aa;
					stack.push(str);	
					
			}
			else if(type==2) {
						int k=sc.nextInt();
						str=str.substring(0,str.length()-k);			
						stack.push(str);
			} else if(type==3) {
					int k=sc.nextInt()-1;
					System.out.println(str.charAt(k));				
				}			
						
		}		
	}
}
