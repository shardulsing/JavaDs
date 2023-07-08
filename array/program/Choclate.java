package array.program;

import java.util.Scanner;

public class Choclate {

	public static void main(String args[]) {
		int i, j, k, l, x, y, ccount = 0;
		Scanner a = new Scanner(System.in);
		i = a.nextInt();
		j = a.nextInt();
		k = a.nextInt();
		l = a.nextInt();

		for (x = i; x <= j; x++) {
			for (y = k; y <= l; y++) {
				ccount = small(x, y, ccount);
			}
		}
		System.out.print(ccount);
	}

	public static int small(int a, int b, int c) {
		int min, max, count = c, a11;
		if (a == b) {
			count = count + 1;
		} else if (a != b) {
			min = Math.min(a, b);
			max = Math.max(a, b);
			a11 = max - min;
			count = small(min, min, count);
			count = small(a11, min, count);
		}
		return count;
	}

}
