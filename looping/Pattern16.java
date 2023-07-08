package looping;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A VALUE Of N");
		int n = sc.nextInt();
		int nr = 2 * n + 1;
		int nst = 2 * n + 1;
		int nsp = 1;
		int var;
		int row = 1;
		while (row <= nr) {
			if(row<=nr/2){
			var=n+1-row;
			}else{
				var=row-n-1;
			}
			if (row == 1 || row == nr) {
				for (int cst = 1; cst <= nst; cst++) {
					if(cst<=nst/2){
						System.out.print(var+" ");
						var--;
					}else{
						System.out.print(var+" ");
						var++;
					}
				}
				
			}
			
			if (row > 1 && row < nr) {
				for (int csp = 1; csp <= nsp; csp++) {
					System.out.print("  ");
				}
				for (int cst = 1; cst <= nst; cst++) {
					if(cst<=nst/2){
						System.out.print(var+" ");
						var--;
					}else{
						System.out.print(var+" ");
						var++;
					}
				}
				for (int csp = 1; csp <= nsp; csp++) {
					System.out.print("  ");
				}
			}
			System.out.println();
			if (row != 1) {
				if (row <= (nr / 2)) {
					nsp++;
					nst = nst - 2;
					
				} else {
					nsp--;
					nst = nst + 2;
					
				}
			}else
				nst=nst-2;
			row++;

		}

	}

}
