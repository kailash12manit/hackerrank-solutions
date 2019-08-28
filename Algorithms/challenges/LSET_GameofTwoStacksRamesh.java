package challenges;

import java.util.Scanner;

public class LSET_GameofTwoStacksRamesh {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int g = Integer.parseInt(scanner.nextLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            String[] nmx = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmx[0].trim());

            int m = Integer.parseInt(nmx[1].trim());

            int x = Integer.parseInt(nmx[2].trim());

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");

            for (int aItr = 0; aItr < n; aItr++) {
                int aItem = Integer.parseInt(aItems[aItr].trim());
                a[aItr] = aItem;
            }

            int[] b = new int[m];

            String[] bItems = scanner.nextLine().split(" ");

            for (int bItr = 0; bItr < m; bItr++) {
                int bItem = Integer.parseInt(bItems[bItr].trim());
                b[bItr] = bItem;
            }

            int result = twoStacks(x, a, b);
			System.out.println(result);
        }
	}
	
	static int twoStacks(int x, int[] a, int[] b) {
        /*
         * Write your code here.
         */
        
		int count =0;
		
		int[] prefixA = new int[a.length];
		int[] prefixB = new int[b.length];
		
		int maxIndexA = prefix(prefixA, a , x);
		int maxIndexB = prefix(prefixB, b , x);
		int sum =0;
		while(maxIndexA > 0 &&  maxIndexB > 0) {
			if( prefixA[maxIndexA - 1] + prefixB[maxIndexB - 1] <= x ) {
				count = maxIndexA + maxIndexB;
				break;
			} 
			
			if(prefixA[maxIndexA - 1] > prefixB[maxIndexB - 1] ) {
				maxIndexA--;
			} else {
				maxIndexB--;
			}
		}
		
		
        return count ;
    }
	
	
	static int prefix(int[] prefix, int[] value , int max) {
		int n = value.length;
		prefix[0] = value[0];
		int i=1;
		for(; i < n;i++) {
			prefix[i] = value[i] + prefix[i-1];
			if( prefix[i] >= max) {
				break;
			}
		}
		return i ;
	}

	static int twoStacks12(int x, int[] a, int[] b) {
        /*
         * Write your code here.
         */
        int i=0;
        int j=0;
        int count=0;
        int sum=0;
        while(sum<=x){
        	 if( (i<a.length && j<b.length) && (a[i]<=b[j])){
                sum+=a[i];
                i++;
                
                if(sum>x){
                    break;
                }
                else{
                    count++;
                }
            }
        	else if((i<a.length && j<b.length)){
                sum+=b[j];
                j++;   
                
                if(sum>x){
                    break;
                }
                else{
                    count++;
                }
            }  
        	 System.out.println("SUM:"+sum+" i:"+i+" j:"+j);
        }
        if((i<a.length) && (sum<=x)) {
            while(i<a.length-1 && (sum<=x)) {
                i++;
                sum+=a[i];                
                count++;
                System.out.println("SUM:"+sum+" i:"+i+" j:"+j);
            }            
        }
        
        
        if((j<b.length) && (sum<=x)) {
            while( ( j<b.length-1) && (sum<=x)) {
                j++;
                sum+=b[j];                
                count++;
                System.out.println("SUM:"+sum+" i:"+i+" j:"+j);
            }            
        }
        return count;
    }
	
	static int twoStacks23(int x, int[] a, int[] b) {
        /*
         * Write your code here.
         */
			int lengthB = 0;
			int sum = 0;
			while (lengthB < b.length && sum + b[lengthB] <= x) {
				sum += b[lengthB];
				lengthB++;
			}

			int maxScore = lengthB;
			
			for (int lengthA = 1; lengthA <= a.length; lengthA++) {
				sum += a[lengthA - 1];

				while (sum > x && lengthB > 0) {
					lengthB--;
					sum -= b[lengthB];
				}

				if (sum > x) {
					break;
				}

				maxScore = Math.max(maxScore, lengthA + lengthB);
			}
			return maxScore;
	}
}
