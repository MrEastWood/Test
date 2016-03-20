package caption5;

public class D_Link {
	public int key;
	public D_Link next;
	public D_Link prev;
	
	public D_Link(int value){
		key = value;
	}
	
	public void showValue(){
		System.out.printf("%d ",key);
	}
}
