package DynamicProgramming;

import java.util.Arrays;

public class LIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,3,7,11};
		System.out.println(LIS(arr));

	}
	
	public static int LIS(int[] arr){
		
		int[] strg = new int[arr.length];
		Arrays.fill(strg, 1);
		int max=1;
		for(int i=0;i<strg.length;i++){
			for(int j=0;j<i;j++){
				if(arr[j]<arr[i]){
					strg[i] = Math.max(strg[i], strg[j]+1);
				}
			}
			
			max = Math.max(strg[i], max);
		}
		
		return max;
	}

}
