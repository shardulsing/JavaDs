package array.program;

import java.util.Scanner;

public class DigitsPair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] bit = FormDigitNum(arr);
		for(int val:bit){
			System.out.println(val);
		}

	}

	public static int[] FormDigitNum(int[] arr) {
		int[] bit = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int max=0;
			int min = 0;
			while (num != 0) {
				int r = num % 10;
				if (r > max) {
                   max=r;
				}
				if(min==0 || min>r){
					min=r;
				}
				if(min>r){
					min=r;
				}
				
				num=num/10;
			}
			bit[i] = (max*11) + (min*7);

		}
		return bit;
	}

}
