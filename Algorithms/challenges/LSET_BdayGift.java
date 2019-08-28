package challenges;

public class LSET_BdayGift {
	public static void main(String[] args) {
		int arr[] = {1,2,2,2};
		System.out.println(solve(arr));
	}
	
	static double solve(int[] balls) {
		double res=0;
		for(int kk:balls) {
			res = res + ( 0.5 * kk);
		}
		return res;
    }
}
