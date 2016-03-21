package caption4;

public class I_StackX {
	private int [] stackArray;
	private int top;
	private int maxsize;
	
	public I_StackX(int n){
		stackArray = new int[n];
		maxsize = n;
		top = -1;
	}
	
	public void push(int v){
		stackArray[++top] = v;
	}
	
	public int pop(){
		return stackArray[top--];
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isFull(){
		return (top == maxsize-1);
	}
	
	public int peek(){
		return stackArray[top];
	}
	
	public void displayStack(){
		for(int i=0;i<=top;i++){
			System.out.print(stackArray[i]);
			System.out.print("");
		}
	}

}
