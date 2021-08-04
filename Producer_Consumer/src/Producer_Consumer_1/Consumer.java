package Producer_Consumer_1;

import Producer_Consumer.Shop;

public class Consumer implements Runnable {
	Thread t;
	Shop obj;

	public Consumer(Shop sobj1) {
		obj = sobj1;
		t = new Thread(this, "consumer");
		t.start();
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				obj.get();
				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			System.out.println("\n Error " + e);
		}

	}

}
