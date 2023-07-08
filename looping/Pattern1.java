package looping;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A VALUE Of N");
		int n = sc.nextInt();
		int row = 1;
		while (row <= n) {
			int col = 1;
			while (col <= n) {
				System.out.print("*");
				col++;
			}
			
			System.out.println();
			row++;
		}

		sc.close();
	}

}
