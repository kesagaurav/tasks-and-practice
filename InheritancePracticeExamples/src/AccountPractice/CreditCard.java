package AccountPractice;

public class CreditCard extends Account {


	public  CreditCard(String accountNumber, double balance, Transaction[] transactions) {
		super(accountNumber, balance, transactions);
	}

	public void withdraw(double transactionAmount) {
		super.withdraw(transactionAmount);
		if (transactionAmount >= 5000) {
			balance += 100;
		}
	}
	
	
	
}
