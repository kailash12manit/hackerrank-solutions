package string;

/*
 * Given a string , find the number of "unordered anagrammatic pairs" of substrings. 
 * In other words, find the number of unordered pairs of substrings of  that are anagrams of each other.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Sherlock_and_anagrams {
	
	public static void main(String[] args) {
		Sherlock_and_anagrams obj = new Sherlock_and_anagrams();
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		sc.nextLine();
		while(t-->0){
			int count=0;
			String str= sc.nextLine();
			//System.out.println(str);
			char[] arr= str.toCharArray();
			
			for(int i=1;i<arr.length;i++){
				
				for(int j=0;j<arr.length-i+1;j++){
					
					String s1=str.substring(j,j+i);
				
					for(int k=j+1;k<arr.length-i+1;k++){
						String s2= str.substring(k,k+i);
					
						//System.out.println(s1+" "+s2);
						
						if(obj.isAnagrams(s1,s2)==1){
							//System.out.println("yes");
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
	
	public int isAnagrams(String a,String b){
	
		System.out.print(a+" ");
		System.out.println(b);
		char []arr= a.toCharArray();
		char []brr= b.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(brr);
		if(a.length()==b.length()){
			for(int i=0;i<a.length();i++){
				if(arr[i]!=brr[i]){
					return 0;
				}
			}
			return 1;
		}
		return 0;
	}
}
