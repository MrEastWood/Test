package caption6;

public class MergeSortApp {
	static final int NSIZE = 10000;
    static int[] a = new int[NSIZE];
    static int[] b = new int[NSIZE];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<NSIZE;i++)
		{
			a[i]=(int)(Math.random() * NSIZE);
		}
		System.out.println("Array member before Mergesort");
		int count = 0;
		for(int i : a)
		{
			count++;
			System.out.print(i +"\t");
			if(count % 10 == 0)
			{
				System.out.println("");
			}
		}		
		mergeSort(0,NSIZE-1);
		System.out.println("Array member after Mergesort");
		count = 0;
		for(int i : a)
		{
			count++;
			System.out.print(i +"\t");
			if(count % 10 == 0)
			{
				System.out.println("");
			}
		}	
	}
	
	public static void mergeSort(int begin,int end)
	{
		if(begin == end)
		{
			return;
		}
		else
		{
		    int mid = (begin + end) / 2;
		    mergeSort(begin,mid);
		    mergeSort(mid+1,end);
		    mergeArr(begin,mid,end);
		}
	}
	
	public static void mergeArr(int begin,int mid,int end)
	{
		int min = begin;
		int middle = mid+1;
		int start = begin;
		while(min <= mid && middle <=end)
		{
			if(a[min] < a[middle])
			{
				b[start++] = a[min++];
			}
			else
			{
				b[start++] = a[middle++];
			}
		}
		
		while(min <= mid)
		{
			b[start++] = a[min++];
		}
		
		while(middle <=end)
		{
			b[start++] = a[middle++];
		}
		
		for(int i=begin;i<=end;i++)
		{
			a[i] = b[i];
		}			
	}
}
