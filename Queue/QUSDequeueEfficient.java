package Queue;

import OopsAndStack.DynamicStack;
import OopsAndStack.StackUsingArray;

public class QUSDequeueEfficient {
	private DynamicStack primary;
    private DynamicStack secondary;
    
    public QUSDequeueEfficient() throws Exception{
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
    	while(primary.size()!=0){
    		secondary.push(primary.pop());
    	}
    	primary.push(data);
    	while(secondary.size()!=0){
    		primary.push(secondary.pop());
    	}
    }
    public int dequeue() throws Exception{
    	return this.primary.pop();
    }
    //O(n) time)
    public int front() throws Exception{
    	return this.primary.pop();
    }
    public void display() throws Exception{
    	this.primary.display();
    }

}
