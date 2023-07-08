package Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class printMax {

	public static void printMax(int[] arr,int k){
		Deque<Integer> q=new LinkedList<>();
		int i;
		for(i=0;i<k;i++){
			while(!q.isEmpty()&&arr[i]>arr[q.getLast()]){
				q.removeLast();
			}
			q.addLast(i);
		}
		for(;i<arr.length;i++){
			System.out.println(arr[q.getFirst()]+" ");
			while(!q.isEmpty()&&q.getFirst()<=i-k){
				q.removeFirst();
			}
			while(!q.isEmpty()&&arr[i]>arr[q.getLast()]){
				q.removeLast();
			}
			
			q.addLast(i);
		}
		System.out.println(arr[q.getFirst()]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0 ; i<n ; i++){
	    	arr[i] = sc.nextInt();
	    }
	    
	    int k = sc.nextInt();
	    printMax(arr,k);
	
	}
	

}
