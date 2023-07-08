package looping;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A VALUE Of N");
		int n = sc.nextInt();
		int nsp = n / 2;
		int nst = 1;
		int row = 1;
		while (row <= n) {
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("* ");
//				if(cst==1||cst==nst){
//					System.out.print("* ");
//				}else{
//					System.out.print("  ");
//				}
			}
//			for (int csp = 1; csp <= nsp; csp++) {
//				System.out.print(" ");
//			}
			System.out.println();
			if(row<=n/2){
				nst=nst+2;
				nsp--;
				
			}else{
				nst=nst-2;
				nsp++;
			}
			row++;
			

		}

	}
}
