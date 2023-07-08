package array.program;

public class MaximumSubArrSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,5,6,18,2,7};
		int k=3;
		System.out.println(MaxSubArrSum(arr, k));

	}
	
	public static int MaxSubArrSum(int[] arr,int k){
		
		int i=0;
		int j=0;
		int sum=0;
		int maxSum = Integer.MIN_VALUE;
		int size = arr.length;
		while(j<size){
			sum = sum + arr[j];
			if(j-i+1 < k){
				j++;
			}else if(j-i+1==k){
				maxSum = Math.max(sum, maxSum);
				sum = sum - arr[i];
				i++;
				j++;
			}
			
		}
		
		return maxSum;
	}

}
