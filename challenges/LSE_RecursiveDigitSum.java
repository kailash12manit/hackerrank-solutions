package challenges;

public class LSE_RecursiveDigitSum {
	public static void main(String[] args) {
		System.out.println(superDigit("123",3));
	}
	static int superDigit(String n, int k) {
        if(n.length()==1) {
        	return Integer.parseInt(n);
        }
		char[] arr = n.toCharArray();
        long temp=0;
        for(char ch : arr) {
        	temp+=ch-'0';
        }
        temp=(temp*k);
        return DigitSum(String.valueOf(temp));
    }
	private static int DigitSum(String number) {
		// TODO Auto-generated method stub
		if(number.length()==1) {
        	return Integer.parseInt(number);
        }
		char[] arr = number.toCharArray();
        int temp=0;
        for(char ch : arr) {
        	temp+=ch-'0';
        }
        return DigitSum(String.valueOf(temp));		
	}
}
