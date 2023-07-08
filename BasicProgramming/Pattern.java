package BasicProgramming;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = n;
		int nst = n;
		int nsp=0;
		
		while(row>0){
			for(int csp = 0; csp<nsp;csp++){
				System.out.print("  ");
			}
			for(int cst = 0;cst<nst;cst++){
				System.out.print("* ");
			}
			System.out.println();
			
			nsp = nsp+2;
			nst--;
			row--;
		}

	}

}
