package caption4;
import java.io.*;
public class OperterApp {

	public static void main(String[] args) throws IOException {
		String input,output;
		do{
			System.out.println("�������������ʽ");
			System.out.flush();
			input = getString();
			if(!input.equals("") && !input.equals("quit")){
				Operter_conv oc = new Operter_conv(input);
				output = oc.doTrain();
				System.out.println("ת����ı��ʽΪ");
				System.out.println(output);
				Operter_Cal ocal = new Operter_Cal(output);
				int value = ocal.cal_value();
				System.out.println("���������ֵΪ");
				System.out.println(value);
			}
		}while(!input.equals("quit"));
	}
	public static String getString() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}
}
