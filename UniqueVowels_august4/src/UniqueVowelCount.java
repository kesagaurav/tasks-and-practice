import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class UniqueVowelCount {

	public static void main(String[] args) {

		String s = "hey hello everyone its getting complicated right that's why we should wrap up the tasks given on same day but we rarely stick to it sad";

		System.out.println(sortOnVowels(s));

		System.out.println("\n");

		s = "Hello My name is Gaurav";

		System.out.println(sortOnVowels(s));

		System.out.println("\n");

		s = "Haaaaeeeeaeiiiii khuioua";

		System.out.println(sortOnVowels(s));

	}

	public static String sortOnVowels(String s) {

		Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());

		String ar[] = s.split(" ");

		Arrays.sort(ar, Collections.reverseOrder());

//		Arrays.sort(ar);

		for (String w : ar) {

			int count = 0;

			count = count_Vowels(w);

			if (map.containsKey(count)) {

				String temp = map.get(count);

				temp = temp + " " + w;

				map.put(count, temp);

			} else {

				map.put(count, w);

			}

		}

		System.out.println("map : " + map);

		StringBuilder sb = new StringBuilder();

		for (Entry<Integer, String> e : map.entrySet()) {

			sb.append(e.getValue()).append(" ");

		}

		return sb.toString().trim();

	}

	public static int count_Vowels(String str) {

		int a = 0, e = 0, i = 0, o = 0, u = 0;

		for (char ch : str.toLowerCase().toCharArray()) {

			if (ch == 'a') {

				a = 1;

			} else if (ch == 'e') {

				e = 1;

			} else if (ch == 'i') {

				i = 1;

			} else if (ch == 'o') {

				o = 1;

			} else if (ch == 'u') {

				u = 1;

			}

		}

		return a + e + i + o + u;

	}

}
