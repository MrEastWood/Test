package caption6;

import java.util.Scanner;

public class Towers {
    static int steps = 0;
	public static void main(String[] args) {
		int nDisks = getInt();
		System.out.println("start to move......");
		doTowers(nDisks,'A','B','C');
		System.out.println("total steps : " + steps);
	}
	
	public static int getInt(){
		Scanner sc = new Scanner(System.in);
		System.out.println("please input the number of disks");
		int i = sc.nextInt();
		sc.close();
		return i;
	}
	
	public static void doTowers(int n,char from,char inter,char to){
		if(n == 1)
		{
			System.out.println("Disk 1 from " + from + " to " + to);
			steps++;
		}
		else
		{
			doTowers(n-1,from,to,inter);
			System.out.println("Disk " + n + " from " + from + " to " + to);
			steps++;
			doTowers(n-1,inter,from,to);
		}
	}
}
