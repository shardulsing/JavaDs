package NGBC;

import java.util.Scanner;

public class PatternRhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nr = 2*n-1;
		int nsp = n - 1;
		int nst = 1;
		int row = 1;
		int var;
		while (row <= nr) {
			if(row>=(nr/2)+2){
				var=nr-row+1;
			}else{
				var=row;
			}
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" " + "\t");
			}
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(var + "\t");
				if(cst<=nst/2) 
					var++;
				else 
					var--;
				
			}
			
			System.out.println();
			if(row<=nr/2){
				nst = nst + 2;
			}else{
				nst=nst-2;
			}
			if(row<=nr/2){
				nsp--;
			}else{
				nsp++;
			}
			
			
			row++;

		}

	}

}
