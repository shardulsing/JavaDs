package array;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		bubbleSort(a);

		for (int item : a) {
			System.out.print(item + " ");
		}
	}

	public static void bubbleSort(int[] arr) {
		for (int counter = 0; counter < arr.length - 1; counter++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	
	public static void bubbleSort1(int[] arr) {
		for (int counter = 0; counter < arr.length -1; counter++) {
			for (int j = counter+1; j < arr.length ; j++) {
				if (arr[counter] > arr[j ]) {
					int temp = arr[j];
					arr[j] = arr[counter];
					arr[counter] = temp;
				}
			}
		}
	}

}
