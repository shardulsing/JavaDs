package NGBC;

public class TimeComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(polynomial(3, 7));

	}
	
	public static int polynomial(int x,int n){
		
		int mul=x;
		int ans=0;
		while(n>0){
			ans=ans+mul*n;
			mul=mul*x;
			n--;
		}
		
		return ans;
	}

}
