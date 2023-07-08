package OopsAndStack;
import java.util.*;
public class BalancedParanthesis {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     String s = sc.next();
	     boolean st= isBoolean(s);
	     if(st){
	    	 System.out.println("Yes");
	     }else{
	    	 System.out.println("No");
	     }

	}
	
	public static boolean isBoolean(String s){
		int n= s.length();
		Stack<Character> st =new Stack<>();
		for(int i=0 ;i<n;i++){
			if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i) == '{'){
				st.push(s.charAt(i));
			}
			else{
				if(st.empty()){
					return false;
				}
				else{
					if(s.charAt(i)==')' && st.peek() != '(') return false;
					if(s.charAt(i)==']' && st.peek() != '[') return false;
					if(s.charAt(i)=='}' && st.peek() != '{') return false;
					st.pop();
				}
			}
		}
		
		return st.empty();
	}

}
