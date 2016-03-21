package caption5;

public class IteratorList {
	private Link current;
	private Link previous;
	private I_LinkList list;
	
	
	public IteratorList(I_LinkList il){
		list = il;
		reset();
	}
	
	public void reset(){
		current = list.getFirst();
		previous = null;
	}
	
	public boolean atEnd(){
		return (current.next == null);
	}
	
	public void nextLink(){
		previous = current;
		current = current.next;
	}
	
	public Link getCurrent(){
		return current;
	}
	
	public void insertAfter(Link l){
		if(list.isEmpty()){
			list.setFirst(l);
			current = l;
		}
		else{
			l.next = current.next;
			current.next = l;
		}		
	}
	
	public void insertBefore(Link l){
		if(previous == null){
			l.next = current;
			list.setFirst(l);
			reset();
		}
		else{
			l.next = previous.next;
			previous.next = l;
			current = l;
		}
	}
	
	public Link deleteCurrent(){
		Link temp = current;
		if(previous == null){
			list.setFirst(current.next);
			reset();
		}
		else{
			previous.next = current.next;
			if(atEnd()){
				reset();
			}
			else{
				current = current.next;
			}
		}
		return temp;
	}
	
	public void showCurrent(){
		System.out.println(current.key);
	}

}
