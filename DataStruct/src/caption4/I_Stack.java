package caption4;

public class I_Stack {
	private char [] stackArray;
	private int top;
	private int maxsize;
	
	public I_Stack(int n){
		stackArray = new char[n];
		maxsize = n;
		top = -1;
	}
	
	public void push(char v){
		stackArray[++top] = v;
	}
	
	public char pop(){
		return stackArray[top--];
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isFull(){
		return (top == maxsize-1);
	}
	
	public char peek(){
		return stackArray[top];
	}
	
	public void displayStack(){
		for(int i=0;i<=top;i++){
			System.out.print(stackArray[i]);
			System.out.print("");
		}
	}
}
