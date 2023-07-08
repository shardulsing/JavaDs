package BasicProgramming;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int Lcm = (a*b)/GCD(a,b);
		System.out.println(Lcm);
		

	}
	
	public static int GCD(int divident,int divisor){
		while (divident % divisor != 0) {

			int rem = divident % divisor;
			divident = divisor;
			divisor = rem;
		}
		
		return divisor;
	}

}
