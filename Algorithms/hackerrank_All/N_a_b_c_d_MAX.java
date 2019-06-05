package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class N_a_b_c_d_MAX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			long sum=0;
			int flag=0;
			ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(1);
			for(int i=2;i<n;i++){
				if(n%i==0){
					if(!al.contains(i)){
						al.add(i);
					}
										
				}				
			}

			al.sort(null);
			
			
			for(int i :al){
				System.out.print(i+" ");
			}
			System.out.println();
			System.out.println(al.size());
			
			
			if(al.size()==1){
				System.out.println("-1");
			}
			else{
				
				for(int i=0;i<al.size();i++){
					for(int j=0;j<al.size();j++){
						for(int k=0;k<al.size();k++){
							for(int l=0;l<al.size();l++){
								
								int p=al.get(i);
								int q=al.get(j);
								int r=al.get(k);
								int s=al.get(l);
								
								
								if((p+q+r+s)==n){
									flag=1;
									System.out.println("p:"+p+" q:"+q+" r:"+r+" s:"+s);
									long sum_temp1=(p*q);
									long sum_temp2=(r*s);
									long sum_temp=sum_temp1*sum_temp2;
									
									//System.out.println("sum_temp1:"+sum_temp1+" sum_temp2:"+sum_temp2);
									//System.out.println("sumtemp:"+sum_temp);
							        if(sum<(sum_temp)){
							    	   sum =sum_temp;
							    	   //System.out.println("sum:"+sum);
							        }								
								}
							}
						}
					}
				}
				if(flag==1){
					System.out.println(sum);
				}
				else{
					System.out.println("-1");
				}
			}
		}
	}
}