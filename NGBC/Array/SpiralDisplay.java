package NGBC.Array;

public class SpiralDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr={{10,20,30,40},{50,60,70,80},{90,100,110,120},{130,140,150,160}};
		int minRow=0;
		int maxRow=arr.length-1;
		int minCol=0;
		int maxCol=arr[0].length-1;
		int count=0;
		int nel=arr.length * arr[0].length;
		while(count<nel){
			
			for(int r=minRow;r<=maxRow && count<nel;r++){
				System.out.print(arr[r][minCol]+" ");
				count++;
			}
			minCol++;
			
			for(int c=minCol;c<=maxCol && count<nel;c++){
				System.out.print(arr[maxRow][c]+" ");
				count++;
			}
			maxRow--;
			
			for(int r=maxRow;r>=minRow && count<nel;r--){
				System.out.print(arr[r][maxCol]+" ");
				count++;
			}
			maxCol--;
			
			for(int c=maxCol;c>=minCol && count<nel;c--){
				System.out.print(arr[minRow][c]+" ");
				count++;
			}
			minRow++;
		}
		
		
	}

}
