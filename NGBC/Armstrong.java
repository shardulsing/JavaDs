package NGBC;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		armstrong(10, 1000);

	}
	
	public static void armstrong(int lo,int hi){
		for(int n=lo;n<=hi;n++){
			boolean res = isArmstrong(n);
			if(res){
				System.out.println(n);
			}
		}
	}
	
	public static boolean isArmstrong(int n){
		int nod=noOfDigit(n);
		int num=n;
		int sum=0;
		while(num!=0){
			int rev=num%10;
			int pow= (int) Math.pow(rev,nod);
			sum=sum+pow;
			num=num/10;
			
		}
		if(sum==n){
			return true;
		}else{
			return false;
		}
	}
	
	public static int noOfDigit(int n){
		int count=0;
		while(n!=0){
			count++;
			n=n/10;
		}
		
		return count;
	}

}
