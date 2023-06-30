package assignment_30Jun;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
	    
		 SavingsAccount savingsAccount = new SavingsAccount(2000.0, 2.1);
		 CurrentAccount currentAccount = new CurrentAccount(4000.0, 3000.0);
		 bank.addAccount(savingsAccount);
	     bank.addAccount(currentAccount);
	     bank.deposit(savingsAccount, 500.0);
	     bank.deposit(currentAccount, 500.0);
	     bank.printAccountBalances();
	     savingsAccount.applyInterest();
	     bank.printAccountBalances();
	}

}
