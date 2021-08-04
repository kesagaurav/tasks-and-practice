package ProductsetExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ProductMain {

	public static void main(String[] args) {

		Set<Product> productList = new HashSet<>();
		productList.add(new Product(5, "tv", 23.30f, 4.5f, 7));
		productList.add(new Product(7, "radio", 29.30f, 1.5f, 8));
		productList.add(new Product(4, "settopbox", 255.30f, 9.5f, 6));
		productList.add(new Product(9, "recorder", 236.30f, 8.5f, 5));
		productList.add(new Product(8, "phone", 237.30f, 8.5f, 4));
		productList.add(new Product(3, "laptop", 2400.30f, 8.5f, 3));
		productList.add(new Product(1, "computer", 7000.30f, 2.5f, 2));
		productList.add(new Product(9, "recorder", 236.30f, 8.5f, 5));
		productList.add(new Product(8, "phone", 237.30f, 8.5f, 4));
		productList.add(new Product(3, "laptop", 2400.30f, 8.5f, 3));
		productList.add(new Product(1, "computer", 7000.30f, 2.5f, 2));

		printProList(productList);

	}

	public static void printProList(Set<Product> productList) {
		Iterator<Product> i = productList.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
