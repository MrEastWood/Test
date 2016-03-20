package caption5;

public class LinkStackApp {

	public static void main(String[] args) {
		LinkStack ls = new LinkStack();
		ls.push(new Link(1,"hello "));
		ls.push(new Link(2,"world "));
		ls.push(new Link(3,"name1 "));
		ls.push(new Link(4,"name2 "));
		ls.push(new Link(5,"name3 "));
		ls.showStack();
		ls.pop();
		ls.pop();
		ls.showStack();
	}

}
