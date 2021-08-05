package Restaurent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RestaurentMain {

	public static void main(String[] args) {
		List<Restaurant> r=new ArrayList<>();
		r.add(new Restaurant("idly", 300, 2));
		r.add(new Restaurant("vada", 400, 3));
		r.add(new Restaurant("chinesefoods", 500, 4));
		r.add(new Restaurant("puri", 600, 5));
		r.add(new Restaurant("dosa", 900, 8));
		
		System.out.println("\n --------- welcome to the gaurav dhaba --------------------------------");
		System.out.println(" Item name " + " price " + "quantity " + " LineTotal");
		
	
		// sorted using stream
		r.stream().sorted((r1,r2)->r1.getItemname().compareTo(r2.getItemname())).collect(Collectors.toList()).forEach(e->e.printStatement());


Double s=r.stream().map((r1)->r1.getPrice()*r1.getQuantity()).reduce(0.0,(sum,bill)->sum+bill);

System.out.println("                      Total= "+s);
System.out.println("                           .........");
System.out.println("                  BillTotal= "+s*1.05+"\n "
		+ "          (Inclusive of 5% tax)");
System.out.println("\n\n **************Keep Coming*****************");

	}

}
