package NGBC.Array;

import java.util.Scanner;
import java.util.Stack;

public class FormMinimumNo {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
//        4
//        D I DD II
        int n=sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        
        formMinimumNO(arr);

    }

    public static void formMinimumNO(String[] arr){
        int i=0;
        int n=arr.length;
        while(i<n){
            String str=arr[i];
            Stack<Integer> st = new Stack<>();
            int num=1;
            for(int j=0;j<str.length();j++){
                char ch = str.charAt(j);

                if(ch=='D'){
                    st.push(num);
                    num++;
                }else{
                    st.push(num);
                    num++;

                    while(st.size()>0){
                        System.out.print(st.pop());
                    }
                }
            }
            st.push(num);
            while(st.size()>0){
                System.out.print(st.pop());
            }
            System.out.println();
            i++;
        }

    }

}
