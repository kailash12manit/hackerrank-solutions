package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LSET_SherlockandAnagrams {
	public static void main(String[] args) {
		String str = "abba";
		
		System.out.println(sherlockAndAnagrams(str));
		
	}
	// Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
    	int count=0;
    	int len=s.length();
    	List<String> al = new ArrayList<String>();
    	for(int i=0;i<len;i++) {
    		for(int j=i+1;j<=len;j++) {
    			al.add(s.substring(i,j));
    		}
    	}
    	//System.out.println(al);
    	for(int i=0;i<al.size();i++) {
    		for(int j=i+1;j<al.size();j++) {
    			String aa = al.get(i);
    			String bb = al.get(j);
    			if(aa.length()==bb.length() && isAnagram(aa,bb)) {
    				count++;
    				//System.out.println("isAnagram : "+aa+" : "+bb );
    			}    			
    		}
    	}   	
    	return count;
    }
    
    static boolean isAnagram(String a , String b) {
		char []arr = a.toCharArray();
		char []brr = b.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(brr);
		
		for(int i=0;i<a.length();i++) {
			if(arr[i]!=brr[i]) {
				return false;
			}
		}
		return true;
    	
    }

}
