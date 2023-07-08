package recursion.problems;

import java.util.Scanner;

public class SmartKeypadAdv {

	static String SearchIn[]= {
            "prateek", "sneha", "deepak", "arnav", "shikha", "palak",
            "utkarsh", "divyam", "vidhi", "sparsh", "akku"
    };
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] table={"","..","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		String n = sc.next();
		SmartKey(table,n,"");
		

	}
	
	public static void SmartKey(String[] str,String n,String ans){
		if(n.length()==0){
			
			for(String ss:SearchIn)
			{
				if(ss.contains(ans))
				{
					System.out.println(ss);
				}
				
			}
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
