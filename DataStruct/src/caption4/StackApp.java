package caption4;

public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I_Stack stack = new I_Stack(10);
		stack.push('a');
		stack.push('b');
		stack.push('c');
		stack.push('d');
		
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}

	}
}
