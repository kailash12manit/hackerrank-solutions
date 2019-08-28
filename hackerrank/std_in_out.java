package Basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class std_in_out {
	public static void main(String[] args) {
		
		File file= new File("C:\\Users\\kailash\\workspace\\hackerrank\\src\\Basics\\input.txt");
		try {
			Scanner scan= new Scanner(file);
			int t= scan.nextInt();	
			while(t-->0)
				{
					int i = scan.nextInt();
					scan.nextLine();
		            double d= scan.nextDouble();
		            scan.nextLine();
		            String s= scan.nextLine();
		            
		            System.out.println("String: " + s);
		            System.out.println("Double: " + d);
		            System.out.println("Int: " + i);
					
				}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
