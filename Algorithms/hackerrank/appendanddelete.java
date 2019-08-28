package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class appendanddelete {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        cal(s,t,k);        
    }
    public static void cal(String s, String t, int k){
        int a= s.length();
        int b= t.length();
        int i=0;        
        while(i<s.length() && i<t.length() && s.charAt(i)==t.charAt(i)){
        	i++;
        }
        int len= a-i;
        len =len+(b-i);
        
        if (len <= k && ((k - len) % 2 == 0 || (k - len) > 2 * i)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}