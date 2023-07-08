
package array;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = sc.nextInt();
		int[] res = SelectionSort(arr);
		//display(arr);
		findnumber(arr, sum);

	}

	public static int[] SelectionSort(int arr[]) {
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

	public static void findnumber(int[] arr , int sum){
		for(int i=0 ; i<arr.length-2;i++){
			int l = i+1;
			int r = arr.length-1;
			while(l<r){
				if(arr[i]+arr[l]+arr[r]==sum){
				    System.out.println(arr[i]+ ", " + arr[l] + " and " +arr[r]);
				    l++;
				    r--;
				}else if(arr[i]+arr[l]+arr[r]<sum){
					l++;
				}else {
					r--;
				}
				   
			}
		}
	}

}
