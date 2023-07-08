package recursion.backtracking;

import java.util.Scanner;

public class SubsetSum {
    public static String bo = "No";
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while(t>0){
//			int n = sc.nextInt();
//			int arr[] = new int[n];
//			for(int i= 0;i<n;i++){
//				arr[i] = sc.nextInt();
//			}
			int[] arr = {6, 3, -1, -3, 4, -2, 2,4, 6, -12, -7};
			bo="No";
			subsetSum(arr,0,0,"");
			System.out.println(bo);
		//}

	}
     
	public static void subsetSum(int[] arr,int li,int sum,String ans){
		if (li == arr.length ) {
			if(sum==0&&ans.length()!=0){
                bo="Yes";
            }
            return;
		}

		subsetSum(arr, li + 1,sum+arr[li],ans+arr[li]+" ");
        subsetSum(arr, li + 1,sum,ans);
	}
}
