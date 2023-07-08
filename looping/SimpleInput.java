package looping;

import java.util.Scanner;

public class SimpleInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num;
		
		
		for (int i = 0;; i++) {
			num=sc.nextInt();
			sum=sum+num;
			if(-1000<num && num<1000 && sum>=0){
				System.out.println(num);
				
			}else
				break;

		}

	}
}
