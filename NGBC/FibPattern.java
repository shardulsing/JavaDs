package NGBC;

import java.util.Scanner;

public class FibPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0;
		int b=1;
		int sum=0;
		int row=1;
		while(row<=n){
			int col=1;
			while(col<=row){
				System.out.print(a+"\t");
				
				sum=a+b;
				a=b;
				b=sum;
				col++;
			}
			System.out.println();
			row++;
		}

	}

}
