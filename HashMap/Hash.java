package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Your code here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int hn = Integer.MIN_VALUE;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			int cc = arr[i];
			if (map.containsKey(cc)) {
				if (cc > hn) {
					hn = cc;
				}
				int ov = map.get(cc);
				int nv = ov + 1;
				map.put(cc, nv);
			} else {
				map.put(cc, 1);
			}
		}

		int count = map.get(hn);
		System.out.println(count);

	}

}
