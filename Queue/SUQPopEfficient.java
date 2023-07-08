package Queue;

public class SUQPopEfficient {
	private DynamicQueue primary;
	private DynamicQueue secondary;
	
	public SUQPopEfficient() throws Exception {
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
		while(this.primary.size!=0){
			secondary.enqueue(this.primary.dequeue());
		}
		this.primary.enqueue(data);
		while(this.secondary.size!=0){
			primary.enqueue(this.secondary.dequeue());
		}
	}
	
	public int pop() throws Exception{
		return this.primary.dequeue();
	}
	
	public int top() throws Exception{
		return this.primary.front();
	}
	
	public void display() throws Exception{
		
		this.primary.display();
	
	}
}
