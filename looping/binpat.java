package looping;

import java.util.Scanner;

public class binpat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		while(row<=n){
			int val=1;
			int count=1;
			if(row%2==0){
				val=0;
			}
			while(count<=row){
				System.out.print(val);
				if(val==0){
					val++;
				}else{
					val--;
				}
				count++;
			}
			System.out.println();
			row++;
		}

	}

}
