package caption2;

public class S_ArrayList {
	private int[] slist;
	private int n;
	
	public S_ArrayList(int n)
	{
		slist = new int[n];
		n = 0;
	}
	
	public void insert(int v)
	{
		int i;
		for(i=0;i<n;i++)
		{
			if(v < slist[i])
			{
				break;
			}
		}
		for(int j=n;j>i;j--)
		{
			slist[j] = slist[j-1];
		}
		slist[i] = v;
		n++;
	}
	
	public boolean delete(int v)
	{
		int r = find(v);
		if(r == n)
		{
			return false;
		}
		else
		{
			for(int i=r;i<n;i++)
			{
				slist[i] = slist[i+1];
			}
			n--;
			return true;
		}
	}
	
	public int find(int v)
	{
		int l = 0;
		int u = n - 1;
		int c;
		while(true)
		{
			c = (l+u)/2;
			if(slist[c] == v)
			{
				return c;
			}
			else if(l > u)
			{
				return n;
			}
			else
			{
				if(slist[c] > v)
				{
					u = c - 1;
				}
				else
				{
					l = c + 1 ;
				}
			}
		}
	}
	
	public void dislpay()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(slist[i]);
		}
	}

}
