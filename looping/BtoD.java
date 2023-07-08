package looping;

import java.util.Scanner;

public class BtoD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dec_value = 0;
		for(int i=1;i<=n;i++){
			
			 int num = sc.nextInt();
			 
			  
	        // Initializing base 
	        // value to 1, i.e 2^0 
	        int base = 1; 
	  
	        int temp = num; 
	        while (temp > 0) { 
	            int last_digit = temp % 10; 
	            temp = temp / 10; 
	  
	            dec_value += last_digit * base; 
	  
	            base = base * 2; 
	        } 
	        System.out.println(dec_value);
			
			
		}

	}

}
