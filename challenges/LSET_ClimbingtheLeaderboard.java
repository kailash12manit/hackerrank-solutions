package challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LSET_ClimbingtheLeaderboard {
	
	public static void main(String[] args) {
	     int scores [] = {100, 100, 50, 40, 40, 20, 10};
	     int alice [] = { 5, 25, 50, 120};
	     climbingLeaderboard(scores,alice);
		
	}
	
	// Complete the climbingLeaderboard function below.
    static void climbingLeaderboard(int[] scores, int[] alice) {
    	int res[] =new int[alice.length];
        int k=0;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int kk: scores) {
            if(!al.contains(kk)) {
                al.add(kk);
            }
        }
        //System.out.println(al);
        for(int kk: alice) {
            res[k]=calculate(al,kk);
            k++;            
        }
        
        for(int kk:res) {
            System.out.println(kk);
        }
        
       
    }
    
    static int calculate(ArrayList<Integer> al,int kk) {
    	int temp=0;
    	for(int i=0;i<al.size();i++) {
            //System.out.println("al.get(i) "+al.get(i));
            if(kk>al.get(i) || kk==al.get(i)) {
            	temp=i+1;
                break;
            }
                                            
            if(kk<al.get(al.size()-1)) {
                temp=al.size()+1;
                break;
            }
        }
    	
    	
    	
    	return temp;
    }
	
}