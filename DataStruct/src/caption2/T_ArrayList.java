package caption2;

public class T_ArrayList {
	private int[] alist;
	private int nElems;
	public T_ArrayList(int n)
	{
		alist = new int[n];
		nElems = 0;
	}
	
	public void insert(int value)
	{
		alist[nElems] = value;
		nElems++;
	}
	
	public boolean find(int value)
	{
		int i;
		for(i=0;i<nElems;i++)
		{
			if(alist[i] == value)
			{
				break;
			}
		}
		if(i >= nElems)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public boolean delete(int value)
	{
		int i;
		for(i=0;i<nElems;i++)
		{
			if(alist[i] == value)
			{
				break;
			}
		}
		if(i >= nElems)
		{
			return false;
		}
		else
		{
			for(int j=i;j<nElems;j++)
			{
				alist[j] = alist[j+1];
				nElems--;
			}
			return true;
		}
	}
	
	public void display()
	{
		for(int i=0;i<nElems;i++)
		{
			System.out.println(alist[i]);
		}
	}
	
	public int elemNum()
	{
		return nElems;
	}
	
	public int getElem(int i)
	{
		if(i>=nElems)
		{
			return -1;
		}
		else
		{
			return alist[i];
		}
	}
	
}
