package caption3;

public class I_Array {
	private int[] a;
	private int qty;
	
	public I_Array(int i){
		a = new int[i];
		qty = 0;
	}
	
	public void insert(int v){
		a[qty] = v;
		qty++;
	}
	
	public void showValue(){
		for(int i=0;i<qty;i++){
			System.out.println(a[i]);
		}
	}
	
	public void bubbleSort(){
		int i,j;
		int temp;
		for(i=qty-1;i>0;i--){
			for(j=0;j<i;j++){
				if(a[j] > a[j+1]){
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;	
				}
			}
		}		
	}
	
	public void SelectSort(){
		int i,j;
		int min,temp;
		for(i=0;i<qty-1;i++){
			min = i;
			for(j=i+1;j<qty;j++){
				if(a[min] > a[j]){
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
	}
	
	public void InsertSort(){
		int i,j;
		int temp;
		for(i=1;i<qty;i++){
			temp = a[i];
			for(j=i;j>0&&temp<a[j-1];j--){
				a[j] = a[j-1];
			}
			a[j] = temp;
		}
	}

}
