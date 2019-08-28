package hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tag_Content_Extractor {
	public static void main(String[] args) {
		
		String regex = "<([^<>]+)>([^<>]+)</\\1>";
		
	    Pattern pattern = Pattern.compile(regex);
	      
        Scanner in = new Scanner(System.in);
	    int testCases = Integer.parseInt(in.nextLine());
	    while(testCases>0){
	        String line = in.nextLine();
	        Matcher matcher = pattern.matcher(line);
	        int counter = 0;
	        while (matcher.find()) {
	            System.out.println(matcher.group(2));
	            counter++;
	        }
	        if (counter == 0) System.out.println("None");
	        testCases--;
	     } 
	}
}
