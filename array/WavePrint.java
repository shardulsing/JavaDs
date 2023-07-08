package array;

import java.util.Scanner;

public class WavePrint {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int rows = sc.nextInt();
//		int cols = sc.nextInt();
//		int[][] arr = new int[rows][cols];
//		for (int row = 0; row < rows; row++) {
//			for (int col = 0; col < cols; col++) {
//				
//				arr[row][col] = sc.nextInt();
//			}
//		}
		int[][] arr={{10,20,30,40},{50,60,70,80},{90,100,110,120},{130,140,150,160}};
//		for (int i = 0; i < arr.length; i++) {
//			if (i % 2 == 0) {
//				for (int j = 0; j < arr[i].length; j++) {
//					System.out.print(arr[i][j] + ", ");
//				}
//			} else {
//				for (int j = arr[i].length - 1; j >= 0; j--) {
//					System.out.print(arr[i][j] + ", ");
//				}
//			}
//		}
//		System.out.println("End");
		
		for(int c=0;c<arr[0].length;c++){
			if (c % 2 == 0) {
				for(int r=0;r<arr.length;r++){
					System.out.print(arr[r][c]+", ");
				}
			} else {
				for(int r=arr.length-1;r>=0;r--){
					System.out.print(arr[r][c]+", ");
				}
			}
		}

	}

}
