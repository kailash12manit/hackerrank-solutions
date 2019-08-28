package challenges;

public class LSET_2DArray_DS {
	
	public static void main(String[] args) {
		int[][] arr = { {-9, -9, -9,  1, 1, 1 },{ 0 ,-9 , 0  ,4 ,3, 2 } , {-9, -9 ,-9 , 1 ,2, 3},
				{0 , 0 , 8 , 6, 6 ,0},{0,  0 , 0, -2, 0, 0} , { 0  ,0,  1  ,2, 4, 0 }};
		
		System.out.println(hourglassSum(arr));
	}
	
	// Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
       int [][]res=new int[4][4];
       for(int i=0;i<4;i++){
           for(int j=0;j<4;j++){
               int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1]
                   + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];                  
               res[i][j]=sum;
           }           
       }  
       int max=res[0][0];
       for(int []kk:res){
           for(int kkp:kk){
               System.out.print(kkp+" ");
               if(kkp>max){
                   max=kkp;
               }
           }
           System.out.println();
       }
       return max;

    }

}
