package Restaurent;

public class Restaurant implements Comparable<Restaurant> {

	private String itemname;
	private double price;
	private int quantity;
	public Restaurant() {
		super();
	}
	public Restaurant(String itemname, double price, int quantity) {
		super();
		this.itemname = itemname;
		this.price = price;
		this.quantity = quantity;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Restaurant [itemname=" + itemname + ", price=" + price + ", quantity=" + quantity + "]";
	}
	@Override
	public int compareTo(Restaurant o) {

		return 0;
	}
	
	public void printStatement() {
		System.out.printf("  %8s %5.2f %6d %10.2f\n",itemname,price,quantity,price*quantity);
	}
	
	
}



