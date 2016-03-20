package caption8;

public class Tree {
	private Node root;
	private int count;
	public Tree(){
		root = null;
	}
	
	public void insert(Node n){
		if(root == null){
			root = n;
		}
		else{
			Node current = root;
			Node prev = root;
			while(current != null){
				prev = current;
				if(n.value < current.value){
					current = current.leftChild;
				}
				else{
					current = current.rightChild;
				}
			}
			
			if(n.value < prev.value){
				prev.leftChild = n;
			}
			else{
				prev.rightChild = n;
			}			
		}
	}
	
	public boolean find(int key){
		Node current = root;
		while(current != null){
			if(current.value == key){
				return true;
			}
			else if(current.value > key){
				current = current.leftChild;
			}
			else{
				current = current.rightChild;
			}
		}
		return false;
	}
	
	public void delete(int key){
		Node current = root;
		Node parient = root;
		while(current != null){
			if(current.value == key){
				break;
			}
			else if(current.value > key){
				parient = current;
				current = current.leftChild;
			}
			else{
				parient = current;
				current = current.rightChild;
			}
		}
		
		if(current.leftChild == null && current.rightChild == null){
			if(current == root){
				root = null;
			}
			else{
				if(parient.value > key){
					parient.leftChild = null;
				}
				else{
					parient.rightChild = null;
				}
			}		
		}
		else if(current.leftChild == null && current.rightChild != null){
			if(current == root){
				root = current.rightChild;
			}
			else{
				if(parient.value > key){
					parient.leftChild = current.rightChild;
				}
				else{
					parient.rightChild = current.rightChild;
				}
			}	
		}
		else if(current.leftChild != null && current.rightChild == null){
			if(current == root){
				root = current.leftChild;
			}
			else{
				if(parient.value > key){
					parient.leftChild = current.leftChild;
				}
				else{
					parient.rightChild = current.leftChild;
				}
			}	
		}
		else{
			Node minr = getMinRight(current.rightChild);
			if(current == root){
				root = minr;
			}
			else{
				if(parient.value > key){
					parient.leftChild = minr;
				}
				else{
					parient.rightChild = minr;
				}
			}
			
			minr.leftChild = current.leftChild;
			if(minr != current.rightChild){
				minr.rightChild = current.rightChild;
			}
		}
	}
	
	public void showTree(){
		count = 0;
		listTree(root);
	}
	
	private void listTree(Node n){
		if(n == null){
			return;
		}
		else{
			listTree(n.leftChild);
			n.displayNode();
			count++;
			if(count%10 == 0){
				System.out.println("");
			}
			listTree(n.rightChild);
		}
	}
	
	private Node getMinRight(Node n){
		Node current = n;
		Node prev = n;
		while(current.leftChild != null){
			prev = current;
			current = current.leftChild;
		}
		
		if(current != n){
			prev.leftChild = current.rightChild;
		}
		
		return current;
	}
	

}
