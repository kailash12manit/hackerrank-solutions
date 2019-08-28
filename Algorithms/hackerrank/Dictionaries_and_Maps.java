/**
 * 
 */
package hackerrank;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author kailash.prajapati
 *
 */
public class Dictionaries_and_Maps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<String,Integer>map= new HashMap<String,Integer>();
        int n = in.nextInt();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone);
             
        }
        while(in.hasNext()){
            String s = in.next();
            if(map.containsKey(s)){
            	System.out.println(s+"="+ map.get(s));
            }
            else
            {
            	System.out.println("Not found");
            }
        }
        in.close();
	}
}
