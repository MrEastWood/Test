package caption2;
// �������ͺ�ֵ���͵�����
// ������������Ϊ��������ʱ���Բ������޸�Ҳ���޸ĵ�������
// ��ֵ������Ϊ��������ʱ���Բ������޸Ĳ���Ӱ�쵽������
public class TestClass {
	public static void main(String args[])
	{
		Class1 c1 = new Class1("hello");
		c1.showstr();
		int i = 20;
		changestr(c1);
		c1.showstr();
		changeint(i);
		System.out.println(i);
	}
	public static void changestr(Class1 c)
	{
		c.str = c.str + " word";
	}
	public static void changeint(int i)
	{
		i = i + 5;
	}
		
}
