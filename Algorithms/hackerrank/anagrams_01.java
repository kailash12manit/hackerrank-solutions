package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class anagrams_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str01= sc.nextLine();
		String str02 = sc.nextLine();
		
		if((isAnagrams(str01,str02)==true)){
			System.out.println("Anagrams");
		}
		else{
			System.out.println("NOT anagrams");
		}
		
	}

	private static boolean isAnagrams(String str01, String str02) {
		// TODO Auto-generated method stub
		char[] arr= str01.toCharArray();
		char [] brr = str02.toCharArray();
		int len01=str01.length();
		int len02= str02.length();
		
		if(len01!=len02){
			return false;
		}
		int count1[] = new int[256];
		Arrays.fill(count1, 0);
		int count2[] = new int[256];
		Arrays.fill(count2,0);
		
		for(int i=0;i<len01;i++){
			count1[arr[i]]++;
		}
		for(int i=0;i<len01;i++){
			count2[brr[i]]++;
		}
		for(int i=0;i<256;i++){
			if(count1[i]!=count2[i]){
				return false;
			}
		}
		return true;
	}
}
