package caption2;

public class U_ArrayList2 {

	public static void main(String[] args) {
		S_ArrayList sl = new S_ArrayList(100);
		sl.insert(10);
		sl.insert(8);
		sl.insert(9);
		sl.insert(1);
		sl.insert(4);
		sl.insert(3);
		sl.insert(6);
        sl.dislpay();
        sl.delete(6);
        sl.dislpay();
	}

}
