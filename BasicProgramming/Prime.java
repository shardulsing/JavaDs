package BasicProgramming;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =0;
		for(i=2;i<n;i++){
			if(n%i==0){
				break;
			}
		}
		if(i==n){
			System.out.println("Prime");
		}else{
			System.out.println("Not Prime");
		}

	}

}
