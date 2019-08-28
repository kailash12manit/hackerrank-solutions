package hackerrank;
import java.io.IOException;
import java.util.*;

public class Stone_Division_Revisited {
	// Complete the stoneDivision function below.
    static long stoneDivision(long n, long[] s) {
		long ans=1;
    	Arrays.sort(s);  
    	int index_maxima=0;
    	
    	for(int i=0;i<s.length;i++) {
    		if((n%s[i]==0) && (s[i] > (n/s[i])) ) {
    			index_maxima=i;
    			break;
    		}
    	}    	
		//System.out.println("maxima:"+s[index_maxima]);
		for(int j=index_maxima;j>=0;j--) {
			int count=1;
			long size=s[j];
			//System.out.println("size:"+size + " count: "+count);
			for(int k=j-1;k>=0;k--) {
				
				if(size%s[k]==0) {
					count+=(size/s[k]);
					size=size/s[k];
					//System.out.println("size:"+size + " count: "+count);
					break;
				}				
			}
			if(count>ans) {
				ans+=count;
				break;
			}			
		}
		
		return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {     

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] nm = scanner.nextLine().split(" ");

            long n = Long.parseLong(nm[0]);

            int m = Integer.parseInt(nm[1]);

            long[] s = new long[m];

            String[] sItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < m; i++) {
                long sItem = Long.parseLong(sItems[i]);
                s[i] = sItem;
            }

            long result = stoneDivision(n, s);

            System.out.println(String.valueOf(result));            
        }
        scanner.close();
    }
}