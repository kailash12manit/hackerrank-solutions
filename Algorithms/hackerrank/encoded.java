/**
 * 
 */
package hackerrank;

import java.util.Arrays;

/**
 * @author kailash
 *
 */
public class encoded {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "13226#24#"; // abzx
		int []arr =frequency(str);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	static int[] frequency(String s) {
	int len= s.length();
	int [] myarray = new int[26];
	Arrays.fill(myarray, 0);
	char [] str=s.toCharArray();
	for(int i=0;i<str.length-1;i++){
    
		if( str[i+2]=='#'){
		
			int k= ( str[i]-'0' )*10+( str[i+1]-'0' ) ;
			//System.out.println(k);
		    myarray[k-1]++;
		    i=i+2;
		   
		}
		else{
			int k=( str[i]-'0' );
			myarray[k-1]++;
		}
			
	}
	return myarray;
    }

}
