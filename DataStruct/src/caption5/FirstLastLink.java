package caption5;

public class FirstLastLink {
	private Link first;
	private Link last;
	
	public FirstLastLink(){
		first = null;
		last = null;
	}
	
	public void insertFirst(Link l){
		l.next = first;
		first = l;
		if(last == null){
			last = l;
		}
	}
	
	public void insertLast(Link l){
		if(first == null){
			first = l;
		}
		else{
			last.next = l;
		}
		last = l;
	}
	
	public Link deleteFirst(){
		Link temp = first;
		first = first.next;
		if(first == null){
			last = null;
		}
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
