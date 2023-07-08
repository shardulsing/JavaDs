package recursion.problems;

import java.util.Scanner;

public class SmartKeypad1 {
    static int count=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] table={"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
		String n = sc.next();
		SmartKey(table,n,"");
		System.out.println("\n"+count);

	}
	
	public static void SmartKey(String[] str,String n,String ans){
		if(n.length()==0){
			count++;
			System.out.print(ans+" ");
			return;
		}
		char ch = n.charAt(0);
		String ros=n.substring(1);
		String code = str[ch-'0'];
		for(int i=0;i<code.length();i++){
			SmartKey(str,ros,ans+code.charAt(i));
			
		}
		
	}

}
