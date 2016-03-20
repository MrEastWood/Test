package caption5;

public class ArrayToSortedListApp {

	public static void main(String[] args) {
		int[] random_int = new int[10];
		SortedList sl = new SortedList();
		for(int i = 0;i<10;i++){
			random_int[i] = (int)(Math.random() * 99);
			Link temp = new Link(random_int[i]," ");
			sl.insert(temp);
		}
		
		System.out.println("not sorted random int");
		for(int i : random_int){
			System.out.printf("%d ",i);
		}
		System.out.println("");
		
		for(int i = 0;i<10;i++){
			Link temp = sl.deleteFirst();
			random_int[i] = temp.key;
		}
		
		System.out.println("sorted random int by SortedList");
		for(int i : random_int){
			System.out.printf("%d ",i);
		}
	}
}
