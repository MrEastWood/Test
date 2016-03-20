package caption6;
import java.io.*;
import java.util.Scanner;

public class TriangleApp {

	public static void main(String[] args) {
		System.out.printf("result is %d ",triangle(getInt()));
	}
	
	public static int triangle(int n){
		if(n <= 1){
			return n;
		}
		else{
			int result = n + triangle(n-1);
			return result;
		}
	}
	
	public static int getInt(){
		Scanner sc = new Scanner(System.in);
		System.out.println("please input a number");
		int i = sc.nextInt();
		sc.close();
		return i;
	}
	
	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}
}
