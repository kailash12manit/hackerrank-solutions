package hackerrank;

import java.util.Scanner;

public class Common_Child {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String aa = sc.nextLine();
		String bb = sc.nextLine();
	    int res = commonChild(aa,bb);
		System.out.println(res);
	}
	
	/*
	   	HARRY
    	SALLY
    	==AY;
    	
SHINCHAN
NOHARAAA
2   => N H A
	 */
	// Complete the commonChild function below.
    static int commonChild(String str1, String str2) {
        
    	int L[][] = new int[str1.length()+1][str2.length()+1];
        
    	for(int i=0;i<=str1.length();i++){
            for(int j=0;j<=str2.length();j++){
        
            	if(i==0 || j==0)
                    L[i][j]=0;
                
            	else if(str1.charAt(i-1)==str2.charAt(j-1)){
                    L[i][j] = L[i-1][j-1]+1;
                }
                
            	else{
                    L[i][j] = Math.max(L[i-1][j],L[i][j-1]);
                }
            }
        }
        
        return L[str1.length()][str2.length()];
        
    	
    }
}
