package NGBC.Array;

import java.util.Scanner;

public class LengthOfBitonicSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2
//		6
//		12 4 78 90 45 23
//		4
//		40 30 20 10
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0){
			int n= sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			System.out.println(bitonic(arr, n));
			t--;
		}

	}
	
	public static int bitonic(int arr[], int n) 
    { 
        int[] inc = new int[n];  
        int[] dec = new int[n]; 
        int max; 
  
        inc[0] = 1; 
   
        dec[n-1] = 1; 
  
        for (int i = 1; i < n; i++) {
        	if(arr[i]>=arr[i-1]){
        		inc[i]=inc[i-1]+1;
        	}else{
        		inc[i]=1;
        	}
        } 
  
        for (int i = n-2; i >= 0; i--){
        	if(arr[i]>=arr[i+1]){
        		dec[i]=dec[i+1]+1;
        	}else{
        		dec[i]=1;
        	}
        } 
   
        max = inc[0] + dec[0] - 1; 
        for (int i = 1; i < n; i++) {
        	if (inc[i] + dec[i] - 1 > max){
        		max = inc[i] + dec[i] - 1;
        	}
        }
  
        return max; 
    }

}
