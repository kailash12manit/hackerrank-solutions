package challenges;

public class LSET_EqualStacks {
	public static void main(String[] args) {
		
		int h1[]= {3 ,2 ,1 ,1 ,1};
		int h2[]= {4 ,3 ,2};
		int h3[]= {1 ,1, 4, 1};
		System.out.println(equalStacks(h1,h2,h3));
		
	}
	
	 /*
     * Complete the equalStacks function below.
     */
	static int equalStacks(int[] h1, int[] h2, int[] h3) {
	    int max=0;
		int h1_total=0;
		int h2_total=0;
		int h3_total=0;
		
		int i=0, j=0,k=0;
		
		for(int kk:h1) {
			h1_total+=kk;
		}
		for(int kk:h2) {
			h2_total+=kk;
		}
		for(int kk:h3) {
			h3_total+=kk;
		}
		
		//System.out.println("h1_total: "+h1_total+"\nh2_total: "+h2_total+"\nh3_total: "+h3_total+"\n");
		
		while(true) {
			if(h1_total>h2_total || h1_total>h3_total) {
				h1_total-=h1[i++];
				
			}
			if(h2_total>h3_total || h2_total>h1_total) {
				h2_total-=h2[j++];
			}
			
			if(h3_total>h2_total || h3_total>h1_total) {
				h3_total-=h3[k++];
			}
			//System.out.println("h1_total: "+h1_total+"\nh2_total: "+h2_total+"\nh3_total: "+h3_total+"\n");
			if(h1_total==h2_total && h1_total==h3_total) {
				max= h1_total;
				break;
			}
		}
		
		
		return max;

	}

}
