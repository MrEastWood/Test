package caption5;

public class FirstLastApp {

	public static void main(String[] args) {
		FirstLastLink fll = new FirstLastLink();
		fll.insertLast(new Link(1,"hello "));
		fll.insertLast(new Link(2,"world "));
		fll.insertLast(new Link(3,"my "));
		fll.insertLast(new Link(4,"name "));
		fll.insertLast(new Link(5,"is "));
		fll.insertLast(new Link(6,"anakin "));
		fll.showLinkList();
		fll.deleteFirst();
		fll.deleteFirst();
		fll.showLinkList();
		fll.insertFirst(new Link(2,"world "));
		fll.insertFirst(new Link(1,"hello "));
		fll.showLinkList();
	}

}
