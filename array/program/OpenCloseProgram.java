package array.program;

public class OpenCloseProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(solve(9));
	}
	
	public static int solve(int n){
		
		int count=0;
		for(int i=1;i<=n;i++){
			double a=Math.sqrt(i);
			if(a*a==i){
				count++;
			}
		}
		
		return count;
	}

}
