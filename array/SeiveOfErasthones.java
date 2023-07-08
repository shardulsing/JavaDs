package array;

import java.util.Arrays;

public class SeiveOfErasthones {

	public static void main(String[] args) {
		
		SOE(500);

	}
    public static void SOE(int n){
    	
    	boolean[] primes=new boolean[n+1];
    	Arrays.fill(primes, true);
    	primes[0]=primes[1]=false;
    	for(int table=2;table*table<=n;table++){
    		if(primes[table]==false){
    			continue;
    		}
    		for(int mult =2;table*mult<=n;mult++){
    			primes[table*mult]=false;
    		}
    	}
    	
//    	for (int i = 0; i < primes.length; i++) {
//			if (primes[i]) {
//				System.out.println(i);
//			}
//		}
    	for(int i=0;i<primes.length;i++){
    		if(primes[i]){
    			int num =i;
    			boolean isMegaPrime=false;
    			while(num!=0){
    				int rem = num%10;
    				if(primes[rem]){
    					isMegaPrime=true;
    					num=num/10;
    				}else{
    					isMegaPrime=false;
    					break;
    				}
    				
    			}
    			if(isMegaPrime){
    				System.out.print(i+" ");
    			}
    		}
    	}
    }
}
