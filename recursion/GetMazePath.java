package recursion;

import java.util.ArrayList;

public class GetMazePath {

	public static void main(String[] args) {
//		System.out.println(getMazepath(0, 0, 2, 2));
//		System.out.println(getMazepathDiagonal(0, 0, 2, 2));
//		printMP(0,0,2,2,"");
		printMPDiagonal(0,0,2,2,"");
//		int c = countMP(0,0,2,2,"");
//		System.out.println(c);
//		int d = countMPdiag(0,0,2,2);
//		System.out.println(d);
	}

	public static ArrayList<String> getMazepath(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rrh = getMazepath(cr, cc + 1, er, ec);
		for (String rrhs : rrh) {
			mr.add("H" + rrhs);
		}
		ArrayList<String> rrv = getMazepath(cr + 1, cc, er, ec);
		for (String rrvs : rrv) {
			mr.add("V" + rrvs);
		}

		return mr;
	}

	public static ArrayList<String> getMazepathDiagonal(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rrh = getMazepathDiagonal(cr, cc + 1, er, ec);
		for (String rrhs : rrh) {
			mr.add("H" + rrhs);
		}
		ArrayList<String> rrv = getMazepathDiagonal(cr + 1, cc, er, ec);
		for (String rrvs : rrv) {
			mr.add("V" + rrvs);
		}
		ArrayList<String> rrd = getMazepathDiagonal(cr + 1, cc + 1, er, ec);
		for (String rrds : rrd) {
			mr.add("D" + rrds);
		}

		return mr;
	}

	public static void printMP(int cr,int cc,int er, int ec,String ans){
		if(cr==er && cc==ec){
			System.out.println(ans);
			return;
		}
		if(cr>er || cc>ec){
			return;
		}
		
		printMP(cr,cc+1,er,ec,ans+"H");
		printMP(cr+1,cc,er,ec,ans+"V");
    }
	public static int countMP(int cr,int cc,int er, int ec){
		if(cr==er && cc==ec){
			return 1;
		}
		if(cr>er || cc>ec){
			return 0;
		}
		int count=0;
		count+=countMP(cr,cc+1,er,ec);
		count+=countMP(cr+1,cc,er,ec);
		
		return count;
    }
	public static void printMPDiagonal(int cr,int cc,int er, int ec,String ans){
		if(cr==er && cc==ec){
			System.out.println(ans);
			return;
		}
		if(cr>er || cc>ec){
			return;
		}
		
		printMPDiagonal(cr,cc+1,er,ec,ans+"H");
		printMPDiagonal(cr+1,cc,er,ec,ans+"V");
		printMPDiagonal(cr+1,cc+1,er,ec,ans+"D");
    }
	public static int countMPdiag(int cr,int cc,int er, int ec){
		if(cr==er && cc==ec){
			return 1;
		}
		if(cr>er || cc>ec){
			return 0;
		}
		int count=0;
		count+=countMPdiag(cr,cc+1,er,ec);
		count+=countMPdiag(cr+1,cc,er,ec);
		count+=countMPdiag(cr+1,cc+1,er,ec);
		return count;
    }
	
		
}
