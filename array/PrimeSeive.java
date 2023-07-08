package array;

import java.util.Scanner;

public class PrimeSeive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int p[] = new int[1000000];
		for(int i =0; i<p.length;i=i+1){
			p[i]=1;
		}
		p[0] = 0;
		p[1] = 0;

		for (int i = 2; i * i < p.length; i++) {
			if (p[i] == 1) {
				for (int j = i * i; j < p.length; j += i) {
					p[j] = 0;
				}
			}
		}
		
		int[] csum = new int[10000005];
		for (int i = 1; i < 1000000; i++) {
			csum[i] = csum[i - 1] + p[i];
		}
		int j = 1;
		while (j <= n) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int x = csum[b] - csum[a - 1];
			System.out.println(x);
			j++;
		}
	}

}
