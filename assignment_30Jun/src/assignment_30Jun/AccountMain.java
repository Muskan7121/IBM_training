package assignment_30Jun;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		Account savingAccounts = new SavingsAccount(5000);
		bank.addAccount(savingAccounts);
		savingAccounts.deposit(5000);
		savingAccounts.withdraw(100);
		//bank.calculateInterest();
		savingAccounts.getBalance();
		
		//Current Account
		Account currentAccounts = new CurrentAccount(10000);
		bank.addAccount(currentAccounts);
		currentAccounts.deposit(10000);
		currentAccounts.withdraw(2000);
		//currentAccounts.Overdraft();
		currentAccounts.getBalance();
	}

}
