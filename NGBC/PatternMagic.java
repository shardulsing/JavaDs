package NGBC;

import java.util.Scanner;

public class PatternMagic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nr = 2 * n - 1;
		int nst = n;
		int nsp = -1;
		int row = 1;
		while (row <= nr) {
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			if (row == 1 || row == nr) {
				nst--;
			}
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
			if(row==1 || row==nr){
				nst++;
			}
			System.out.println();
			if(row<=nr/2){
				nst--;
			}else{
				nst++;
			}
			if(row<=nr/2){
				nsp = nsp + 2;
			}else{
				nsp=nsp-2;
			}
			
			row++;
			

		}

	}

}
