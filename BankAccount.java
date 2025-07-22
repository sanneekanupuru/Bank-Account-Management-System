package bankAccount_ManagementSystem;

public class BankAccount {
	protected int accountNumber;
	protected double balance;

	public BankAccount(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		} else
			System.out.println("Invalid amount!");
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		} else if (amount <= 0) {
			System.out.println("Invalid withdrawal amount!");
		} else {
			System.out.println("Insufficient balance!");
		}
	}

	public void displayBalance() {
		System.out.println("Balance: " + balance);
	}
}
