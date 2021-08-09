import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListToString {

	public static void main(String[] args) {
		
		List<String> li=new ArrayList<String>();
		li.add("a");
		li.add("d");
		li.add("c");
		li.add("b");
		Collections.sort(li);
		System.out.println(li.toString());
		

	}

}
