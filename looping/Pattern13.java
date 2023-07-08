package looping;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A VALUE Of N");
		int n = sc.nextInt();
		int nst = n / 2;
		int nsp = 1;
		int row = 1;
		if (n % 2 != 0 && n > 0 && n < 10) {
			while (row <= n) {

				if (row == 1 || row == n) {
					for (int cst = 1; cst <= n; cst++) {
						System.out.print("*" + "\t");
					}
				} else {
					for (int cst = 1; cst <= nst; cst++) {
						System.out.print("*" + "\t");
					}
					for (int csp = 1; csp <= nsp; csp++) {
						System.out.print(" " + "\t");
					}
					for (int cst = 1; cst <= nst; cst++) {
						System.out.print("*" + "\t");
					}
					if (row <= n / 2) {
						nsp = nsp + 2;
						nst--;

					} else {
						nsp = nsp - 2;
						nst++;
					}

				}

				System.out.println();

				row++;
			}
		}else
		{
			System.exit(1);
		}

	}

}
