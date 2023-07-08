package looping;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A VALUE Of N");
		int n = sc.nextInt();
		int row = 1;
		int var;
		while (row <= n) {
			int col = 1;
			while (col <= row) {
                if(row%2!=0){
                	var=1;
                }else {
                	if(col==1 || col==row){
                	var=1;
                   }else{
                	var=0;
                   }
                }
				System.out.print(var);
				col++;
			}

			System.out.println();
			row++;
		}

		sc.close();


	}

}
