package caption5;

public class SortedList {
	private Link first;
	
	public SortedList(){
		first = null;
	}
	
	public boolean isEmpty(){
		return (first == null);
	}
/*	
	public void insert(Link l){
		if(isEmpty()){
			first = l;
		}
		else{
			Link current = first;
			Link prev = first;
			while(current != null && current.key <= l.key){
				prev = current;
				current = current.next;
			}
			if(current == first){
				l.next = first;
				first = l;
			}
			else{
				prev.next = l;
				l.next = current;
			}
		}
	}
*/	
	public void insert(Link l){
		Link prev = null;
		Link current = first;
		while(current != null && current.key < l.key){
			prev = current;
			current = current.next;
		}
		if(prev == null){
			first = l;
		}
		else{
			prev.next = l;
		}
		l.next = current;		
	}
	
	public Link deleteFirst(){
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public void showLinkList(){
		System.out.println("------------------------");
		System.out.println("* list display");
		System.out.println("------------------------");
		Link current = first;
		while(current != null){
			current.showLink();
			current = current.next;
		}
	}
}
