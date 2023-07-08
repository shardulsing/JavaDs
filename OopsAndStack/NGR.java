package OopsAndStack;

import java.util.ArrayList;
import java.util.Stack;

public class NGR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 2, 4 };

		ArrayList<Integer> ar = new ArrayList<>();
		Stack<Integer> st = new Stack<>();
		int size = arr.length;
		for (int i = size - 1; i >= 0; i--) {

			if (st.size() == 0) {
				ar.add(-1);
			} else if (st.size() > 0 && st.peek() > arr[i]) {
				ar.add(st.peek());
			} else if (st.size() > 0 && st.peek() <= arr[i]) {
				while (st.size() > 0 && st.peek() <= arr[i]) {
					st.pop();
				}
				if (st.size() == 0) {
					ar.add(-1);
				} else {
					ar.add(st.peek());
				}
			}
			st.push(arr[i]);
		}
		for (int i = ar.size() - 1; i >= 0; i--) {
			System.out.print(ar.get(i) + " ");
		}

	}

}
