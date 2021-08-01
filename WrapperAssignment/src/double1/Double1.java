package double1;

public class Double1 {

	public static void main(String[] args) {

		Double d=12.00;
		Double d1=12.00;
		Double d2=13.00;
		Double d3=14.00;
		
		System.out.println("d==d1 " + (d==d1));
		System.out.println("d1==d2 " + (d1==d2));
		System.out.println("d2==d3 " + (d2.equals(d3)));
		System.out.println("d==d1 " + (d.equals(d1)));
		
	}

}
