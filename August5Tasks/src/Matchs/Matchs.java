package Matchs;

import java.util.ArrayList;
import java.util.List;

public class Matchs {

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
		// this is anymatch
		boolean matchedResult=s.stream().anyMatch((s1)->s1.startsWith("g"));
		System.out.println(matchedResult);

	}

}
