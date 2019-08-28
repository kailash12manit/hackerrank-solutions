package hackerrank;

import java.util.Scanner;

public class Sherlock_andAnagrams {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		sc.nextLine();
		while(q-->0){
			String str = sc.nextLine();
			int res = sherlockAndAnagrams(str);
			System.out.println(res);
		}
	}
	
    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
      return s.length();
    }    

}
