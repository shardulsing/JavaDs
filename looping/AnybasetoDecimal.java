package looping;

import java.util.Scanner;

public class AnybasetoDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int snum = sc.nextInt();
		int sb = sc.nextInt();
		int res = anybasetoDecimal(snum, sb);
		System.out.println(res);
		

	}
	public static int anybasetoDecimal(int snum , int sb){
		int multiplier=1;
		int ans =0;
		while(snum!=0){
			int rem = snum%10;
			 ans = ans + (rem * multiplier);
			 multiplier = multiplier * sb;
			 snum = snum/10;	
			 
			
		}
		return ans;
	}

}
