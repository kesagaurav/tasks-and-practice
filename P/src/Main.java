
public class Main {

	public static void main(String[] args) {

			try {
				System.out.println("\n hi i am in try block");
				int x=8/0;
				System.out.println(x);
			}catch(Exception e) {
				System.out.println(5);
			}
			finally {
				System.out.println("\n i am in the finally method");
			}
		
	}

}
