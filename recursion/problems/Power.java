package recursion.problems;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(pow(2,-2));
	}
	//O(log(n))
	public static int pow(int x,int n){
		if(n==0){
			return 1;
		}
		int pnb2=pow(x,n/2);
		if(n%2==1){
			return pnb2*pnb2*x;
		}else {
			return pnb2*pnb2;
		}
	}

}
