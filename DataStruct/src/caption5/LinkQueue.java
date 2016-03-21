package caption5;

public class LinkQueue {
	private FirstLastLink fll ;
	
	public LinkQueue(){
		fll = new FirstLastLink();
	}
	
	public void insert(Link l){
		fll.insertLast(l);
	}
	
	public Link remove(){
		return fll.deleteFirst();
	}
	
	public void showQueue(){
		fll.showLinkList();
	}

}
