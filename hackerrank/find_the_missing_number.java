package hackerrank;

public class find_the_missing_number {
	
	public static void main(String args[]){
		
        int a[] = {1,2,4,5,6};
        int miss = getMissingNo(a,5);
        System.out.println(miss);
    }

	private static int getMissingNo(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		int x1=arr[0];
		int x2=1;
		
		for(int i=1;i<n;i++){
			x1= x1 ^ arr[i];
		}
		for(int i=2;i<=n+1;i++){
			x2= x2^i;
		}
		
		return x1^x2;
		
	}
}
