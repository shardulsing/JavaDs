package Queue;

public class SUQPushEfficient {
	private DynamicQueue primary;
	private DynamicQueue secondary;
	
	public SUQPushEfficient() throws Exception {
		this.primary = new DynamicQueue();
		this.secondary=new DynamicQueue();
	}
	
	public int size(){
		return this.primary.size();
	}
	
	public boolean isEmpty(){
		return this.primary.isEmpty();
	}
	
	public void push(int data) throws Exception{
		this.primary.enqueue(data);
	}
	
	public int pop() throws Exception{
		while(this.primary.size!=1){
			secondary.enqueue(this.primary.dequeue());
		}
		int rv=this.primary.dequeue();
		while(this.secondary.size!=0){
			primary.enqueue(this.secondary.dequeue());
		}
		return rv;
	}
	
	public int top() throws Exception{
		while(this.primary.size!=1){
			secondary.enqueue(this.primary.dequeue());
		}
		int rv=this.primary.dequeue();
	    this.secondary.enqueue(rv);
		while(this.secondary.size!=0){
			primary.enqueue(this.secondary.dequeue());
		}
		return rv;
	}
	
	public void display() throws Exception{
		reverseQueue(this.primary);
		this.primary.display();
		reverseQueue(this.primary);
	}
	
	private static void reverseQueue(DynamicQueue queue) throws Exception {
		if (queue.isEmpty()) {
			return;
		}
		int element = queue.dequeue();
		reverseQueue(queue);
		queue.enqueue(element);
	}

}
