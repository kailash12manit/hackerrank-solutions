package string;
import java.util.Scanner;

public class super_reduced_string 
{
    static String super_reduced_string(String str){ 
        int len=str.length();
        int i=0;
        while(i<len-1){
        	
        	char current= str.charAt(i);
        	char next = str.charAt(i+1);
        	
        	if(current==next){
        		str= str.substring(0,i)+ str.substring(i+2);
        		len=str.length();
        		i=0;
        		continue;
        	}
        	i++;
        }
        if(str.length()==0){
        	return "Empty String";
        }
        else{
        	return str;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}