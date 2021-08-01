package AccountPractice;

public class Transaction {

	private char type;
	private double amount;

	public Transaction(char type, double amount) {
		this.type = type;
		this.amount = amount;
	}
	
	public void printTransaction(double balance) {
		System.out.printf("%4c %12.2f %8.2f\n", type, amount, balance);
	}
	
	public char getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}
	
}
