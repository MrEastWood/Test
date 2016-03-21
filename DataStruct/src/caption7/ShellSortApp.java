package caption7;

public class ShellSortApp {
	static int[] a;
	static int nElems = 1000;

	public static void main(String[] args) {
		a = new int[nElems];
		for(int i=0;i<nElems;i++){
			a[i] = (int)(Math.random() * nElems);
		}
		System.out.println("before shell sort : ");
		
		for(int i=0;i<nElems;i++){
			System.out.print(a[i] + "\t");
			if((i+1)%10 == 0){
				System.out.println("");
			}
		}
		
		shellSort();
		
		System.out.println("after shell sort : ");
		for(int i=0;i<nElems;i++){
			System.out.print(a[i] + "\t");
			if((i+1)%10 == 0){
				System.out.println("");
			}
		}

	}
	
	public static void shellSort(){
		int n = 1; 
		while(n <= nElems/3){
			n = n*3 + 1;
		}
		
		while(n > 0)
		{
			for(int outer=n;outer<nElems;outer++)
			{
				int temp = a[outer];
				int inner = outer;
				while(inner > n-1 && temp <= a[inner-n])
				{
					a[inner] = a[inner-n]; 
				    inner = inner - n;
				}
				a[inner] = temp;
			}
			n = (n-1)/3;
		}
	}
}
