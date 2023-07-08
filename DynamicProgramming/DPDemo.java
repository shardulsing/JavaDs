package DynamicProgramming;

public class DPDemo {
	public static long start;
	public static long end;

	public static void startAlgo() {
		start = System.currentTimeMillis();
	}

	public static long endAlgo() {
		end = System.currentTimeMillis();
		return end - start;
	}

	public static void main(String[] args) {
		int n = 30;
		int[] strg = new int[n + 1];
		// startAlgo();
		// System.out.println(fib(n));
		// System.out.println("Fib Normal took time "+endAlgo()+" ms ");
//		startAlgo();
//		System.out.println(cbp(n, 0));
//		System.out.println("Count Board Path took time " + endAlgo() + " ms ");
//
//		startAlgo();
//		System.out.println(cbpRS(n, 0, strg));
//		System.out.println("Count Board RS Path took time " + endAlgo() + " ms ");
//
//		startAlgo();
//		System.out.println(cbpIS(n, 0));
//		System.out.println("Count Board IS Path took time " + endAlgo() + " ms ");
		
		String str1 = "cbbg";
		String str2 = "agbg";
		startAlgo();
		System.out.println(lcs(str1,str2));
		System.out.println("LCS Normal took time " + endAlgo() + " ms ");

	}

	public static int fib(int n) {
		if (n == 1) {
			return n;
		}
		if (n == 0) {
			return n;
		}
		int fnm1 = fib(n - 1);
		int fnm2 = fib(n - 2);
		int fn = fnm1 + fnm2;
		return fn;
	}

	public static int fibRs(int n, int[] strg) {
		if (n == 1) {
			return n;
		}
		if (n == 0) {
			return n;
		}
		if (strg[n] != 0) {
			return strg[n];
		}
		int fnm1 = fibRs(n - 1, strg);
		int fnm2 = fibRs(n - 2, strg);
		int fn = fnm1 + fnm2;
		strg[n] = fn;
		return fn;
	}

	public static int fibIterativeStorage(int n) {
		int[] strg = new int[n + 1];

		// seed
		strg[0] = 0;
		strg[1] = 1;
		for (int i = 2; i <= n; i++) {
			strg[i] = strg[i - 1] + strg[i - 2];
		}

		return strg[n];
	}

	public static int cbp(int end, int curr) {
		if (end == curr) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}

		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count = count + cbp(end, curr + dice);
		}

		return count;
	}

	public static int cbpRS(int end, int curr, int[] strg) {

		if (end == curr) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		if (strg[curr] != 0) {
			return strg[curr];
		}
		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count = count + cbpRS(end, curr + dice, strg);
		}
		strg[curr] = count;
		return count;
	}

	public static int cbpIS(int end, int curr) {

		int[] strg = new int[end + 1];
		// seed
		strg[end] = 1;

		for (int i = end - 1; i >= 0; i--) {
			int count = 0;
			for (int dice = 1; dice <= 6 && dice + i < strg.length; dice++) {

				count = count + strg[dice + i];

			}
			strg[i] = count;
		}

		return strg[curr];

	}

	public static int lcs(String str1, String str2) {
        if(str1.length()==0 || str2.length()==0){
        	return 0;
        }
		int count = 0;
		String ros1 = str1.substring(1);
		String ros2 = str2.substring(1);

		if (str1.charAt(0) == str2.charAt(0)) {
			count = 1 + lcs(ros1, ros2);

		} else {

			int f1 = lcs(ros1, str2);
			int f2 = lcs(str1, ros2);
			count = Math.max(f1, f2);
		}
		
		return count;
	}

}
