package looping;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = 1;
		int nsp = n - 1;
		int var ;
		int row = 1;
		
		while(row<=n){
			var = row;
			for(int csp =1; csp<=nsp; csp++){
				System.out.print("\t");
			}
			for(int cst =1; cst<=nst; cst++){
				System.out.print(var + "\t");
				if(cst<=nst/2)
					var++;
				else 
					var--;
				
				
			}
			System.out.println();
			nsp--;
			nst=nst+2;
			row++;
		}
		

	}

}
