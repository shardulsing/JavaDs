package BasicProgramming;

import java.util.Scanner;

public class DecimalToAnybase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Source Number");
		int snum = sc.nextInt();
		
		System.out.println("Enter Destination Base");
		int db = sc.nextInt();
	
		int res = DecimalToAnybase(snum,db);
		System.out.println(res);

	}
	
	public static int AnybaseToDecimal(int snum , int sb){
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
	
	public static int DecimalToAnybase(int snum , int db){
		int multiplier=1;
		int ans =0;
		while(snum!=0){
			int rem = snum%db;
			 ans = ans + (rem * multiplier);
			 multiplier = multiplier * 10;
			 snum = snum/db;	
			 
			
		}
		return ans;
	}

}
