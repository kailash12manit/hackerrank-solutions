/**
 * 
 */
package hackerrank;

import java.util.Scanner;

/**
 * @author kailash.prajapati
 *
 */
public class Beautiful_Days_at_the_Movies {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long i=in.nextInt();
		long j=in.nextInt();
		long k=in.nextInt();
		long count=0;
		for(long number=i;number<=j;number++){
			long reverse=0;		
			while( number != 0 )
			{
			    reverse = reverse * 10;
			    reverse = reverse + number%10;
			    number = number/10;
			}
			long diff=(i-reverse);
			
            if(Math.abs(diff)%k==0){
				count++;
                number=i+k;
			}
            else
            {
                number=i;
            }
			
		}
		System.out.println(count);
	}

}
