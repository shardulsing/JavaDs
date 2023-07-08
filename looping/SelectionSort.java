
package looping;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int arr[] = new int[n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		 int[] res = SelectionShort(arr);
//		 int[] res = InsertionSort(arr);
//		display(arr);
//		int data = 2;
		
		int[][] array = takeInput();
		display1(array);
		//System.out.println(lowerBound(arr, data));
		
	}
	public static void bubbleSort(int[] arr ){
		for(int counter =0 ; counter < arr.length - 1; counter++){
			for(int j= 0 ; j < arr.length - 1; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static int[] SelectionShort(int arr[]) {
		for (int counter = 0; counter < arr.length - 1; counter++) {
			int min = counter;
			for (int j = counter + 1; j <= arr.length - 1; j++) {
				if (arr[j] < arr[min])
					min = j;
			}
			int temp = arr[min];
			arr[min] = arr[counter];
			arr[counter] = temp;
		}
		return arr;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] InsertionSort(int arr[]) {
		for (int counter = 1; counter <= arr.length - 1; counter++) {
			int val = arr[counter];
			int j = counter - 1;
			while (j >= 0 && arr[j] > val) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = val;
		}
		return arr;
	}

	public static int lowerBound(int arr[], int data) {
		int low = 0, heigh = arr.length - 1;
		int ans = -1;
		while (low <= heigh) {
			int mid = (low + heigh) / 2;
			if (arr[mid] == data) {
				ans = mid;
				heigh = mid - 1;
			} else if (data < arr[mid]) {
				heigh = mid - 1;
			} else {
				low = mid + 1;
			}

		}
		return ans;

	}
	
	public static int upperBound(int arr[], int data) {
		int low = 0, heigh = arr.length - 1;
		int ans = -1;
		while (low <= heigh) {
			int mid = (low + heigh) / 2;
			if (arr[mid] == data) {
				ans = mid;
				low = mid + 1;
			} else if (data < arr[mid]) {
				heigh = mid - 1;
			} else {
				low = mid + 1;
			}

		}
		return ans;

	}

	private static int[][] takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int rows = sc.nextInt();
		int[][] arr = new int[rows][];
		for (int row = 0; row < rows; row++) {
			System.out.println("Enter the no of cols for row " + row);
			int cols = sc.nextInt();
			arr[row] = new int[cols];
			for (int col = 0; col < cols; col++) {
				System.out.println("Enter the value for row " + row + " and col " + col);
				arr[row][col] = sc.nextInt();
			}
		}
		return arr;

	}
	private static void display1(int[][] arr){
		for(int row=0;row<arr.length;row++){
			for(int col=0;col<arr[row].length;col++){
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}
}
