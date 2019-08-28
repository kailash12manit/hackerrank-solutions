package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LSET_DynamicArray {
	 private static final Scanner sc = new Scanner(System.in);
	 
	 public static void main(String[] args) {		 
		int n=2;
		int m=5;		
		List<List<Integer>> aList =  new ArrayList<List<Integer> >(n);
		for(int i=0;i<5;i++) {
			    List<Integer> a1 = new ArrayList<Integer>(3); 
		        a1.add(sc.nextInt()); 
		        a1.add(sc.nextInt()); 
		        a1.add(sc.nextInt()); 
		        aList.add(a1); 		        
		}
		List<Integer> res = dynamicArray(n,aList);
		System.out.println(res);
		 
		
	}	 
	 
	// Complete the dynamicArray function below.
	 static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
		 List<List<Integer>> sequence = new ArrayList<List<Integer>>(n);
         List<Integer> result = new ArrayList<Integer>();
         int m = queries.size();
         
         for(int i=0;i<n;i++) {
        	 sequence.add(new ArrayList<Integer>());
         }
         
         int lastAnswewr = 0;
         
         for(int i=0;i<m;i++) {
             List<Integer> al = queries.get(i);
             if(al.get(0)==1) {
                 sequence.get((al.get(1)^lastAnswewr)%n ).add(al.get(2));
                 System.out.println("lastAnswewr:"+lastAnswewr);
                 
             }else {
            	 List<Integer> seq = sequence.get((al.get(1) ^ lastAnswewr) % n);
            	 lastAnswewr = seq.get(al.get(2) % seq.size());
            	 result.add(lastAnswewr);
             }    
         }
         return result;		 
	 }
}
