package assignment_30Jun;
import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Account> accounts;
	
	public Bank() {
		accounts = new ArrayList<>();
	}
	
	public void addAccount(Account addAccounts) {
		accounts.add(addAccounts);
		System.out.println("Account created Successfully...!");
	}
}