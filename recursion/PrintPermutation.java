package recursion;

public class PrintPermutation {

	public static void main(String[] args) {
		printPermu("abc","");
	}
	public static void printPermu(String que,String ans){
		if(que.length()==0){
			System.out.println(ans);
		}
		
		for(int i=0; i<que.length() ; i++){
			char cc = que.charAt(i);
			String roq = que.substring(0,i)+que.substring(i+1);
			printPermu(roq,ans+cc);
			
		}
	}
	

}
