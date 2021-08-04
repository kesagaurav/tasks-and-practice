package Producer_Consumer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shop sobj=new Shop();
		Producer p=new Producer(sobj);
		Consumer c=new Consumer(sobj);

	}

}
