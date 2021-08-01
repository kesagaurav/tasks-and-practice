package long1;
import java.lang.*;
public class Long1 {

	public static void main(String[] args) {
		Long l1=78l;
		Long l2=90l;
		Long l3=new Long(23l);
		Long l4=90l;
		Long l5=90l;
		System.out.println("l1==l2 " + (l1==l2));
		System.out.println("l2==l3 " + (l2==l3));
		System.out.println("l1==l2 " + (l1.equals(l2)));
		System.out.println("l2==l3 " + (l2.equals(l3)));
		System.out.println("l4==l5 " + (l4==l5));
		System.out.println("l4==l5 " + (l4.equals(l5)));
		System.out.println(Long.MAX_VALUE);
	}

}
