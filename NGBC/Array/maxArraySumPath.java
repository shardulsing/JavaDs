package NGBC.Array;

import java.util.Scanner;

public class maxArraySumPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] arr1 = new int[n];
			int[] arr2 = new int[m];
			for (int i = 0; i < n; i++) {
				arr1[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				arr2[i] = sc.nextInt();
			}
			int ans=maxPathSum(arr1, arr2, n, m);
			System.out.println(ans);
			t--;
		}
		

	}
	public static int maxPathSum(int[] arr1, int[] arr2, int n, int m){
		   int i = 0, j = 0;
		   int result = 0, sum1 = 0, sum2 = 0;
		   while (i < n && j < m) {
		      if (arr1[i] < arr2[j]) {
		         sum1 += arr1[i++];
		      } else if (arr1[i] > arr2[j]) {
		         sum2 += arr2[j++];
		      } else {
		         result += Math.max(sum1, sum2);
		         sum1 = 0; 
		         sum2 = 0;
		         while (i < n && j < m && arr1[i] == arr2[j]) {
		            result = result + arr1[i++];
		            j++;
		         }
		      }
		   }
		   while (i < n) {
		      sum1 += arr1[i++];
		   }
		   while (j < m) {
		      sum2 += arr2[j++];
		   }
		   result += Math.max(sum1, sum2);
		   return result;
		}

}
