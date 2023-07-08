package recursion.problems;

import java.util.Scanner;

public class ReplacePI {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String str=sc.next();
         String add = "";
         print(str,add);

	}
	public static void print(String str,String add){
		if(str.length()<=0){
			System.out.println(add);
			return;
		}
		if(str.charAt(0)=='p' && str.charAt(1) =='i'){
			print(str.substring(2),add+"3.14");
		}else{
			print(str.substring(1),add+str.charAt(0));
		}
	}

}
