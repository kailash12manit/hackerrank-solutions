package challenges;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class LSET_SparseArrays {
	 private static final Scanner sc = new Scanner(System.in);
	 
	 public static void main(String[] args) {		  		
		
		
		
	}
	static int[] matchingStrings(String[] strings, String[] queries) {
		int q_len = queries.length;
		int []res=new int[q_len];
		
		HashMap<String,Integer>hm= new HashMap<String,Integer>();
		for(String ch:strings) {
			 if(!hm.containsKey(ch)) {
				 hm.put(ch,1);
			 }
			 else {
				 int val = hm.get(ch);
				 val=val+1;
				 hm.put(ch,val);				 
			 }		
		}
		int k=0;
		for(String querie : queries) {
			if(hm.containsKey(querie)) {
				int val = hm.get(querie);
				res[k]=val;
			}
			else {
				res[k]=0;
			}
			k++;
		}
		return res;
    }

	
}


