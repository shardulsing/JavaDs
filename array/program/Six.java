package array.program;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0;i<n;i++){
				arr[i] = sc.nextInt();
				
			}
			int count = 1;
			int max = 1;
			for(int i=0;i<n-1;i++){
				if(arr[i]<arr[i+1]){
					count++;
				}else{
					count=1;
				}
				if(count>max){
					max=count;
				}
			}
			System.out.println(max);
			T--;
		}

	}

}
