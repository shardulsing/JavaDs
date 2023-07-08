package recursion.problems;

import java.util.Scanner;

public class StoInt {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int sum =0;
		String str = sc.next();
		StoInt(str,sum);
    }
	public static void StoInt(String str,int sum){
		if(str.length()==0){
			System.out.println(sum);
			return;
		}
		int num = (str.charAt(0)-'0');
		String ros = str.substring(1);
		StoInt(ros,sum*10+num);
	}

}
