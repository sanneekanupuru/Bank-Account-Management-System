package bankAccount_ManagementSystem;

public class CheckingAccount extends BankAccount {
	private double overdraftLimit;

	public CheckingAccount(int accountNumber, double balance, double overdraftLimit) {
		super(accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid withdrawal amount!");
			return;
		}
		if (balance + overdraftLimit >= amount) {
			double overdraftUsed = 0;
			if (amount > balance) {
				overdraftUsed = amount - balance;
				balance = 0;
				System.out.println("Withdrawn: " + amount + "\nOverdraft Used: " + overdraftUsed);
			} else {
				balance -= amount;
				System.out.println("Withdrawn: " + amount);
			}
		} else {
			System.out.println("Overdraft limit exceeded");
		}
	}
}
