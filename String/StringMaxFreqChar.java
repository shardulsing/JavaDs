package String;

import java.util.Scanner;

public class StringMaxFreqChar {

	static final int N = 256;
	 static char MaxOccuringChar(String str1) {
	  int ctr[] = new int[N];
	  int l = str1.length();
	  for (int i = 0; i < l; i++)
	   ctr[str1.charAt(i)]++;
	  int max = -1;
	  char result = ' ';

	  for (int i = 0; i < l; i++) {
	   if (max < ctr[str1.charAt(i)]) {
	    max = ctr[str1.charAt(i)];
	    result = str1.charAt(i);
	   }
	  }

	  return result;
	 }
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	  String str1 = sc.next();
	  System.out.println(MaxOccuringChar(str1));
	 }

}
