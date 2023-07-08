package array;

import java.util.Scanner;

public class VunNeumen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while(N>=0){
			int snum = sc.nextInt();
			int ans=0;
		    int multiplier = 1;
			while(snum>0){
				int rem = snum%10;
			    ans = ans + rem * multiplier;
			    multiplier = multiplier * 2;
			    snum = snum/10;
			}
			System.out.println(ans);
			 N--;
		}

	}

}
