package LinkedList;

public class LinkedList {
	
	private class Node {
		int data;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public int size(){
		return this.size;
	}
	
	public boolean isEmpty(){
		return this.size==0;
	}
	//O(n)
	public void display(){
		System.out.println("-------------------");
		Node temp = this.head;
		while(temp!=null){
			System.out.print(temp.data+", ");
			temp=temp.next;
		}
		System.out.println(".");
		System.out.println("-------------------");
		
	}
	
	public void addLast(int item){
		// create anew node
		Node nn = new Node();
		nn.data=item;
		nn.next=null;
		
		//attach
		if(size>=1){
			this.tail.next = nn;
		}
		//summary object
		if(this.size==0){
			this.head = nn;
			this.tail = nn;
			this.size++;
		}else {
			this.tail = nn;
			this.size++;
		}
	}
	
	public void addFirst(int item){
		//create a new node
		Node nn = new Node();
		nn.data=item;
		nn.next=null;
		
		//attach
		if(this.size>=1){
			nn.next=head;
			
		}
		
		//summary updates
		if(this.size==0){
			this.head = nn;
			this.tail = nn;
			this.size++ ;
		}else {
			this.head = nn;
			this.size++;
		}
	}
	
	public void addAt(int item,int idx) throws Exception{
		
		if(idx < 0 || idx > size){
			throw new Exception("Invalid Index");
		}
		
		if(idx==0){
			addFirst(item);
		}else if(idx == this.size){
			addLast(item);
		}else {
			
			//create a node
			Node nn = new Node();
			nn.data = item;
			nn.next=null;
			
			//attach
			Node nm1 = getNodeAt(idx-1);
			Node np1 = nm1.next;
			
			nm1.next = nn;
			nn.next = np1;
			//summary update
			this.size++;
		}
		
	}
	//O(1)
	public int removeFirst() throws Exception{
		if(this.size==0){
			throw new Exception("LL is Empty");
		}
		
		int rv = this.head.data;
		
		if(this.size==1){
			this.head=null;
			this.tail=null;
			this.size=0;
		}else{
			this.head = this.head.next;
			this.size--;
		}
		return rv;
	}
	//O(n)
	public int removeLast() throws Exception{
		if(this.size==0){
			throw new Exception("LL is Empty");
		}
		
		int rv = this.tail.data;
		
		if(this.size==1){
			this.head=null;
			this.tail=null;
			this.size=0;
		}else{
			Node sm2 = getNodeAt(this.size-2);
			this.tail=sm2;
			this.tail.next = null;
			this.size--;
		}
		return rv;
	}
	//O(n)
	public int removeAt(int idx) throws Exception{
		
		if(this.size==0){
			throw new Exception("LL is Empty");
		}
		if(idx<0 || idx >= size){
			throw new Exception("Invalid Index");
		}
		
		if(idx == 0){
			return removeFirst();
		}else if(idx == this.size-1){
			return removeLast();
		}else{
			Node nm1 = getNodeAt(idx-1);
			Node n = nm1.next;
			Node np1 = n.next;
			
			nm1.next=np1;
			this.size--;
			
			return n.data;
		}
	}
	//O(1)
	public int getFirst() throws Exception{
		if(size==0){
			throw new Exception("Linked List Is Empty");
		}
		
		return this.head.data;
	}
	//O(1)
	public int getLast() throws Exception{
		if(size==0){
			throw new Exception("Linked List Is Empty");
		}
		
		return this.tail.data;
	}
	
	public int getAt(int idx) throws Exception{
		
		
		if(this.size==0){
			throw new Exception("LL is Empty");
		}
		
		if(idx<0 || idx>=this.size){
			throw new Exception("Index is Invalid");
		}
		
		Node temp = this.head;
		for(int i= 1; i<=idx;i++){
			temp = temp.next;
		}
		
		return temp.data;
	}
	
   private Node getNodeAt(int idx) throws Exception{
		
		
		if(this.size==0){
			throw new Exception("LL is Empty");
		}
		
		if(idx<0 || idx>=this.size){
			throw new Exception("Index is Invalid");
		}
		
		Node temp = this.head;
		for(int i= 1; i<=idx;i++){
			temp = temp.next;
		}
		
		return temp;
	}
   
   public void revereseData() throws Exception{
	   int left=0;
	   int right = this.size - 1;
	   
	   while(left<right){
		   Node ln = getNodeAt(left);
		   Node rn = getNodeAt(right);
		   int temp = ln.data;
		   ln.data = rn.data;
		   rn.data = temp;
		   
		   left++;
		   right--;
	   }
   }
   
   public void reversePointers(){
	   
	   Node prev = this.head;
	   Node curr = prev.next;
	   
	   while(curr!=null){
		   
		   Node ahead = curr.next;
		   curr.next = prev;
		   
		   prev = curr;
		   curr = ahead;
	   }
	   
	   //swap
	   Node t = this.head;
	   this.head = this.tail;
	   this.tail = t;
	   this.tail.next = null;
   }
   
   public void kReverse(int k) throws Exception{
	   LinkedList prev = null;
	   while(this.size>0){
		   LinkedList curr = new LinkedList();
		   if(this.size >= k){
			   for(int i = 0; i<k ; i++){
				   int val = this.getFirst();
				   this.removeFirst();
				   curr.addFirst(val);
			   }
		   }else {
			   int os = this.size;
			   for(int i = 0; i<os ; i++){
				   int val = this.getFirst();
				   this.removeFirst();
				   curr.addLast(val);
			   }
		   }
		   
		   if(prev == null){
			   prev = curr;
		   }else {
			   prev.tail.next = curr.head;
			   prev.tail = curr.tail;
			   prev.size+=curr.size;
		   }
	   }
	   this.head = prev.head;
	   this.tail=prev.tail;
	   this.size = prev.size;
   }
   
   public int mid(){
	   Node slow = this.head;
	   Node fast = this.head;
	   
	   while(fast.next!=null && fast.next.next!=null){
		   slow = slow.next;
		   fast = fast.next.next;
	   }
	   
	   return slow.data;
   }

}
