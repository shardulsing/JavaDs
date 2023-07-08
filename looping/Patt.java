package looping;

import java.util.Scanner;

public class Patt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A VALUE Of N");
		int n = sc.nextInt();
		int row = 1;
		
	
		for(int i=1;i<=n;i++){
			for(int col=i;col<=n;col++){
				System.out.print("* ");
				
			}
			
			System.out.println();
		}

	}

}
