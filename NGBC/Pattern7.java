package NGBC;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		int row = 1;
		int nst=1;
		
		while(row<=n){
			for(int col=1;col<=n;col++){
				if(row==1||row==n||col==1||col==n){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
			row++;
		}

	}

}
