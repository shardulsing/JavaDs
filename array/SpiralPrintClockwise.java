package array;

import java.util.Scanner;

public class SpiralPrintClockwise {

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
		display(arr);

	}
	
	public static void display(int[][] arr){
		int top,bottom,left,right,count,dir;
		top=0;
		bottom=arr.length-1;
		left=0;
		right=arr[top].length-1;
		count=(bottom+1)*(right+1);
		dir=1;
		
		while(left<=right&&top<=bottom){
			if(count>0){
				if(dir==1){
					for(int i =left;i<=right;i++){
						System.out.print(arr[top][i]+", ");
						count--;
					}
					dir=2;
					top++;
				}
			}
			if(count>0){
				if(dir==2){
					for(int i =top;i<=bottom;i++){
						System.out.print(arr[i][bottom]+", ");
						count--;
					}
					dir=3;
					right--;
					
				}
			}
			if(count>0){
				if(dir==3){
					for(int i =right;i>=left;i--){
						System.out.print(arr[bottom][i]+", ");
						count--;
					}
					dir=4;
					bottom--;
					
				}
			}
			if(count>0){
				if(dir==4){
					for(int i =bottom;i>=top;i--){
						System.out.print(arr[i][left]+", ");
						count--;
					}
					dir=1;
					left++;
					
				}
			}
			
		}
		System.out.println("END");
		
	}

}
