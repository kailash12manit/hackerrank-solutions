package hackerrank;

public class check_PerfectSquare {
	
	public static void main(String[] args) {
		 System.out.println(isPerfectSquare(35)? "Yes": "No");
		 System.out.println(isPerfectSquare(49)? "Yes": "No");
	}

	private static boolean isPerfectSquare(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;sum<=n;i+=2){
			sum+=i;
			if(sum==n){
				return true;
			}
		}
		return false;
	}
}
