package OopsAndStack;

import java.util.Stack;

public class MaxAreaRectInBinaryMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ar = {{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}};
		int[] arr = new int[ar[0].length];
		for(int j=0;j<ar.length;j++){
			arr[j] = ar[0][j];
		}
		int max = MAH(arr);
		for(int i=1;i<ar.length;i++){
			for(int j=0;j<ar[0].length;j++){
				if(ar[i][j]==0){
					arr[j]=0;
				}else{
					arr[j]=arr[j]+ar[i][j];
				}
			}
			
			max=Math.max(max, MAH(arr));
		}
		
		System.out.println(max);

	}

	public static int MAH(int[] arr) {
		int[] left = NSL(arr);
		int[] right = NSR(arr);
		int[] width = new int[arr.length];
		int[] area = new int[arr.length];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			width[i] = right[i] - left[i] - 1;
		}
		for (int i = 0; i < arr.length; i++) {
			area[i] = arr[i] * width[i];
		}
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(area[i], max);
		}

		return max;
	}

	public static int[] NSR(int[] arr) {

		int[] ar = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		int size = arr.length;
		for (int i = size - 1; i >= 0; i--) {

			if (st.size() == 0) {
				ar[i] = arr.length;
			} else if (st.size() > 0 && arr[st.peek()] < arr[i]) {
				ar[i] = st.peek();
			} else if (st.size() > 0 && arr[st.peek()] >= arr[i]) {
				while (st.size() > 0 && arr[st.peek()] >= arr[i]) {
					st.pop();
				}
				if (st.size() == 0) {
					ar[i] = arr.length;
				} else {
					ar[i] = st.peek();
				}
			}
			st.push(i);
		}

		return ar;

	}

	public static int[] NSL(int[] arr) {

		int[] ar = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		int size = arr.length;
		for (int i = 0; i < size; i++) {

			if (st.size() == 0) {
				ar[i] = -1;
			} else if (st.size() > 0 && arr[st.peek()] < arr[i]) {
				ar[i] = st.peek();
			} else if (st.size() > 0 && arr[st.peek()] >= arr[i]) {
				while (st.size() > 0 && arr[st.peek()] >= arr[i]) {
					st.pop();
				}
				if (st.size() == 0) {
					ar[i] = -1;
				} else {
					ar[i] = st.peek();
				}
			}
			st.push(i);
		}

		return ar;

	}

}
