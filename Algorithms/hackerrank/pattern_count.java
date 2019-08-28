/**
 * 
 */
package hackerrank;

import java.util.Scanner;

/**
 * @author kailash.prajapati
 *
 */
public class pattern_count {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = patternCount(s);
            System.out.println(result);
        }
    }

	private static int patternCount(String str) {
		// TODO Auto-generated method stub
		int n=str.length();
		int count=0;
		for(int i=0;i<n;i++){
			if(str.charAt(i)=='1'){
				for(int j=i+1;j<n;j++){
					if(str.charAt(j)=='0'){
						continue;
					}
					else if(str.charAt(j)=='1' && str.charAt(j-1)=='0'){
						 count++;
						 i=j;
					}
					else {  
						   i=j;
							break;
						 } 
				}
			}
					
		}			
			
		return count;
	}

}
