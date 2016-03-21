package caption2;
public class U_ArrayList {
	public static void main(String[] args)
	{
		T_ArrayList alist1 = new T_ArrayList(100);
		T_ArrayList alist2 = new T_ArrayList(100);
		alist1.insert(123);
		alist1.insert(125);
		alist1.insert(129);
		alist1.insert(101);
		alist1.insert(111);
		alist1.insert(122);
		alist1.insert(127);
		alist1.insert(132);
		alist1.insert(144);
		alist1.insert(99);
		alist1.insert(86);
		
		alist2.insert(89);
		alist2.insert(99);
		alist2.insert(100);
		alist2.insert(101);
		alist2.insert(102);
		alist2.insert(111);
		for(int i=0;i<alist2.elemNum();i++)
		{
			if(alist1.find(alist2.getElem(i)))
			{
				System.out.println(alist2.getElem(i) + " found in Arraylist");
			}
			else
			{
				System.out.println(alist2.getElem(i) + " not found in Arraylist");
			}
		}
	}

}
