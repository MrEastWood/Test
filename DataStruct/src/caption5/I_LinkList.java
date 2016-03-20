package caption5;

public class I_LinkList {
	private Link first;
	
	public I_LinkList(){
		first = null;
	}
	
	public boolean isEmpty(){
		return (first == null);
	}
	
	public Link getFirst(){
		return first;
	}
	
	public void setFirst(Link l){
		first = l;
	}
	
	public IteratorList getIterator(){
		return new IteratorList(this);
	}
	
	public void showList(){
		Link current = first;
		while(current != null){
			System.out.printf("%d ",current.key);
			current = current.next;
		}
		System.out.println(" ");
	}

}
