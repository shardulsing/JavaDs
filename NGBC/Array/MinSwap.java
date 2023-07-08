package NGBC.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinSwap {

	public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=minSwaps(arr,n);
        System.out.println(ans);
       


    }
    public static int minSwaps(int[] arr, int n)
    {
        int ans = 0;
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp);
        for (int i = 0; i < n; i++) 
        {
 
            if (arr[i] != temp[i]) 
            {
                ans++;
                swap(arr, i, indexOf(arr, temp[i]));
            }
        }
        return ans;
    }
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int indexOf(int[] arr, int ele)
    {
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == ele) {
                return i;
            }
        }
        return -1;
    }
}
