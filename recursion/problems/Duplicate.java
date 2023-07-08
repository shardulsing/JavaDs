package recursion.problems;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		dupl(str,"");
		}
	public static void dupl(String str,String ans){
		
		if(str.length()==1){
			System.out.println(ans+str.charAt(0));
			return;
		}
		char cc=str.charAt(0);
		String ros=str.substring(1);
		if(str.charAt(0)==str.charAt(1)){
			dupl(ros, ans);
		}else{
			dupl(ros, ans+cc);
		}
		
	}

}
