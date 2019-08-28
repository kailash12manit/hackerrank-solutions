package hackerrank;

import java.io.BufferedReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class picking_numbers {
	
	public static int pickingNumbers(List<Integer> al) {
        Collections.sort(al);
        System.out.println(al);
        int min=al.get(0);
        int len=1;
        int tempLen=1;
        for(int i=1;i<al.size();i++){
            int temp=al.get(i);
              if(temp-min<=1){
                    tempLen++;
                    len=Math.max(len, tempLen);
              }
              else{
                    min=temp;
                    len=Math.max(len, tempLen);
                    tempLen=1;
                }
            //System.out.println(len+" "+tempLen);
        } 

        return len;
    }
    public static void main(String[] args) {       
    	
    }
}

