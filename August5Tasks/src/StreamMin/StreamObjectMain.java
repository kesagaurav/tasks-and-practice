package StreamMin;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamObjectMain {

	public static void main(String[] args) {
		List<Bus> busList = new ArrayList<>();
		busList.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
		busList.add(new Bus(101, "Abc Travels", 1100.22, 2.4f));
		busList.add(new Bus(190, "Xyz Travels", 1100.22, 2.3f));
		busList.add(new Bus(200, "Jee Travels", 1000.22, 4.3f));
		busList.add(new Bus(104, "Java Travels", 900.22, 4.3f));
		busList.add(new Bus(111, "Xyz Travels", 1200.22, 4.3f));
		
		busList.stream()
		.filter(e->e.getRating()>4)
		.collect(Collectors.toList())
		.forEach(e->System.out.println(e));
	


		System.out.println("\n min price for the xyz travels");
	
		Optional<Bus>  MinXyzTravels=busList.stream().filter(e->e.getProviderName().equals("Xyz Travels")).reduce((c1,c2)->c1.getCost()<c2.getCost()?c1:c2);
		
		
		System.out.println(MinXyzTravels);
		
	

	}

}
