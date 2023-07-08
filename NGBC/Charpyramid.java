package NGBC;

import java.util.Scanner;

public class Charpyramid {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		char ch=97;
		while(row<=n){
			if(row%2==0){
				ch=98;
			}else{
				ch=97;
			}
			for(int col=1;col<=row;col++){
				System.out.print(ch+" ");
				ch= (char)(ch+2);
			}
			System.out.println();
			row++;
		}
		
	}

}
