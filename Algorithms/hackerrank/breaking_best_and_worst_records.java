package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class breaking_best_and_worst_records {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int min=s[0];
        int max=s[0];
        int min_count=0;
        int max_count=0;
        for(int i=1;i<s.length;i++){
        	if(s[i]>max){
        		max_count++;
        		max=s[i];
        	}
        	if(s[i]<min){
        		min_count++;
        		min=s[i];      		
        		
        	}
        }
        System.out.print(max_count+" "+min_count );
    }
}