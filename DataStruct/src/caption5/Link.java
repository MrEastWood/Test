package caption5;

public class Link {
	public int key;
	public String value;
	public Link next;
	
	public Link(int k,String v){
		key = k;
		value = v;
	}
	
	public void showLink(){
		System.out.printf("key = %d,value = %s",key,value);
		System.out.println("");
	}	
}
