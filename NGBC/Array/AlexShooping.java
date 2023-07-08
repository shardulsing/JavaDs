package NGBC.Array;

import java.util.Scanner;

public class AlexShooping {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Shop(a);

	}

	public static void Shop(int[] a) {
		int q = sc.nextInt();
		while (q > 0) {
			int p = sc.nextInt();
			int k = sc.nextInt();
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (p % a[i] == 0) {
					count++;
				}
			}
			if (count >= k) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			q--;
		}
	}

}
