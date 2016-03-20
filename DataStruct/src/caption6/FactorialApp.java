package caption6;

import java.util.Scanner;

public class FactorialApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = getInt();
		int number = factorial(i);
		System.out.println("result = " + number);
	}
	
	public static int factorial(int i)
	{
		if(i == 1)
		{
			return 1;
		}
		else
		{
			return i*factorial(i-1);
		}
	}
	
	public static int getInt(){
		Scanner sc = new Scanner(System.in);
		System.out.println("please input a number");
		int i = sc.nextInt();
		sc.close();
		return i;
	}

}
