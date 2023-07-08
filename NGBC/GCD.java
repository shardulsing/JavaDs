package NGBC;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		String ch = "";
		
		while(n!=0){
			
			long r = n%10;
			n=n/10;
			if(r>=5 && n!=0){
				r=9-r;
			}else{
				if(r==9 || r<=4){
					r=r;
				}else{
					r=9-r;
				}
			}
			
			char a = (char)(r+'0');
			
			ch= a + ch;
		}
		System.out.println(ch);

	}

}
