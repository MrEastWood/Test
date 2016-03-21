package caption8;

public class TreeApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree = new Tree();
		tree.insert(new Node(8));
		tree.insert(new Node(4));
		tree.insert(new Node(12));
		tree.insert(new Node(2));
		tree.insert(new Node(6));
		tree.insert(new Node(1));
		tree.insert(new Node(3));
		tree.insert(new Node(5));
		tree.insert(new Node(7));
		tree.insert(new Node(10));
		tree.insert(new Node(14));
		tree.insert(new Node(9));
		tree.insert(new Node(11));
		tree.insert(new Node(13));
		tree.insert(new Node(15));
        tree.showTree();
        System.out.println("");
        tree.delete(1);
        tree.showTree();
	}
}
