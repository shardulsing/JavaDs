package recursion.problems;

import java.util.Scanner;

public class AllindicesProb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
        	arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        printIndices(arr, m, 0);
	}
	public static void printIndices(int[] arr,int m,int i){
		if(arr.length==i){
			return;
		}
		if(arr[i]==m){
			System.out.print(i+" ");
		}
		
		printIndices(arr, m, i+1);
	}

}
