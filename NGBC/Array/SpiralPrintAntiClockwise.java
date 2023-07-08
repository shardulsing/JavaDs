package NGBC.Array;

public class SpiralPrintAntiClockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 100, 110, 120 }, { 130, 140, 150, 160 } };
		int minRow = 0;
		int maxRow = arr.length - 1;
		int minCol = 0;
		int maxCol = arr[0].length - 1;
		int count = 0;
		int nel = arr.length * arr[0].length;

		while (count < nel) {

			for (int r = minCol; r <= maxCol && count < nel; r++) {
				System.out.print(arr[minRow][r] + ", ");
				count++;
			}
			minRow++;

			for (int c = minRow; c <= maxRow && count < nel; c++) {
				System.out.print(arr[c][maxCol] + ", ");
				count++;
			}
			maxCol--;

			for (int r = maxCol; r >= minCol && count < nel; r--) {
				System.out.print(arr[maxRow][r] + ", ");
				count++;
			}
			maxRow--;

			for (int c = maxRow; c >= minRow && count < nel; c--) {
				System.out.print(arr[c][minCol] + ", ");
				count++;
			}
			minCol++;
		}
		System.out.println("END");

	}

}
