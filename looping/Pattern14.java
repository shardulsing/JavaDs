package looping;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nr = 2*n-1;
		int nsp = n - 1;
		int nst = 1;
		int row = 1;
		int var;
		while (row <= n) {
			var = row;
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" " + "\t");
			}
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(var + "\t");
				if(cst<row) //if(cst<=nst/2)
					var++;
				else 
					var--;
				
			}
//			for (int csp = 1; csp <= nsp; csp++) {
//				System.out.print(" " + "\t");
//			}
			System.out.println();
				nst = nst + 2;
				nsp--;
			
			
			row++;

		}

	}

}
