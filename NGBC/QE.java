package NGBC;

import java.util.Scanner;

public class QE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int d=b*b - 4*a*c;
		if(d==0){
			System.out.println("Real and Equal");
			int ans=-1*b/(2*a);
			System.out.println(ans+" "+ans);
		}else if(d>0){
			System.out.println("Real and Distinct");
			int ans1=(int) ((-1*b-(Math.sqrt(d)))/2*a);
			int ans2=(int) ((-1*b+(Math.sqrt(d)))/2*a);
			if(ans1>ans2){
				System.out.println(ans2+" "+ans1);
			}else{
				System.out.println(ans1+" "+ans2);
			}
			
		}else{
			System.out.println("Imaginary");
		}
		

	}

}
