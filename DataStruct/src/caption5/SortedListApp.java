package caption5;

public class SortedListApp {
	public static void main(String[] args) {
		SortedList sl = new SortedList();
		sl.insert(new Link(5,"name3 "));
		sl.insert(new Link(1,"hello "));
		sl.insert(new Link(4,"name2 "));
		sl.insert(new Link(2,"world "));
		sl.insert(new Link(3,"name1 "));
		sl.showLinkList();
		sl.deleteFirst();
		sl.showLinkList();
	}
}
