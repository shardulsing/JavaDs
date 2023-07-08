package array;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		int i=0;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		str = sc.nextLine();
		char ch[] = str.toCharArray();
		for(char c : ch)
		{
			i++;
		}
		System.out.println("Length of a string is: " +i);

	}

}
