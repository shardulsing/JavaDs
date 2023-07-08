package Queue;

public class Queues {
    
	private int[] arr;
	private int cs;
	private int ms;
	private int front;
	private int rear;
	
	public static int DEFAULT_CAPACITY = 10;
	
	public Queues() {
        this(DEFAULT_CAPACITY);
	}

	public Queues(int capacity) {
        this.arr=new int [capacity];
        this.cs=0;
        this.ms=capacity;
        this.front=0;
        this.rear=0;
	}
	
	public boolean isFull(){
		return this.cs==this.ms;
	}
	
	public boolean isEmpty(){
		return this.cs==0;
	}
	
	public void enqueue(int data){
		if(!this.isFull()){
			this.arr[this.rear]=data;
			this.rear=(this.rear+1);
			this.cs=this.cs+1;
		}
	}
	
	public int dequeue(){
		int item=-1;
		if(!this.isEmpty()){
			 item = this.arr[this.front];
			this.front=(this.front+1);
			this.cs=this.cs-1;
		}
		return item;
	}
	
	public int getFront(){
		return this.arr[this.front];
	}
//	public static void main(String[] args) {
//		Queues queue = new Queues();
//		for(int i=1;i<=6;i++){
//			queue.enqueue(i);
//		}
//		queue.dequeue();
//		queue.dequeue();
//		queue.enqueue(8);
//		while(!queue.isEmpty()){
//			System.out.println(queue.getFront());
//			queue.dequeue();
//		}
//
//	}

}
