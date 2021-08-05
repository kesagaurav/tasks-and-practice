package ListToMapConversion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapConversion {

	public static void main(String[] args) {

		List<Student> s = new ArrayList<>();
		s.add(new Student(1, "gaurav"));
		s.add(new Student(2, "surya"));
		s.add(new Student(3, "shiva"));
		s.add(new Student(4, "rajkimar"));
		s.add(new Student(5, "nikhil"));
		s.add(new Student(6, "sai"));
		
		
		// this is the case we can convert an list to map using groupingBy
		Map<Integer, List<String>> multimap=
				s.stream()
				.collect(Collectors.groupingBy(Student::getId,
						Collectors.mapping(Student::getName,
						Collectors.toList())));
		
		System.out.println("multimap " + multimap);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
