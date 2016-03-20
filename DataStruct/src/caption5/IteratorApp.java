package caption5;

public class IteratorApp {

	public static void main(String[] args) {
		I_LinkList ilist = new I_LinkList();
		IteratorList itl = ilist.getIterator();
		itl.insertAfter(new Link(1," "));
		itl.insertAfter(new Link(2," "));
		itl.insertAfter(new Link(3," "));
		itl.insertAfter(new Link(4," "));
		ilist.showList();
		itl.showCurrent();
		itl.insertBefore(new Link(5," "));
		itl.insertBefore(new Link(6," "));
		itl.insertBefore(new Link(7," "));
		itl.insertBefore(new Link(8," "));
		ilist.showList();
		itl.showCurrent();
		itl.nextLink();
		itl.nextLink();
		itl.nextLink();
		itl.nextLink();
		itl.showCurrent();
		itl.deleteCurrent();
		ilist.showList();
		itl.showCurrent();
		itl.reset();
		itl.showCurrent();
	}
}
