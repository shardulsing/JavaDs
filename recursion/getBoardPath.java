package recursion;

import java.util.ArrayList;

public class getBoardPath {

	public static void main(String[] args) {
		System.out.println(getBp(0,10));

	}
	
	public static ArrayList<String> getBp(int curr,int end){
		if(curr==end){
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;
		}
		if(curr>end){
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		
		ArrayList<String> mr = new ArrayList<>();
		for(int dice=1;dice<=6;dice++){
			ArrayList<String> rr = getBp(curr+dice,end);	
			
			for(String rrs: rr){
				mr.add(dice + rrs);
			}
		}
		
		return mr;
		
	}

}
