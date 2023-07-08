package HashMap;

import java.util.HashMap;

public class SubArrayWithSumZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {13,-5,-8,9,-1};
		System.out.println(subArrayZero(arr));

	}
	
	public static boolean subArrayZero(int[] arr){
		HashMap<Integer,Boolean> map = new HashMap<>();
		int presum = 0;
		for(int i = 0 ; i<arr.length;i++){
			presum = presum + arr[i];
			if(presum==0||map.containsKey(presum)){
				return true;
			}else {
				map.put(presum, true);
			}
		}
		
		return false;
	}

}
