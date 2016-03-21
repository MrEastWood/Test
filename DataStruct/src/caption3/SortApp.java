package caption3;

public class SortApp {

	public static void main(String[] args) {
		I_Array alist = new I_Array(20);
		for(int i=20;i>0;i--){
			alist.insert(i);
		}
		System.out.println("before sorting");
		alist.showValue();
		alist.InsertSort();
		System.out.println("after sorting");
		alist.showValue();
	}

}
