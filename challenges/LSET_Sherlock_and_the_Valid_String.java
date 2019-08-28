package challenges;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LSET_Sherlock_and_the_Valid_String {
	public static void main(String[] args) {
		
		String str = "abcdabcdf";
		
		System.out.println(isValid(str));

		
	}	
	
	static String isValid(String str) {
	
		HashMap<Character,Integer>hm= new HashMap<Character,Integer>();
        char charr[]= str.toCharArray();
        for(char ch:charr) {
             if(!hm.containsKey(ch)) {
                 hm.put(ch,1);
             }
             else {
                 int val = hm.get(ch);
                 val=val+1;
                 hm.put(ch,val);                 
             }        
        }
       
        int highest = 0;
        int lowest = 100000;
        
        Map.Entry<Character,Integer> entry = hm.entrySet().iterator().next();
        Iterator itr = hm.entrySet().iterator();
        while(itr.hasNext()) {
            entry = (Map.Entry) itr.next();
            int val = (int) entry.getValue();
            if(highest<val) {
                highest=val;
            }
            if(val<lowest) {
                lowest=val;
            }            
        }
       
        int countMin = 0;
        int countMax = 0;

        Iterator itr2 = hm.entrySet().iterator();
        while(itr2.hasNext()) {
            entry = (Map.Entry) itr2.next();
            int val1 = (int) entry.getValue();
            if(highest==val1) {
                countMax++;
            }
            if(val1==lowest) {
                countMin++;
            }
        }
        
        if(highest-lowest==0) {
            return "YES";
        }
        if((highest-lowest==1) && (countMax==1)){
            return "YES";
        }
        if(highest-lowest==2) {
            return "NO";
        }
        if(lowest==1 && countMin==1) {
            return "YES";
        }
        return "NO";
		
	}
}

