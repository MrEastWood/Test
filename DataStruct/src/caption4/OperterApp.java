package caption4;
import java.io.*;
public class OperterApp {

	public static void main(String[] args) throws IOException {
		String input,output;
		do{
			System.out.println("请输入算术表达式");
			System.out.flush();
			input = getString();
			if(!input.equals("") && !input.equals("quit")){
				Operter_conv oc = new Operter_conv(input);
				output = oc.doTrain();
				System.out.println("转换后的表达式为");
				System.out.println(output);
				Operter_Cal ocal = new Operter_Cal(output);
				int value = ocal.cal_value();
				System.out.println("计算出来的值为");
				System.out.println(value);
			}
		}while(!input.equals("quit"));
	}
	public static String getString() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}
}
