package DynamicProgramming;

import java.util.Arrays;

public class PalindromPartitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abacd";
		System.out.println(PalindromPartitioningRecursion(s, 0, s.length() - 1));
		int[][] strg = new int[s.length()][s.length()];
		for (int i = 0; i < strg.length; i++) {
			for (int j = 0; j < strg[0].length; j++) {
				strg[i][j] = -1;
			}
		}
		System.out.println(PalindromPartitioningTD(s, 0, s.length()-1, strg));
		System.out.println(PalindromPartitioningBU(s));

	}

	public static int PalindromPartitioningRecursion(String s, int si, int ei) {

		if (isPalindrome(s, si, ei)) {
			return 0;
		}
		int min = Integer.MAX_VALUE;
		for (int k = si; k <= ei - 1; k++) {
			int fp = PalindromPartitioningRecursion(s, si, k);
			int sp = PalindromPartitioningRecursion(s, k + 1, ei);

			int total = fp + sp + 1;
			if (total < min) {
				min = total;
			}
		}

		return min;
	}

	public static boolean isPalindrome(String s, int si, int ei) {

		int l = si;
		int r = ei;

		while (l < r) {

			if (s.charAt(si) != s.charAt(ei)) {
				return false;
			}
			l++;
			r--;
		}

		return true;
	}

	public static int PalindromPartitioningTD(String s, int si, int ei,int[][] strg) {

		if (isPalindrome(s, si, ei)) {
			return 0;
		}
		if(strg[si][ei] != -1){
			return strg[si][ei];
		}
		int min = Integer.MAX_VALUE;
		for (int k = si; k <= ei - 1; k++) {
			int fp = PalindromPartitioningRecursion(s, si, k);
			int sp = PalindromPartitioningRecursion(s, k + 1, ei);

			int total = fp + sp + 1;
			if (total < min) {
				min = total;
			}
		}
		strg[si][ei] = min;

		return min;
	}
	
	public static int PalindromPartitioningBU(String s){
		
		boolean[][] isStringPalindrome = palindromeInfo(s);
		int[][] strg = new int[s.length()][s.length()];
		int n = s.length();
		
		for(int slide=0;slide<=n-1;slide++){
			for(int si = 0;si<=n-slide-1;si++){
				int ei = si+slide;
				if (isStringPalindrome[si][ei]) {
					strg[si][ei] = 0;
				}else{
					
					int min = Integer.MAX_VALUE;
					for (int k = si; k <= ei - 1; k++) {
						int fp = strg[si][k];
						int sp = strg[k+1][ei];

						int total = fp + sp + 1;
						if (total < min) {
							min = total;
						}
					}
					strg[si][ei] = min;
				}
				
			}
		}
		
		return strg[0][n-1];
	}
	
	public static boolean[][] palindromeInfo(String s){
		
		boolean[][] isStringPalindrome = new boolean[s.length()][s.length()];
		
		for(int i =0 ; i<isStringPalindrome.length;i++){
			Arrays.fill(isStringPalindrome[i], true);
		}
		
		for(int row = s.length()-2;row>=0;row--){
			for(int col = row+1;col<s.length();col++){
				
				if(s.charAt(row)==s.charAt(col)){
					isStringPalindrome[row][col] = isStringPalindrome[row+1][col-1];
				}else{
					isStringPalindrome[row][col] =false;
				}
			}
		}
		
		return isStringPalindrome;
	}

}
