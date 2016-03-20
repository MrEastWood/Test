package caption8;

public class Node {
	public int value;
	public Node leftChild;
	public Node rightChild;
	
	public Node(int key){
		value = key;
	}
	
	public void displayNode(){
		System.out.printf(value + "\t");
	}

}
