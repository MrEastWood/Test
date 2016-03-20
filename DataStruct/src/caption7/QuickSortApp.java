package caption7;

public class QuickSortApp {
	static int[] a;
    static final int size = 1000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a = new int[size];
		for(int i=0;i<size;i++){
			a[i] = (int)(Math.random() * size);
		}
		System.out.println("before quick sort : ");
		
		for(int i=0;i<size;i++){
			System.out.print(a[i] + "\t");
			if((i+1)%10 == 0){
				System.out.println("");
			}
		}
		
		quickSort(0,size -1);
		
		System.out.println("after quick sort : ");
		for(int i=0;i<size;i++){
			System.out.print(a[i] + "\t");
			if((i+1)%10 == 0){
				System.out.println("");
			}
		}

	}
	
	public static void quickSort(int left,int right){
		if(left >= right){
			return;
		}
		else{
			int pos = partition(left,right);
			quickSort(left,pos - 1);
			quickSort(pos + 1,right);
		}
			
	}
	
	public static int partition(int left,int right){
		int leftArr = left - 1;
		int rightArr = right;
		int pivot = a[right];
		while(true){
			while(a[++leftArr] < pivot);
			
			while(rightArr > left && a[--rightArr] > pivot);
			
			if(leftArr >= rightArr){
				break;
			}
			else{
				swapPos(leftArr,rightArr);
			}
		}
		swapPos(leftArr,right);
		return leftArr;
	}
	
	public static void swapPos(int l,int r){
		int temp = a[l];
		a[l] = a[r];
		a[r] = temp;
	}
}
