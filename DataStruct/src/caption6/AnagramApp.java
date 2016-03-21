package caption6;
import java.io.*;

public class AnagramApp {
	static int size;
	static int count;
	static char[] charArr = new char[100];

	public static void main(String[] args) throws IOException {
		String str = getString();
		size = str.length();
		for(int i=0;i<size;i++)
		{
			charArr[i] = str.charAt(i);
		}
		doAnagram(size);
		if(count%10 !=0)
		{
		    System.out.println("");
		}
		System.out.println("total numbers : "+count);
	}
	
	public static void doAnagram(int newsize)
	{
		if(newsize == 1)
		{
			showArr();
			return;
		}
		else
		{
		    for(int j=0;j<newsize;j++)
		    {
			    doAnagram(newsize - 1);
			    swapPosition(newsize);
		    }
		}
	}
	
	public static void swapPosition(int newsize)
	{
		int i = size - newsize;
		int j;
		char temp = charArr[i];
		for(j=i+1;j<size;j++)
		{
			charArr[j-1] = charArr[j];
		}
		charArr[j-1] = temp;
	}
	
	public static void showArr()
	{
		count++;
		for(int i=0;i<size;i++)
		{
			System.out.print(charArr[i]);
		}
		System.out.print("   ");
		if(count%10 == 0)
		{
			System.out.println("");
		}
		
	}
	
	public static String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("please input a word");
		return br.readLine();
	}

}
