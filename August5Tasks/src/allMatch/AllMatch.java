package allMatch;

import java.util.ArrayList;
import java.util.List;

public class AllMatch {

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
		// allMatch will return true only and only if all the elments associated with the predicate is true and strict
	boolean Matched1=s.stream().allMatch((s2)->s2.endsWith("v"));
	System.out.println(Matched1);

	}

}
