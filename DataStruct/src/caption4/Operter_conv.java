package caption4;

// class name  : Operter_conv
// Author      : Anakin
// Create date : 2014/12/23
// Use for     : 将中缀表达式转换成后缀表达式
// Modify      : 2014/12/24   Anakin     update for fix bug
//               2014/12/25   Anakin     add function for V15A
//
public class Operter_conv {
	private String input;
	private String output = "";
	private I_Stack stackx; 
	public Operter_conv(String s){
		this.input = s;
		int stacksize = input.length();
		stackx = new I_Stack(stacksize);
	}
	
	public String doTrain(){
		for(int i=0;i<input.length();i++){
			char ch = input.charAt(i);
			switch(ch){
			    case '+':
			    case '-':
				    gotOper(ch,1);
				    break;
			    case '*':
			    case '/':
			    	gotOper(ch,2);
			    	break;
			    case '(':
			    	stackx.push(ch);
			    	break;
			    case ')':
			    	gotParen(ch);
			    	break;
			    default:
			    	output = output + ch;
			    	break;
			}
		}
		while(!stackx.isEmpty()){
			output = output + stackx.pop();
		}
		return output;
	}
	
	public void gotOper(char opthis,int lever){
		int l;
		while(!stackx.isEmpty()){
			char top = stackx.pop();
			if(top == '('){
				stackx.push(top);
				break;
			}
			else{
				if(top == '+' || top =='-'){
					l = 1;
				}
				else{
					l = 2;
				}		
				if(l<lever){
					stackx.push(top);
					break;
				}
				else{
					output = output + top;
				}
			}
		}
		stackx.push(opthis);
	}
	
    public void gotParen(char opthis){
		while(!stackx.isEmpty()){
			char chx = stackx.pop();
			if(chx == '('){
				break;
			}
			else{
				output = output + chx;
			}
		}
	}
}
