package NGBC;

public class Pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		int val=0;
		int va=0;
		while (row <= n) {
			
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" " + " ");
			}
			for (int cst = 1; cst <= nst; cst++) {
				if(cst==nst/2+1){
					System.out.print(va+" ");
					
				}else{
					System.out.print(val+" ");
				}
				
				if(cst<=nst/2){
					val++;
				}else{
					val--;
				}
				
			}
			val=n-row;
			System.out.println();
			nst = nst + 2;
			nsp--;
			row++;
		}

	}

}
