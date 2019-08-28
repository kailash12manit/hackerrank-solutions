package hackerrank;

public class missing_one_number {
	public static void main(String[] args) {
		 int a[] = {1,2,4,5,6,7,8,9,3};
	        int miss = getMissingNo(a,9);
	        System.out.println(miss);
		
	}

	private static int getMissingNo(int[] a, int n) {
		// TODO Auto-generated method stub
		int x1=a[0];
		int x2=1;
		
		for(int i=1;i<n;i++){
			x1^=a[i];
		}
		for(int i=2;i<=n+1;i++){
			x2^=i;
		}
		
		return x1^x2;
	}
}
