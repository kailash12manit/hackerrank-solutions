package hackerrank;

import java.util.Arrays;

import java.util.Scanner;
import java.util.TreeSet;

public class Climbing_the_Leaderboard {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int scoresCount = scanner.nextInt();
		int[] scores = new int[scoresCount];
		for (int i = 0; i < scoresCount; i++) {
	            scores[i] = scanner.nextInt();
	    }
		
		int aliceCount = scanner.nextInt();
        int[] alice = new int[aliceCount];
       
        for (int i = 0; i < aliceCount; i++) {
            alice[i] = scanner.nextInt();
        }
        int[] result = climbingLeaderboard(scores, alice);
        for (int i = 0; i < result.length; i++) {
        	System.out.println(String.valueOf(result[i]));
         }
	}
	private static int[] climbingLeaderboard(int[] scores, int[] alice) {
		// TODO Auto-generated method stub
		int[] result = new int[alice.length];
		
		TreeSet<Integer> hs = new TreeSet<Integer>();
		for(int kk:scores) {
			hs.add(kk);
		}
		
		int[] array = hs.stream().mapToInt(i->i).toArray();
		
		//System.out.println("scores:"+hs);
		for(int i=0;i<alice.length;i++) {
			int temp = alice[i];
			int kk =Arrays.binarySearch(array,temp);            
            //System.out.print(kk+" ");
            if(kk<0) {              
                kk=-kk-2;
            }
            result[i]=hs.size()-kk;
		}
		System.out.println();
		
		return result;
	}
}