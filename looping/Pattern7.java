package looping;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A VALUE Of N");
		int n = sc.nextInt();
		int nst = n / 2;
		int nsp = 1;
		int row = 1;
		while (row <= n) {
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");

			}
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");

			}
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");

			}
			System.out.println();
			if(row<=n/2){
				nsp=nsp+2;
				nst--;
				
			}else{
				nsp=nsp-2;
				nst++;
			}
			row++;

		}
		sc.close();
	}

}
