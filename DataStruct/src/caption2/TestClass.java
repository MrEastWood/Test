package caption2;
// 引用类型和值类型的区别
// 将引用类型作为参数传递时，对参数的修改也会修改到它本身
// 将值类型作为参数传递时，对参数的修改不会影响到它本身
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
