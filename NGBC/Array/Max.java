package NGBC.Array;

import java.util.Arrays;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40 };

		// int[] a= {3,0,4,1,2};
		// display(inverse(a));
		// subArray(arr);
		// int[] ar = { 4, 1, 8, 6, 2 };
		// barGraph(ar);
		// subArraySum2Loops(arr);
		// maxsubArraySum2Loops(arr);
		// ArrayTargetSumPair(arr, 60);
		TripletTargetSumPair(arr, 30);

	}

	public static int maximum(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}

		return max;
	}

	public static int find(int[] arr, int item) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}

		}
		return -1;
	}

	public static int BinarySearch(int[] arr, int item) {
		int lo = 0;
		int hi = arr.length - 1;

		while (lo <= hi) {
			int mid = (hi + lo) / 2;
			if (item > arr[mid]) {
				lo = mid + 1;
			} else if (item < arr[mid]) {
				hi = mid - 1;
			} else {
				return mid;
			}
		}

		return -1;
	}

	public static int[] Reverse(int[] arr) {
		int lo = 0;
		int hi = arr.length - 1;
		while (lo < hi) {
			int temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;

			lo++;
			hi--;
		}

		return arr;

	}

	public static int[] Rotate(int[] arr, int rot) {

		rot = rot % arr.length;

		int n = arr.length - 1;
		for (int i = 0; i < rot; i++) {
			int temp = arr[n];
			for (int j = n; j >= 1; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = temp;
		}

		return arr;
	}

	public static void rota(int[] arr, int rot) {

		Reverse(arr, 0, arr.length - rot - 1);
		Reverse(arr, arr.length - rot, arr.length - 1);
		Reverse(arr);

	}

	public static void Reverse(int[] arr, int si, int ei) {

		while (si < ei) {
			int temp = arr[si];
			arr[si] = arr[ei];
			arr[ei] = temp;

			si++;
			ei--;
		}

	}

	public static void pairRoses(int[] arr, int tar) {
		int min = Integer.MAX_VALUE;
		int tempi = 0, tempj = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == tar) {
					if ((Math.abs(arr[j] - arr[i])) <= min) {
						tempi = arr[i];
						tempj = arr[j];
						min = Math.abs(arr[j] - arr[i]);
					}
				}
			}
		}

		if (tempi <= tempj) {
			System.out.println("Deepak should buy roses whose prices are " + tempi + " and " + tempj + ".");
		} else {
			System.out.println("Deepak should buy roses whose prices are " + tempj + " and " + tempi + ".");
		}
	}

	public static int[] inverse(int[] arr) {

		int[] res = new int[arr.length];

		for (int i = 0; i < res.length; i++) {
			res[arr[i]] = i;
		}

		return res;

	}

	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void barGraph(int[] arr) {

		int rows = maximum(arr);
		int cols = arr.length;
		for (int i = 1; i <= rows; i++) {
			for (int c = 0; c < cols; c++) {
				if (i <= rows - arr[c]) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public static void subArray(int[] arr) {

		for (int si = 0; si <= arr.length - 1; si++) {
			for (int ei = si; ei <= arr.length - 1; ei++) {

				for (int k = si; k <= ei; k++) {
					System.out.print(arr[k] + " ");
				}
				System.out.println();
			}
		}
	}

	public static void subArraySum3Loops(int[] arr) {

		for (int si = 0; si <= arr.length - 1; si++) {
			for (int ei = si; ei <= arr.length - 1; ei++) {

				int sum = 0;
				for (int k = si; k <= ei; k++) {
					sum = sum + arr[k];
				}
				System.out.println(sum);
			}
		}
	}

	public static void subArraySum2Loops(int[] arr) {

		for (int si = 0; si <= arr.length - 1; si++) {
			int sum = 0;
			for (int ei = si; ei <= arr.length - 1; ei++) {
				sum += arr[ei];
				System.out.println(si + " " + ei + ":" + sum);

			}
		}
	}

	public static void maxsubArraySum2Loops(int[] arr) {

		int max = Integer.MIN_VALUE;
		for (int si = 0; si <= arr.length - 1; si++) {
			int sum = 0;
			for (int ei = si; ei <= arr.length - 1; ei++) {
				sum += arr[ei];
				if (sum >= max) {
					max = sum;
				}

			}
		}
		System.out.println(max);
	}

	public static void ArrayTargetSumPair(int[] arr, int target) {

		Arrays.sort(arr);
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] + arr[j] < target) {
				i++;
			} else if (arr[i] + arr[j] > target) {
				j--;
			} else {
				System.out.println(arr[i] + " and " + arr[j]);
				i++;
				j--;
			}
		}

	}

	public static void TripletTargetSumPair(int[] arr, int target) {

		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int j = i + 1;
			int k = arr.length - 1;
			while (j < k) {
				if (arr[j] + arr[k] < target - arr[i]) {
					j++;
				} else if (arr[j] + arr[k] > target - arr[i]) {
					k--;
				} else {
					System.out.println(arr[i] + "," + arr[j] + " and " + arr[k]);
					j++;
					k--;
				}
			}
		}

	}

	public static int kadane(int[] arr) {

		int sum = arr[0];
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {

			sum = Math.max(sum + arr[i], arr[i]);

			if (sum > max)
				max = sum;
		}

		return max;
	}

	public static int kadane2(int[] arr) {

		int[] start = new int[arr.length];
		start[0] = 0;

		int ei = 0;

		int sum = arr[0];
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {

			int alreadyExistingAdd = sum + arr[i];
			int freshStart = arr[i];

			if (alreadyExistingAdd > freshStart)
				start[i] = start[i - 1];
			else
				start[i] = i;

			sum = Math.max(alreadyExistingAdd, freshStart);

			if (sum > max) {
				max = sum;
				ei = i;
			}
		}

		System.out.println(start[ei] + " " + ei);

		return max;

	}
	
	public static int maxCircularSum(int[] arr) {

		// case 1 CE are non wrapping
		int sumNonwrapping = kadane(arr);

		// case 2
		int totalSum = 0;

		for (int i = 0; i < arr.length; i++) {
			totalSum += arr[i];
			arr[i] = -arr[i];
		}

		int sumNCE = kadane(arr);

		int sumWrapping = totalSum + sumNCE;

		int ans = Math.max(sumNonwrapping, sumWrapping);

		return ans;

	}
	
	public static int noOfTriangles(int[] arr) {

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {

					if (arr[i] + arr[j] > arr[k] && arr[i] + arr[k] > arr[j] && arr[j] + arr[k] > arr[i]) {
						count++;

						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
					}
				}
			}
		}

		return count;
	}
	
	public static int noOfTriangle2(int[] arr){
		
		int count=0;
		Arrays.sort(arr);
		for(int i=arr.length-1;i>0;i--){
			
			int l=0;
			int r= i-1;
			
			while(l<r){
				
				if(arr[l] +arr[r]>arr[i]){
					count+=r-l;
					
					//printing
//					for(int k=l;k<r-1;k++){
//						System.out.println(arr[k]+" "+arr[r]+" "+arr[i]);
//					}
					r--;
				}else{
					l++;
				}
			}
		}
		
		return count;
	}
}
