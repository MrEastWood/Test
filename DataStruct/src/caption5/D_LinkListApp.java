package caption5;

public class D_LinkListApp {

	public static void main(String[] args) {
		D_LinkList dlist = new D_LinkList();
		dlist.insertFirst(new D_Link(1));
		dlist.insertFirst(new D_Link(2));
		dlist.insertLast(new D_Link(8));
		dlist.insertLast(new D_Link(7));
		dlist.insertFirst(new D_Link(3));
		dlist.insertLast(new D_Link(6));
		dlist.insertFirst(new D_Link(4));
		dlist.insertLast(new D_Link(5));
		dlist.showForward();
		dlist.showBackward();
		dlist.deleteFirst();
		dlist.deleteLast();
		dlist.showForward();
		dlist.showBackward();
		dlist.deleteKey(1);
		dlist.deleteKey(5);
		dlist.showForward();
		dlist.showBackward();
	}
}
