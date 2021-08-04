package Producer_Consumer_1;

public class Shop {

	int pno = 0;
	boolean flag = false;

	synchronized public void put(int n) {
		try {
			if (flag == true)
				wait();
		} catch (InterruptedException e) {
			System.out.println("\n error " + e);
		}
		pno = n;
		System.out.println("\n produced " + pno);
		flag = true;
		notify();
	}

	synchronized public void get() {
		try {
			if (flag == false)
				wait();
		} catch (InterruptedException e) {
			System.out.println("\n error " + e);
		}
		System.out.println("\n consumed " + pno);
		flag = false;
		notify();
	}

}
