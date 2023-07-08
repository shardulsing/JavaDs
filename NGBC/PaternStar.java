package NGBC;

import java.util.Scanner;

public class PaternStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nsp=n;
		int nst=-1;
		int row=1;
		int val;
		while(row<=n){
			val=1;
			for(int csp=1;csp<=nsp;csp++){
				System.out.print(val);
				val++;
			}
			for(int cst=1;cst<=nst;cst++){
				System.out.print("*");
			}
			System.out.println();
			nsp--;
			nst=nst+2;
			row++;
		}

	}

}
