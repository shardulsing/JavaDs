package NGBC.Array;

import java.util.Scanner;

public class NextPermutation {
     //{1,3,4,2,5}
//	1 5 1 3 4 2 5
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n= sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
               a[i]=sc.nextInt();
            }
            int i= a.length-2;
            while(i>=0 && a[i]>=a[i+1]){
                i--;
            }
            if(i>=0){
                int j=a.length-1;
                while(a[j]<=a[i]){
                    j--;
                }
                swap(a,i,j);
            }
            reverse(a,i+1,a.length-1);
            for(int j=0;j<n;j++){
               System.out.print(a[j]+" ");
            }
            System.out.println();
            t--;

        }

    }

    public static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void reverse(int[] a,int i,int j){
        while(i<j){
            swap(a,i,j);
            i++;
            j--;
        }
    }

}
