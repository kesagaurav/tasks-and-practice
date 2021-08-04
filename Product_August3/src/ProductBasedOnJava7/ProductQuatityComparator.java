package ProductBasedOnJava7;

import java.util.Comparator;

public class ProductQuatityComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		Integer i1=o1.getQuantity();
		Integer i2=o2.getQuantity();
		
		return i1.compareTo(i2);
	}

}
