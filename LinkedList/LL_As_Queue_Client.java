package LinkedList;

public class LL_As_Queue_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LL_As_Queue queue = new LL_As_Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.display();
		System.out.println(queue.front());
		System.out.println(queue.dequeue());
		queue.display();

	}

}
