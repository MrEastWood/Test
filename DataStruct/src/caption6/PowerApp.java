package caption6;

import java.util.Scanner;

public class PowerApp {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------------------------");
		System.out.println("求乘方算法");
		System.out.println("-------------------------");
		System.out.println("请输入底数");
		int x = getInt();
		System.out.println("请输入幂");
		int y = getInt();
        int result = doPower(x,y);
        System.out.println("结果是：" + result);
        sc.close();
	}
	
	public static int doPower(int x,int y)
	{
		if(y == 1)
		{
			return x;
		}
		else
		{
			int temp = doPower(x*x,y/2);
			if(y%2 != 0){
				temp = temp * x;
			}
			return temp;
		}
	}
	
	public static int getInt()
	{
		int i = sc.nextInt();
		return i;
	}

}
