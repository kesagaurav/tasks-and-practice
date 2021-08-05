package Distinct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {

	public static void main(String[] args) {
		
		List<String> s=new ArrayList<>();
		s.add("gaurav");
		s.add("gaurav");
		s.add("deepa");
		s.add("surya");
		s.add("deepa");
		s.add("gdfjndfkj");
		s.add("nfdjdnfs");
		s.add("eruereri");
		s.add("aeiou");
		s.add("gaurav");
		// distict will remove duplicates
		s.stream().distinct().forEach(e->System.out.println(e));
		
	
	
		

	}

}
