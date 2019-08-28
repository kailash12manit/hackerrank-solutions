package hackerrank;

import java.util.Scanner;

public class DorseyThief_2 {
	public static void main(String [] args){
    	Scanner scan=new Scanner(System.in);
    	int n=scan.nextInt();
    	int x=scan.nextInt();
    	long [] p=new long[x+1];
    	
    	int [] w=new int[n];
    	long [] v=new long[n];
    	
    	for(int i=0;i<=x;i++){
    		p[i]=-1;
    	}
    	
    	p[0]=0;
    	for(int i=0;i<n;i++){
    		v[i]=scan.nextLong();
    		w[i]=scan.nextInt();
    	}
    	for(int i=0;i<n;i++){
    		
    		for(int j=x;j>=w[i];j--){
    			
                if(p[ j-w[i] ]==-1){
                    continue;
                }
                System.out.print("j:"+j+" w[i]:"+w[i]);
                
    			long newCost= p[j-w[i]]+v[i];
    			
    			if(p[j]<newCost){
    				p[j]=newCost;
    			}
    			System.out.println(" P[j]: "+p[j]);
    			
    		}
    	}
    	if(p[x]==-1){
    		System.out.println("Got caught!");
    	}else{
    		System.out.println(p[x]);
    	}
    }
}