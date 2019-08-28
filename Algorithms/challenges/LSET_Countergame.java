package challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LSET_Countergame {
	public static void main(String[] args) {
	     long n=6;
	     System.out.println(counterGame(n));   // Richard  OR Louise
		
	}
    
    static String counterGame(long n) {
        //Louise always starts.
        int temp=0;
        
        List<Long> al = new ArrayList<Long>();
        
        for(int i=0;i<64;i++) {
        	al.add( (long) Math.pow(2,i));
        }
        /*
        for(Long kk:al) {
        	 System.out.println(kk);
        }
        */        
        String name="Louise";
        System.out.println("n:  "+n+"  name: "+name);
        while(n>1) {
        	int kk = Collections.binarySearch(al,n);
            System.out.println("kk "+kk);
             if(kk> 0 ) {
            	 n=n>>1;
             }
             else {
            	 kk = kk*(-1);
            	 n = n- (al.get(kk-2));
             }
             if(n==1) {
            	 break;
             }
             if(name.equals("Louise")) {
                name = "Richard";
             }else {
            	 name="Louise";
             }
             
             
             System.out.println("n: 2  "+n+"  name: "+name);
             
        }
        
        return name;  
    }
}