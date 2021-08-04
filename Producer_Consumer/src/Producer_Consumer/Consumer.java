package Producer_Consumer;

public class Consumer implements Runnable {

	Thread t;
	Shop obj;

	public Consumer(Shop sobj1) {
		super();
		obj = sobj1;
		t = new Thread(this, "consumer");
		t.start();
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i <= 5; i++) {
				obj.get();
				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			System.out.println("\n Error " + e);
		}

	}

}
