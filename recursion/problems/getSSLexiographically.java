package recursion.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class getSSLexiographically {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			String str = sc.next();
			ArrayList<String> res = new ArrayList<>();
			res = getSS(str);
			Collections.sort(res);
			for (int i = 0; i < res.size(); i++) {
				System.out.println(res.get(i));
			}
		}

	}
	public static ArrayList<String> getSS(String str){
		if(str.length()==0){
			ArrayList<String> baseResult = new ArrayList<>() ;
			baseResult.add(" ");
			return baseResult;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> myResult = new ArrayList<String>();
		ArrayList<String> recResult = getSS(ros);
		for(int i=0; i <recResult.size();i++){
			myResult.add(recResult.get(i));
			myResult.add(cc + recResult.get(i));
		}
		
		
		return myResult ;
	}

}
