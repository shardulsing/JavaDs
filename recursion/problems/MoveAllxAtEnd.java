package recursion.problems;

import java.util.Scanner;

public class MoveAllxAtEnd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		XtoEnd(str,0,str.length());

	}
	public static void XtoEnd(String str,int i,int l){
		if (i >= l) 
	        return; 
	  
	    // Store current character 
	    char curr = str.charAt(i); 
	  
	    // Check if current character is not 'x' 
	    if (curr != 'x') 
	        System.out.print(curr); 
	  
	    // recursive function call 
	    XtoEnd(str, i + 1, l); 
	  
	    // Check if current character is 'x' 
	    if (curr == 'x') 
	        System.out.print(curr); 
	  
	    return; 
	}
		
}
