package caption4;

public class QueueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I_Queue queueArr = new I_Queue(10);
		queueArr.intsert(10);
		queueArr.intsert(20);
		queueArr.intsert(30);
		queueArr.intsert(40);
		queueArr.intsert(50);
		queueArr.intsert(60);
		while(!queueArr.isEmpty()){
			System.out.println(queueArr.remove());
		}
	}

}
