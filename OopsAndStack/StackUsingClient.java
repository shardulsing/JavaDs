package OopsAndStack;

public class StackUsingClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
         StackUsingArray stack = new StackUsingArray(5);
         
         for(int i=1;i<=5;i++){
        	 stack.push(i*10);
        	 stack.display();

         }
//         System.out.println(stack.top());
//         stack.pop();
         stack.display();
         StackUsingArray helper = new StackUsingArray();
         reverseStack(stack,helper,0);
         stack.display();
	}
	
	public static void reverseStack(StackUsingArray stack,StackUsingArray helper,int index) throws Exception{
		if(stack.iSEmpty()){
			return;
		}
		int item = stack.pop();
		reverseStack(stack, helper, index+1);
		helper.push(item);
		if(index==0){
			while(!helper.iSEmpty()){
				stack.push(helper.pop());
			}
		}
	}
	
	

}
