package hackerrank;

import java.util.Scanner;

public class the_birthday_bar {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = getWays(s, d, m);
        System.out.println(result);
    }

	private static int getWays(int[] s, int d, int m) {
		// TODO Auto-generated method stub
		int sum=0,j=0,count=0,consecutive=0;
		for (int i : s) {
			sum+=i;
			if(consecutive<m){
				consecutive++;
			}
			if(consecutive==m){
				if(sum==d){
					count++;
				}
				sum-=s[j];
				j++;
			}
		 //System.out.println("SUM : " + sum + " COUNT : " + count + " CONSECUTIVE: " + consecutive);
				
		}
			
		return count;
	}
}
