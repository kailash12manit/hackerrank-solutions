package hackerrank;

class CountSquares{

	public double countSquares(int a, int b) {
		// TODO Auto-generated method stub
		double cnt=0;
		
		cnt= Math.floor(Math.sqrt(b))-Math.ceil(Math.sqrt(a))+1;
			
		return cnt;
	}
	
	
}
public class PerfectSquares {

	public static void main(String[] args)
    {
        int a = 9, b = 25;
        CountSquares obj = new CountSquares();
        System.out.print("Count of squares is " +
                         (int)obj.countSquares(a, b));
    }
	
}
