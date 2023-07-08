package array;

public class Sort {

	public static void main(String[] args) {

         int[] arr = {1,1,0,1,2,1,0,2};
         int[] ans = sort(arr);
         for(int val:ans){
        	 System.out.print(val+" ");
         }

	}
	public static int[] sort(int[] arr){
		int low=0;
		int mid=0;
		int heigh=arr.length-1;
		while(mid<=heigh){
			if(arr[mid]==0){
				swap(arr,mid,low);
				low++;
				mid++;
			}else if(arr[mid] == 1){
				mid++;
			}else 
			{
				swap(arr,mid,heigh);
				heigh--;
			}
		}
		return arr;
	}
	
	public static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
