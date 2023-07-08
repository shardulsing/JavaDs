package recursion;

public class PrintSS {

	public static void main(String[] args) {
		printSS("abc" , "");

	}
	public static void printSS(String str, String res){
		if(str.length()==0){
			System.out.println(res);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		printSS(ros,res);
		printSS(ros,res+cc);
	}

}
