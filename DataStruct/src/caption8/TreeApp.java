package caption8;

public class TreeApp {
	
	static final int NSIZE = 100;
	public static void main(String[] args) {
		Tree tree = new Tree();
		
		for(int i=0;i<NSIZE;i++){
			int temp = (int)(Math.random() * NSIZE);
			tree.insert(new Node(temp));
		}
		tree.showTree();
		
		for(int i=1;i<=10;i++){
			if(tree.find(i)){
				System.out.println(i + " found in tree");
			}
			else{
				System.out.println(i + " not found in tree");
			}
				
		}
	}

}
