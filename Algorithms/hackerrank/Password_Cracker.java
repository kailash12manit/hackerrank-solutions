package hackerrank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Password_Cracker {
	 
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int flag=1;
            ArrayList<String>al = new ArrayList<String>();
            ArrayList<String>sol = new ArrayList<String>();
            
            int n=sc.nextInt();   //
            //System.out.println(n); 
            sc.nextLine();
            while(n-->0){   
                al.add(sc.next());  //
            }
            sc.nextLine();
            
            String loginAttempt= sc.nextLine();    // 
            //System.out.println(loginAttempt); //wedowhatwemustbecausewecan
            int j=0; 
            for(int i=j+1;i<=loginAttempt.length();i++){
            	
            	String str= loginAttempt.substring(j,i);
            	           	
            	if(al.contains(str)){
            		sol.add(str);
            		j=i;
            		continue;
            	}
            	else if(!al.contains(str)){
            		flag=1;
            		//break;
            	}
            	
            	
            	Iterator itr= al.iterator();
                
            	while(itr.hasNext()){
                	String temp=itr.next().toString(); 
                	//System.out.print("temp:"+temp);
                	
                	if(temp.contains(str)){
                		//System.out.print(str);
                		flag=0;
                	}
                	else{
                		continue;
                	}
                }
                //System.out.print(" ");
                
            }
                   
        if(flag==1){
        	System.out.print("WRONG PASSWORD");
        }
        else{
              Iterator itr2= sol.iterator();
               while(itr2.hasNext()){
                   System.out.print(itr2.next()+" ");
               }
        }
        System.out.println();           
        }
        
    }
	
	 
}
