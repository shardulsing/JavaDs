package looping;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A VALUE Of N");
		int n = sc.nextInt();
		int nsp = n-1;
		int nst = 1;
		int row = 1;
		while(row<=n){
			int csp = 1;
			while(csp<=nsp){
				System.out.print(" ");
				csp++;
			}
			
			int cst = 1;
			while(cst<=nst){
				System.out.print("*");
				cst++;
			}
			System.out.println();
			nsp--;
			nst++;
			row++;
		}

	}

}
