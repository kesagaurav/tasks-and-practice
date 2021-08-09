import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int a[] = { 11, -2, 1, 2, 3, 4, 5, 6 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1 || a[i] == 2 || a[i] == 3) {
				System.out.println(a[i]);
			} else {
				System.out.println();
			}
			Arrays.sort(a);
		}

	}

}
