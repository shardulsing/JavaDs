package NGBC;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n = 2 * n1;
		int nsp = n1 - 1;
		int nst = 1;
		int row = 1;
		while (row <= n) {
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}

			for (int cst = 1; cst <= nst; cst++) {
				if (cst % 2 == 0) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}

			System.out.println();
			if (row < n / 2) {
				nst = nst + 2;
				nsp--;

			} else if (row == n / 2) {
                    
				
			} else {
				nst = nst - 2;
				nsp++;
			}
			row++;

		}
	}
}
