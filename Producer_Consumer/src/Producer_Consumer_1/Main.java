package Producer_Consumer_1;

import Producer_Consumer.Consumer;
import Producer_Consumer.Producer;
import Producer_Consumer.Shop;

public class Main {

	public static void main(String[] args) {
		Shop sobj=new Shop();
		Producer p=new Producer(sobj);
		Consumer c=new Consumer(sobj);

	}

}
