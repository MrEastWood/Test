package caption5;

public class D_LinkList {
	private D_Link first;
	private D_Link last;
	
	public D_LinkList(){
		first = null;
		last = null;
	}
	
	public void insertFirst(D_Link dl){
		dl.prev = null;
		dl.next = first;
		if(!isEmpty()){
			first.prev = dl;
		}
		else{
			last = dl;
		}
		first = dl;
	}
	
	public void insertLast(D_Link dl){
		dl.prev = last;
		dl.next = null;
		if(isEmpty()){
			first = dl;
		}
		else{
			last.next = dl;
		}
		last = dl;
	}
	
	public D_Link deleteFirst(){
		if(isEmpty()){
			return null;
		}
		else{
			D_Link temp = first;
			first = first.next;
			if(first !=null){
				first.prev = null;
			}
			else{
				last = null;
			}
			return temp;
		}
	}
	
	public D_Link deleteLast(){
		if(isEmpty()){
			return null;
		}
		else{
			D_Link temp = last;
		    last = last.prev;
		    if(last != null){
		    	last.next = null;
		    }
		    else{
		    	first = null;
		    }
		    return temp;
		}
	}
	
	public D_Link deleteKey(int key){
		D_Link current = first;
		while(current != null && current.key != key){
			current = current.next;
		}
		if(current == null){
			return null;
		}
		else{
		    if(current == first){
		    	first = current.next;
		    }
		    else{
		    	current.prev.next = current.next;
		    }
			
		    if(current == last){
		    	last = current.prev;
		    }
		    else{
		    	current.next.prev = current.prev;
		    }
		    return current;
		}
	}
	
	public void showForward(){
		System.out.println("display first --> last");
		D_Link temp = first;
		while(temp != null){
			temp.showValue();
			temp = temp.next;
		}
		System.out.println("");
	}
	
	public void showBackward(){
		System.out.println("display last --> first");
		D_Link temp = last;
		while(temp != null){
			temp.showValue();
			temp = temp.prev;
		}
		System.out.println("");
	}
	
	public boolean isEmpty(){
		return (first == null);
	}

}
