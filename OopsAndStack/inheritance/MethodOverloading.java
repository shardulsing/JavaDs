package OopsAndStack.inheritance;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(sum(2,3));
         System.out.println(sum(2,4,3));
         System.out.println(sum(2.1,3.9));
         System.out.println(sum(2,3,4,5,6));
	}
	
	public static int sum(int a, int b){
		return a+b;
	}
	// overload cannot be define on the basis of return type
//	public static void sum(int a, int b){
//		return a+b;
//	}
	public static int sum(int a, int b,int c){
		return a+b+c;
	}
	public static double sum(double a, double b){
		return a+b;
	}
	public static double sum(double a, String b){
		return a;
	}
	public static int sum(int... args){
		int sum =0;
		for(int val:args){
			sum+=val;
		}
		return sum;
	}

}
