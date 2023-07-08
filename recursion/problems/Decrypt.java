package recursion.problems;

import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int t = sc.nextInt();
		while(t>0){
			int k=sc.nextInt();
			String str=sc.next();
			String ans="";
			decrypt(k,str,ans);
			t--;
		}

	}
	
	public static void decrypt(int k,String str,String ans){
		if(str.length()==0){
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		if(ch=='.'){
			ans=ans+" ";
		}else{
			char st = 0;
			if(ch=='z'){
				st = (char) (97+(k-1));
			}else if(ch=='Z'){
				st = (char)(65+(k-1));
			}else{
				st = (char)(ch+k);
			}
			ans=ans+st;
		}
		decrypt(k,ros,ans);
		
		
	}

}
