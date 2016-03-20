package caption5;

public class LinkStack {
	private FirstLastLink fll;
	
	public LinkStack(){
		fll = new FirstLastLink();
	}
	
	public void push(Link l){
		fll.insertFirst(l);
	}
	
	public Link pop(){
		return fll.deleteFirst();
	}
	
	public void showStack(){
		fll.showLinkList();
	}
}
