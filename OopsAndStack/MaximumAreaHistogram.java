package OopsAndStack;

import java.util.ArrayList;
import java.util.Stack;

public class MaximumAreaHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,2,5,4,5,1,6};
		int[] left = NSL(arr);
		int[] right = NSR(arr);
		int[] width = new int[arr.length];
		int[] area = new int[arr.length];
		int max = Integer.MIN_VALUE;
		for(int i = 0;i < arr.length; i++){
			width[i] = right[i] - left[i]-1;
		}
		for(int i = 0;i < arr.length; i++){
			area[i] = arr[i] * width[i];
		}
		for(int i = 0;i < arr.length; i++){
			max = Math.max(area[i], max);
		}
		System.out.println(max);

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
	
	public static int[] NSL (int[] arr) {

		int[] ar = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		int size = arr.length;
		for (int i = 0; i <size; i++) {

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
