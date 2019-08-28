package challenges;

public class LSET_FormingMagicSquare {
	public static void main(String[] args) {
		
	}
	
	 // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
    	int arr[]=new int[9];
    	int k=0;
    	for(int []kkk:s) {
    		for(int kk : kkk) {
    			arr[k]=kk;
    			k++;
    		}
    	}
    	int a[]= {8,3,4,1,5,9,6,7,2};
    	int b[]= {4,9,2,3,5,7,8,1,6};
    	int c[]= {2,7,6,9,5,1,4,3,8};
    	int d[]= {6,1,8,7,5,3,2,9,4};
    	int e[]= {8,1,6,3,5,7,4,9,2};
    	int f[]= {2,9,4,7,5,3,6,1,8};
    	int g[]= {4,3,8,9,5,1,2,7,6};
    	int h[]= {6,7,2,1,5,9,8,3,4};
    	
    	
    	
        int a_sum=0;
        int b_sum=0;
        int c_sum=0;
        int d_sum=0;
        int e_sum=0;
        int f_sum=0;
        int g_sum=0;
        int h_sum=0;
        
        int temp = 0;
        
        for(int i=0;i<9;i++) {
        	
        	temp = Math.abs(a[i]-arr[i]);
        	a_sum+=temp;
        	
        	temp = Math.abs(b[i]-arr[i]);
        	b_sum+=temp;
        	
        	temp = Math.abs(c[i]-arr[i]);
        	c_sum+=temp;
        	
        	temp = Math.abs(d[i]-arr[i]);
        	d_sum+=temp;    
        	
        	temp = Math.abs(e[i]-arr[i]);
        	e_sum+=temp;
        	
        	temp = Math.abs(f[i]-arr[i]);
        	f_sum+=temp;
        	
        	temp = Math.abs(g[i]-arr[i]);
        	g_sum+=temp;
        	
        	temp = Math.abs(h[i]-arr[i]);
        	h_sum+=temp;    
        	
    	}
        int min=a_sum;
        
        if(min>b_sum) {
        	min=b_sum;
        }
        
        if(min>c_sum) {
        	min=c_sum;
        }
        
        if(min>d_sum) {
        	min=d_sum;
        }
        
        if(min>e_sum) {
        	min=e_sum;
        }
        
        if(min>f_sum) {
        	min=f_sum;
        }
        
        if(min>g_sum) {
        	min=g_sum;
        }
        
        if(min>h_sum) {
        	min=h_sum;
        }
    	return min;

    }

}
