package ProductBasedOnJava7;

import java.util.Comparator;

public class ProductCost implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		Double f1=o1.getCost();
		Double f2=o2.getCost();
		return f1.compareTo(f2);
		
	}

}
