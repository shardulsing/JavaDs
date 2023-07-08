package OopsAndStack;

import java.util.ArrayList;
import java.util.Stack;

public class NSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4,5,2,10,8 };

		ArrayList<Integer> ar = new ArrayList<>();
		Stack<Integer> st = new Stack<>();
		int size = arr.length;
		for (int i = 0; i <size; i++) {

			if (st.size() == 0) {
				ar.add(-1);
			} else if (st.size() > 0 && st.peek() < arr[i]) {
				ar.add(st.peek());
			} else if (st.size() > 0 && st.peek() >= arr[i]) {
				while (st.size() > 0 && st.peek() >= arr[i]) {
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
		for (int i = 0; i <size; i++) {
			System.out.print(ar.get(i) + " ");
		}

	}

}
