package OopsAndStack;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		int[] arr = { 10, 4, 5, 90, 120, 80 };

		ArrayList<Integer> ar = new ArrayList<>();
		Stack<Integer> st = new Stack<>();
		int size = arr.length;
		for (int i = 0; i < size; i++) {

			if (st.size() == 0) {
				ar.add(-1);
			} else if (st.size() > 0 && arr[st.peek()] > arr[i]) {
				ar.add(st.peek());
			} else if (st.size() > 0 && arr[st.peek()] <= arr[i]) {
				while (st.size() > 0 && arr[st.peek()] < arr[i]) {
					st.pop();
				}
				if (st.size() == 0) {
					ar.add(-1);
				} else {
					ar.add(st.peek());
				}
			}
			st.push(i);
		}
		for (int i = 0; i < size; i++) {
			ar.set(i, i-ar.get(i));
		}
		for (int i = 0; i < size; i++) {
			System.out.print(ar.get(i) + " ");
		}

	}

}
