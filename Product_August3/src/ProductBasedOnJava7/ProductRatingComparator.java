package ProductBasedOnJava7;

import java.util.Comparator;

public class ProductRatingComparator implements Comparator<Product> {



	@Override
	public int compare(Product o1, Product o2) {
		Float f1=o1.getRating();
		Float f2=o2.getRating();
		int x=f1.compareTo(f2);
		if(x==0) {
			Double d1=o1.getCost();
			Double d2=o2.getCost();
			x=d1.compareTo(d2);
		}
		return x;
	}

}
