package assignment_30Jun;

public class SavingsAccount implements Account {
	
	private double balance;
	
	public SavingsAccount(double initialBalance) {
		this.balance = initialBalance;
	}
	
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		balance += amount;
		System.out.println("Deposit successful. New balance: " + balance);
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		System.out.println("Current balance: " + balance);
		return balance;
	}
	
	 public double calculateInterest() {
	        double interestRate = 0.07;
	        double interest = balance * interestRate;
	        System.out.println("Calculated interest: " + interest);
	        return interest;
	    }

}