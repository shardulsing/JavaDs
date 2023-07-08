package looping;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A VALUE Of N");
		int n = sc.nextInt();
		int row = 1;
		int var;
		while (row <= n) {
			int col = 1;
			while (col <= row) {
                if(row==1){
                	var=row;
                }else if(col==1 || col==row){
                	var=row;
                }else{
                	var=0;
                }
				System.out.print(var +"\t");
				col++;
			}

			System.out.println();
			row++;
		}

		sc.close();

	}

}
