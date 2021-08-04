package ProductBasedOnJava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ProductBasedOnJava7.Product;



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
		
		// this is using java8 features lambda expressions
		
			System.out.println("\n the sort is based on the id 's");
			Collections.sort(productList,(Product p1,Product p2)->{
				Integer i1=p1.getId();
				Integer i2=p2.getId();
				return i1.compareTo(i2);
			});
			
			printProductList(productList);
			
			
			// the sort is based upon the cost
			System.out.println("\n the sort is based upon the costs");
			Collections.sort(productList,(Product p1,Product p2)->{
				Double d1=p1.getCost();
				Double d2=p2.getCost();
				return d1.compareTo(d2);
			});
			
			printProductList(productList);

			
			
			
			
			System.out.println("\n the sort is based upon the ratings");
			Collections.sort(productList,(Product p1,Product p2)->{
				Float f1=p1.getRating();
				Float f2=p2.getRating();
				int x=f1.compareTo(f2);
				if(x==0) {
					Double d1=p1.getCost();
					Double d2=p2.getCost();
					x=d1.compareTo(d2);
				}
				return x;
				
			});
			
			printProductList(productList);
			
			
			
			
			System.out.println("\n sort is based upon the quantity");
			
			
			Collections.sort(productList,(Product p1,Product p2)->{
				Integer i1=p1.getQuantity();
				Integer i2=p2.getQuantity();
				return i1.compareTo(i2);
			});
			
			
			printProductList(productList);
			
			
			
			
			
			
			
			
			
			
			
	}
	
	
	
	
	public static void printProductList(List<Product> productList) {
		for (Product p1 : productList) {
			System.out.println(p1);
		}
	}
	
	

}
