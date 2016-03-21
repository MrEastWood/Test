package caption4;

public class Operter_Cal {
	private I_StackX stackx;
	private String input;
	
	public Operter_Cal(String s){
		this.input = s;
	}
    
	public int cal_value(){
		stackx = new I_StackX(20);
		int l = input.length();
		int num1,num2;
		int value = 0;
		for(int i=0;i<l;i++){
			char c = input.charAt(i);
			if(c >= '0' && c <= '9'){
				stackx.push((int) c-'0');
			}
			else{
				num1 = Integer.parseInt(String.valueOf(stackx.pop()));
				num2 = Integer.parseInt(String.valueOf(stackx.pop()));
				switch(c){
				    case '+':
				        value = num1 + num2;
				        break;
				    case '-':
				    	value = num1 - num2;
				    	break;
				    case '*':
				    	value = num1 * num2;
				    	break;
				    case '/':
				    	value = num1 / num2;
				    	break;
				}
                stackx.push(value);
			}
		}
		value = Integer.parseInt(String.valueOf(stackx.pop()));
		return value;
	}
}
