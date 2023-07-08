package looping;

import java.util.Scanner;

public class ChangeOneBaseToAnother {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Source Number");
		int snum = sc.nextInt();
		System.out.println("Enter Source Base");
		int sb = sc.nextInt();
		System.out.println("Enter Destination Base");
		int db = sc.nextInt();
		int res = anybasetoDecimal(snum, sb,db);
		System.out.println(res);
		

	}
	public static int anybasetoDecimal(int snum , int sb,int db){
		int multiplier=1;
		int ans =0;
		while(snum!=0){
			int rem = snum%db;
			 ans = ans + rem * multiplier;
			 multiplier = multiplier * sb;
			 snum = snum/db;
			
		}
		return ans;

	}

}
