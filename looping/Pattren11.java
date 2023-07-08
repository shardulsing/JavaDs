package looping;

import java.util.Scanner;

public class Pattren11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A VALUE Of N");
		int n = sc.nextInt();
		int nr = 2*n+1;
		int nst = 1;
		int nsp = 2*n-1;
		int var;
		int row=1;
		while(row<=nr){
			var=n;
			for(int cst=1; cst<=nst;cst++){
				System.out.print(var + " ");
				var--;
			}
			for(int csp=1; csp<=nsp;csp++){
				System.out.print(" " + " ");
			}
			int cst =1;
			if(row==nr/2+1){
				cst=2;
				var++;
			}
			var++;
			for(; cst<=nst;cst++){
				System.out.print(var +" ");
				var++;
			}
			System.out.println();
			if(row<=nr/2){
				nsp=nsp-2;
				nst++;
			}else{
				nsp=nsp+2;
				nst--;
			}
				
			
			row++;
		}

	}

}
