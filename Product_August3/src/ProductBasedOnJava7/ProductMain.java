package ProductBasedOnJava7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ProductMain {

	public static void main(String[] args) {
		
		List<Product> productList=new ArrayList<>();
		productList.add(new Product(5, "tv", 23.30f, 4.5f, 7));
		productList.add(new Product(7, "radio", 29.30f, 1.5f, 8));
		productList.add(new Product(4, "settopbox", 255.30f, 9.5f, 6));
		productList.add(new Product(9, "recorder", 236.30f, 8.5f, 5));
		productList.add(new Product(8, "phone", 237.30f, 8.5f, 4));
		productList.add(new Product(3, "laptop", 2400.30f, 8.5f, 3));
		productList.add(new Product(1, "computer", 7000.30f, 2.5f, 2));
		
		System.out.println("\n collection sort based upon id");
		Collections.sort(productList);
		printProductList(productList);
		
		
		System.out.println("\n collections sort bases upon product names");
		Collections.sort(productList);
		printProductList(productList);

		System.out.println("\n collections based upon the cost values");
		Collections.sort(productList);
		printProductList(productList);
		
		


		System.out.println("\n collections based upon the ratings");
		Collections.sort(productList);
		printProductList(productList);
		
		
		System.out.println("\n collections based upon the quantity");
		
		
		Collections.sort(productList);
		printProductList(productList);
		
		
			
		
		
	}

	public static void printProductList(List<Product> productList) {
		for (Product p1 : productList) {
			System.out.println(p1);
		}
	}

}
