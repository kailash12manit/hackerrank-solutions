package hackerrank;

import java.util.Scanner;

public class d3_surface_area {

	static int surfaceArea(int[][] arr,int h,int w) {
        // Complete this function
        /*
        1 3 4
        2 2 3
        1 2 4
        */
        int count=2*(h*w);// for ground serface + for uper surface
        if(h==1 && w==1){
            return 6;
        }
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                
                if( i>0 && i<(h-1) && j>0 && j<(w-1)){
                    if(arr[i][j-1]<arr[i][j]){
                        count+=(arr[i][j]-arr[i][j-1]);
                    }
                    if(arr[i][j+1]<arr[i][j]){
                        count+=(arr[i][j]-arr[i][j+1]);
                    }
                    if(arr[i-1][j]<arr[i][j]){
                        count+=(arr[i][j]-arr[i-1][j]);
                    }
                    if(arr[i+1][j-1]<arr[i][j]){
                        count+=(arr[i][j]-arr[i+1][j-1]);
                    }        
                }
                else if(i==0){
                        if(j==0){
                            count+=(2*arr[i][j]); // both sides
                            if(arr[i][j+1]<arr[i][j]){
                                 count+=(arr[i][j]-arr[i][j+1]);
                            }
                            if(arr[i+1][j]<arr[i][j]){
                                count+=(arr[i][j]-arr[i+1][j]);
                            }                                           
                        }
                        else if(j==(w-1)){
                            count+=(2*arr[i][j]);
                            if(arr[i+1][j]<arr[i][j]){
                                 count+=(arr[i][j]-arr[i+1][j]);
                            }
                            if(arr[i][j-1]<arr[i][j]){
                                count+=(arr[i][j]-arr[i][j-1]);
                            } 
                        }
                        else {
                              count+=arr[i][j];
                              if(arr[i][j+1]<arr[i][j]){
                                  count+=(arr[i][j]-arr[i][j+1]);
                              }
                              if(arr[i][j-1]<arr[i][j]){
                                  count+=(arr[i][j]-arr[i][j-1]);
                              }
                              if(arr[i+1][j]<arr[i][j]){
                                  count+=(arr[i][j]-arr[i+1][j]);
                              }
                         }                    
                }
                else if(i==h-1){
                     if(j==0){
                            count+=(2*arr[i][j]); // both sides
                            if(arr[i][j+1]<arr[i][j]){
                                 count+=(arr[i][j]-arr[i][j+1]);
                            }
                            if(arr[i-1][j]<arr[i][j]){
                                count+=(arr[i][j]-arr[i-1][j]);
                            }                                           
                        }
                        else if(j==(w-1)){
                            count+=(2*arr[i][j]);
                            if(arr[i-1][j]<arr[i][j]){
                                 count+=(arr[i][j]-arr[i-1][j]);
                            }
                            if(arr[i][j-1]<arr[i][j]){
                                count+=(arr[i][j]-arr[i][j-1]);
                            } 
                        }
                         else{
                             count+=arr[i][j];
                              if(arr[i][j+1]<arr[i][j]){
                                  count+=(arr[i][j]-arr[i][j+1]);
                              }
                              if(arr[i][j-1]<arr[i][j]){
                                  count+=(arr[i][j]-arr[i][j-1]);
                              }
                              if(arr[i-1][j]<arr[i][j]){
                                  count+=(arr[i][j]-arr[i-1][j]);
                              }
                         }
                }
                else {
                    if(j==0){
                        count+=arr[i][j];
                        if(arr[i][j+1]<arr[i][j]){
                              count+=(arr[i][j]-arr[i][j+1]);
                         }
                         if(arr[i-1][j]<arr[i][j]){
                              count+=(arr[i][j]-arr[i-1][j]);
                         }
                         if(arr[i+1][j]<arr[i][j]){
                                count+=(arr[i][j]-arr[i+1][j]);
                         }                   
                    }
                    else if(j==w-1){
                         count+=arr[i][j];
                         if(arr[i][j-1]<arr[i][j]){
                              count+=(arr[i][j]-arr[i][j-1]);
                         }
                         if(arr[i-1][j]<arr[i][j]){
                              count+=(arr[i][j]-arr[i-1][j]);
                         }
                         if(arr[i+1][j]<arr[i][j]){
                                count+=(arr[i][j]-arr[i+1][j]);
                         } 
                    }
                }
            }
        }
        return count;
    }     

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int W = in.nextInt();
        int[][] A = new int[H][W];
        for(int A_i = 0; A_i < H; A_i++){
            for(int A_j = 0; A_j < W; A_j++){
                A[A_i][A_j] = in.nextInt();
            }
        }
        int result = surfaceArea(A,H,W);
        System.out.println(result);
        in.close();
    }	
}
