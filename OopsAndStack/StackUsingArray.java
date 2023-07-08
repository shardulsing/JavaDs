package OopsAndStack;

public class StackUsingArray {
	protected int[] data;
	protected int top;

	public static final int DEFAULT_CAPACITY = 10;

	public StackUsingArray() throws Exception {
		this(DEFAULT_CAPACITY);
	}

	public StackUsingArray(int capacity) throws Exception {
		if (capacity < 1) {
			throw new Exception("INVALID CAPACITY");
		}

		this.data = new int[capacity];
		this.top = -1;
	}

	public int size() {
		return this.top + 1;
	}

	public boolean iSEmpty() {
		return this.size() == 0;
	}
	public void push(int value) throws Exception{
//		Dynamic Stack
//		if(this.size()==this.data.length){
//			int[] arr = new int[2*this.data.length];
//			for(int i=0;i<this.size();i++){
//				arr[i]=this.data[i];
//			}
//			this.data=arr;
//		}
		if(this.size()==this.data.length){
			throw new Exception("Stack is Full");
		}
		this.top++;
		this.data[this.top]=value;
	}
	public int pop() throws Exception{
		if(this.size()==0){
			throw new Exception("Stack is Empty");
		}
		
		int rv = this.data[this.top];
		this.data[this.top]=0;
		this.top--;
		return rv;
	}
	public int top() throws Exception{
		if(this.size()==0){
			throw new Exception("Stack is Empty");
		}
		
		int rv = this.data[this.top];
		
		return rv;
	}
	public void display(){
		for(int i = this.top;i>=0;i--){
			System.out.print(this.data[i]+", ");
		}
		System.out.println("END");
	}

}
