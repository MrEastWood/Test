package caption5;

public class LinkQueueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkQueue lq = new LinkQueue();
		lq.insert(new Link(1,"hello "));
		lq.insert(new Link(2,"world "));
		lq.insert(new Link(3,"name1 "));
		lq.insert(new Link(4,"name2 "));
		lq.insert(new Link(5,"name3 "));
		lq.showQueue();
		lq.remove();
		lq.remove();
		lq.showQueue();
	}

}
