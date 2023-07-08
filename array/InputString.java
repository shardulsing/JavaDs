package array;

import java.util.Scanner;

public class InputString {
	
	public static void main(String[] args){
		
		Scanner  inputstring = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = inputstring.nextLine();
		System.out.println("Enter a String");
		String str1 = inputstring.nextLine();
		inputstring.close();
		
		boolean res = str.contains(str1);
		if(res)
			System.out.println("Pattern Match");
		else
			System.out.println("not match");
		
		
	}
	

}
