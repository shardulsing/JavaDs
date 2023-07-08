package NGBC;

import java.util.Scanner;

public class Pattern8X {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int row = 1;

		while(row<=n){
			for(int col=1;col<=n;col++){
				if(row==col||row+col==n+1){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
			row++;
		}

	}
}
