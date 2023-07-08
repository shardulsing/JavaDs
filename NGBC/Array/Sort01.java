package NGBC.Array;

import java.util.Scanner;

public class Sort01 {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }

    }
    public static int[] sort(int[] arr){
		int low=0;
		int mid=0;
		int heigh=arr.length-1;
		while(mid<=heigh){
			if(arr[mid]==0){
				mid++;
			}else{
				swap(arr,mid,heigh);
				heigh--;
            }
		}
		return arr;
	}
    public static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
