package caption5;

public class LinkApp {
    public static LinkList ls;
	public static void main(String[] args) {
		ls = new LinkList();
		add(1,"hello ");
		add(2,"world ");
		add(3,"my ");
		add(4,"name ");
		add(5,"is ");
		add(6,"liu xing yi ");
        ls.showLinkList();
        ls.deleteFirst();
        ls.deleteFirst();
        ls.showLinkList();
        Link node =  ls.find(2);
        if(node != null){
        	System.out.println("key find,value is " + node.value);
        	System.out.println("delete it");
        	ls.delete(2);
        	ls.showLinkList();
        }
        else{
        	System.out.println("key not find");
        }
        
        
	}
	
	public static void add(int key,String value){
		Link link = new Link(key, value);
		ls.insertFirst(link);
	}

}
