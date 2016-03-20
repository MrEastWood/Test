package caption4;

public class I_Queue {
	private int maxSize;
	private int[] queueArray;
	private int nItems;
	private int front;
	private int rear;
	
	public I_Queue(int n){
		maxSize = n;
		queueArray = new int[maxSize];
		nItems = 0;
		front = 0;
		rear = -1;
	}
	
	public void intsert(int v){
		if(rear == maxSize-1){
			rear = -1;
		}
		rear++;
		nItems++;
		queueArray[rear] = v;
	}
	
	public int remove(){
		int v = queueArray[front];
		front++;
		nItems--;
		return v;
	}
	
	public boolean isEmpty(){
		return (nItems == 0);
	}
	
	public boolean isFull(){
		return (nItems == maxSize);
	}
}
