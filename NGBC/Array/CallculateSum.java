package NGBC.Array;

import java.util.Scanner;

public class CallculateSum {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n= sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		sumCal(a,n);
	}

	public static void sumCal(int[] a,int n) {
		int o = sc.nextInt();
		while (o > 0) {
			int x = sc.nextInt();
			int[] b = new int[n];
			for (int i = 0; i < n; i++) {
				b[i] = a[i] + a[(i + n - x) % n];
			}
			a=b;
			o--;
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}

}
