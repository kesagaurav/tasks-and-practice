package AccountPracticeForCash;

import AccountPractice.Account;
import AccountPractice.CreditCard;
import AccountPractice.SavingsAccount;
import AccountPractice.Transaction;

public class AccountMain {

	public static void main(String[] args) {
		
		Transaction[] transactions = {
				new Transaction('W', 2000),
				new Transaction('D', 20000),
				new Transaction('D', 500),
				new Transaction('W', 15000),
				new Transaction('W', 10000)
		};
		for (Transaction transaction : transactions) {
			transaction.printTransaction(5000);
		}
		
		Account savingsAccount = new SavingsAccount("01302343794", 5000, transactions);
		
		Transaction[] cardTransactions = {
				new Transaction('W', 2000),
				new Transaction('D', 2000),
				new Transaction('W', 5000)
		};
		
		
		Account creditCard = new CreditCard("5544 3322 1100 9988", 20000, cardTransactions);
		//creditCardAccount.printStatement();
		
	
		
		Account[] accounts = { savingsAccount, creditCard };
		for (Account account : accounts) {
			account.printStatement();
		}

	
}
