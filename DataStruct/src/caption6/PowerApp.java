package caption6;

import java.util.Scanner;

public class PowerApp {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------------------------");
		System.out.println("��˷��㷨");
		System.out.println("-------------------------");
		System.out.println("���������");
		int x = getInt();
		System.out.println("��������");
		int y = getInt();
        int result = doPower(x,y);
        System.out.println("����ǣ�" + result);
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
