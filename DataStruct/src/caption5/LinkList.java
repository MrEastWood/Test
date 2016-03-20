package caption5;

public class LinkList {
	private Link first;
	
	public LinkList(){
		first = null;
	}
	
	public void insertFirst(Link l){
		l.next = first;
		first = l;
	}
	
	public Link deleteFirst(){
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public Link find(int key){
		Link temp = first;
		while(temp.key != key){
			if(temp.next == null){
				return null;
			}
			else{
				temp = temp.next;
			}
		}
		return temp;
	}
	
	public Link delete(int key){
		Link current = first;
		Link prev = first;
		while(current.key != key){
			if(current.next == null){
				return null;
			}else{
			    prev = current;
			    current = prev.next;
			}
		}
		if(current == first){
			first = first.next;
		}
		else{
			prev.next = current.next;
		}
		return current;
	}
	
	public void showLinkList(){
		Link current = first;
		System.out.println("------------------------");
		System.out.println("* list display");
		System.out.println("------------------------");
		while(current != null){
			current.showLink();
			current = current.next;
		}
	}

}
