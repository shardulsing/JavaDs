package recursion.problems;

import java.util.Scanner;

public class SortedArray {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(sortList(arr, 0));
	}

	public static boolean sortList(int arr[], int i) {
		boolean ans = true;
		boolean ans2 = true; // You need to take two variable to store the
								// result
		if (i == arr.length) {
			return ans;
		}
		if (i < arr.length - 1) {
			if (arr[i] <= arr[i + 1]) {
				ans2 = sortList(arr, i + 1); // One must store the result coming
												// from recursive call
			} else {
				ans = false;
				return false;
			}
		}
		return (ans && ans2); // There must be a and of both answers .

	}

}
