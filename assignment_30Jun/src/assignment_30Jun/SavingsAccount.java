package assignment_30Jun;

class SavingsAccount implements Account {
 private double balance;
 private double interestRate;

 public SavingsAccount(double initialDeposit, double interestRate) {
     this.balance = initialDeposit;
     this.interestRate = interestRate;
 }

 @Override
 public void deposit(double amount) {
     balance += amount;
 }

 @Override
 public void withdraw(double amount) {
     balance -= amount;
 }

 @Override
 public double getBalance() {
     return balance;
 }

 // Applying interest rate 1.25% for 1 year: 
 public void applyInterest() {
     balance += balance * interestRate/100;
 }
}
