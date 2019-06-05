package hackerrank;
//https://www.hackerrank.com/challenges/apple-and-orange
import java.util.Scanner;

public class apple_and_orange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//s t 
		//a b
		//m n
		//m apple falls from point . a 
		//n orange falls from point b . */
		Scanner sc= new Scanner(System.in);
		int s,t,a,b,m,n;
		s=sc.nextInt();
		t=sc.nextInt();
		a=sc.nextInt();
		b=sc.nextInt();
		m=sc.nextInt();
		n=sc.nextInt();
		int count_apple=0;
		for(int i=0;i<m;i++){
			int D=sc.nextInt();
			count_apple+=between(s,t , a+D);
		}
		int count_orange=0;
		for(int i=0;i<n;i++){
			int D=sc.nextInt();
			count_orange+=between(s,t , b+D);
		}
		System.out.println(count_apple);
		System.out.println(count_orange);
			
	}
	public static int between(int s, int t, int x) {
	    if(x >= s && x <= t){
	    	return 1;
	    }
	    return 0;
	}
}
