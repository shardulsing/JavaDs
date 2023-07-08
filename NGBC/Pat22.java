package NGBC;

import java.util.Scanner;

public class Pat22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A VALUE Of N");
		int n = sc.nextInt();
		int nst = n;
		int nsp = -1;
		int row=1;
		while(row<=n){
			for(int cst=1; cst<=nst;cst++){
				System.out.print("*");
			}
			for(int csp=1; csp<=nsp;csp++){
				System.out.print(" ");
			}
//			int cst =1;
//			if(row==n){
//				cst=2;
//			}
			if(row==1){
				nst--;
			}
			
			for(int cst =1; cst<=nst;cst++){
				System.out.print("*");
			}
			System.out.println();
			if(row>1){
				nst--;
			}
			nsp=nsp+2;
			row++;
		}

	}

}
