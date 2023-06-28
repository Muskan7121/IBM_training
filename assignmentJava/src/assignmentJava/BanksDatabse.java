package assignmentJava;

public class BanksDatabse {
	private double balance; 

	 

    public BanksDatabse() { 

        balance = 0.0; 

    } 

 

    public void deposit(double amount) { 

        if (amount > 0) { 
            balance += amount; 
            System.out.println("Deposit successful. Current balance: " + balance); 
        } else { 
            System.out.println("Invalid deposit amount."); 

        } 

    } 

 

    public void withdraw(double amount) { 

        if (amount > 0) { 
            if (amount <= balance) { 
                balance -= amount; 
                System.out.println("Withdrawal successful. Current balance: " + balance); 
            } else { 
                System.out.println("Insufficient funds."); 
            } 
        } else { 
            System.out.println("Invalid withdrawal amount."); 
        } 
    } 

    public double getBalance() { 
        return balance; 

    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BanksDatabse bd= new BanksDatabse();
		bd.deposit(1000);
		bd.deposit(300);
		bd.withdraw(200);
		bd.withdraw(1500);
		
		double balance=bd.getBalance();
		System.out.println("current balance:" + balance); 

	}

}
