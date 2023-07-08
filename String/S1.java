package String;

public class S1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="VGXGPU";
		String ans = simpleCipher(str, 12);
		System.out.println(ans);

	}
	
	 public static String simpleCipher(String encrypted, int k) {
		    // Write your code here
		    String str="";
		    int[] ar=new int[26];
		    for(int i=0;i<encrypted.length();i++){
		        char ch=encrypted.charAt(i);
		        int a=ch-'A';
		        ar[a]=ch;
		        int va=a-k;
		        if(va<0){
		            va=va+25;
		        }
		        char ch1=(char)(va+'A');
		        str=str+ch1;
		    }
		    return str;

		    }

}
