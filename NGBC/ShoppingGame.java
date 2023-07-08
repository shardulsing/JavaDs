package NGBC;

import java.util.Scanner;

public class ShoppingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
        int n=sc.nextInt();
        int sumAyu=0;
        int sumHar=0;
        int a=1;
      while(true)     
        {
            sumAyu+=a++; 
            if(sumAyu>m) 
            {
                System.out.println("Harshit");
                break;
            }
             
            sumHar+=a++; 
            if(sumHar>n) 
            {
                System.out.println("Aayush");
                break;
            }
        }

	}

}
