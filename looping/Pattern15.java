package looping;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A VALUE Of N");
		int n = sc.nextInt();
		int nst = 1;
		int nsp = 2 * n - 3;
		int row = 1;
		int var;
		while (row <= n) {
			var = 1;
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(var + "\t");
				var++;
			}
			var--;
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" " + "\t");
			}
			int cst = 1;
			if (row == n) {
				cst = 2;
				var--;
			}

			for (; cst <= nst; cst++) {
				System.out.print(var + "\t");
				var--;
			}
			System.out.println();
			nst++;
			nsp = nsp - 2;
			row++;
		}

	}

}
