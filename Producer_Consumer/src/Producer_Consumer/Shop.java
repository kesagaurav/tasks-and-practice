package Producer_Consumer;

public class Shop {

	int pno=0;
	synchronized public void put(int n) {
		pno=n;
		System.out.println("\n produced " + pno);
	}
	
	synchronized public void get() {
		System.out.println("\n consumed " + pno);
	}

	
	
	
	
}
