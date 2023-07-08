package recursion;

public class printBoardPath {

	public static void main(String[] args) {
//		printBP(0,10,"");
		int c=countBP(0,10);
		System.out.println(c);

	}
	
	public static void printBP(int curr,int end,String ans){
		if(curr==end){
			System.out.println(ans);
			return;
		}
		if(curr>end){
			return;
		}
		
		for(int dice=1 ; dice<=6;dice++){
			printBP(curr + dice,end,ans+dice);
		}
	}
	
	public static int countBP(int curr,int end){
		if(curr==end){
			return 1;
		}
		if(curr>end){
			return 0;
		}
		 int count=0;
		for(int dice=1 ; dice<=6;dice++){
			 count+= countBP(curr + dice,end);
		}
		
		return count;
	}

}
