package NGBC.Array;

import java.util.Scanner;

public class HelpRamu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[m];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			for (int i = 0; i < m; i++) {
				b[i] = sc.nextInt();
			}
			int cost=Mincost(c1, c2, c3, c4, n, m, a, b);
			System.out.println(cost);
			t--;
		}

	}

	public static int Mincost(int c1, int c2, int c3, int c4, int n, int m, int a[], int b[]) {
		int cost2 = 0, cost3, cost4, i;
		for (i = 0; i < n; i++) {
			cost2 += Math.min((a[i] * c1), c2);
		}
		cost3 = Math.min(cost2, c3);
		cost2 = 0;
		for (i = 0; i < m; i++) {
			cost2 += Math.min((b[i] * c1), c2);
		}
		cost3 += Math.min(cost2, c3);
		cost4 = Math.min(cost3, c4);
		return cost4;
	}

}
