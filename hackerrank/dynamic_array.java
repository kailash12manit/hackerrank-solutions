/**
 * 
 */
package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author kailash.prajapati
 *
 */
public class dynamic_array {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int N=kb.nextInt();
		int Q=kb.nextInt();
		int lastAns=0;
		
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		for (int i = 0; i <N ; i++) {
			lists.add(new ArrayList<>());
		}
		
		for(int i=0;i<Q;i++){
			int q=kb.nextInt();
			int x=kb.nextInt();
			int y=kb.nextInt();
			
			ArrayList<Integer> str=lists.get((x^lastAns)%N);
			if(q==1){
				str.add(y);				
			}
			else if(q==2){
				lastAns= str.get(y% str.size());
				System.out.println(lastAns);
				
			}
			
		}		
	}

}