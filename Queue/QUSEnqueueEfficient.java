package Queue;

import OopsAndStack.DynamicStack;
import OopsAndStack.StackUsingArray;

public class QUSEnqueueEfficient {
    private DynamicStack primary;
    private DynamicStack secondary;
    
    public QUSEnqueueEfficient() throws Exception{
    	this.primary=new DynamicStack();
    	this.secondary=new DynamicStack();
    	
    }
    
    public boolean isEmpty(){
    	return this.primary.iSEmpty();
    }
    public int size(){
    	return this.primary.size();
    }
    public void enqueue(int data) throws Exception{
    	this.primary.push(data);
    	
    }
    public int dequeue() throws Exception{
    	while(primary.size()!=1){
    		secondary.push(primary.pop());
    	}
    	int rv = primary.pop();
    	while(!secondary.iSEmpty()){
    		primary.push(secondary.pop());
    	}
    	return rv;
    }
    //O(n) time)
    public int front() throws Exception{
    	while(primary.size()!=1){
    		secondary.push(primary.pop());
    	}
    	int rv = primary.top();
    	while(!secondary.iSEmpty()){
    		primary.push(secondary.pop());
    	}
    	return rv;
    }
    public void display() throws Exception{
    	reverseStack(primary, secondary, 0);
    	primary.display();
    	reverseStack(primary, secondary, 0);
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
