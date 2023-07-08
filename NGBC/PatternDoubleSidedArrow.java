package NGBC;

import java.util.Scanner;

public class PatternDoubleSidedArrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int nsp=1;
		int nsp1=n-3;
		int nst1=2;
		int var=1;
		while(row<=n){
			var=nst1;
			if(row==1 || row==n){
				for(int csp=1;csp<n;csp++){
					System.out.print(" "+" ");
				}
				for(int cst=1;cst<=1;cst++){
					System.out.print("1"+" ");
				}
			}
			if(row>1 && row<n){
				for(int csp=1;csp<=nsp1;csp++){
					System.out.print(" "+" ");
				}
				for(int cst=1;cst<=nst1;cst++){
					System.out.print(var+" ");
					var--;
				}
				for(int csp=1;csp<=nsp;csp++){
					System.out.print(" "+" ");
				}
				var++;
				for(int cst=1;cst<=nst1;cst++){
					System.out.print(var+" ");
					var++;
				}
				if(row<=n/2){
					nsp1=nsp1-2;
					nsp=nsp+2;
					nst1++;
				}else{
					nsp1=nsp1+2;
					nsp=nsp-2;
					nst1--;
				}
				
			}
			System.out.println();
			row++;
		}

	}

}
