package AccountPractice;

public class Account {

	
	
	protected String accountNumber;
	protected double balance;
	protected char type; // S - Savings Account; C - Credit Card Account; FD; RD; Demat Account
	protected Transaction[] transactions;
	
	public Account() {
		
	}
	
	public Account(String accountNumber, double balance, Transaction[] transactions) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	//	this.type = type;
		this.transactions = transactions;
	}
	
	public void deposit(double transactionAmount) {
		balance += transactionAmount;
		/*if (type == 'S' && transactionAmount == 10000) {
			balance += 150;
		}*/
	}
	
	public void withdraw(double transactionAmount) {
		if (balance - transactionAmount >= 0) {
			balance -= transactionAmount;
		}
		
	}
	
	public void printStatement() {
		System.out.println("Account Statement of " + accountNumber);
		System.out.println("Initial Balance: " + balance);
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("Type  Transaction  Balance");
		System.out.println("--------------------------");
		
		for (Transaction transaction : transactions) {
			if (transaction.getType() == 'D') {
				deposit(transaction.getAmount());
			}
			if (transaction.getType() == 'W') {
				withdraw(transaction.getAmount());
			}
			transaction.printTransaction(balance);
		}
		System.out.println("--------------------------");
	}
	
	
	
}
