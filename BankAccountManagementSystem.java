package bankAccount_ManagementSystem;

public class BankAccountManagementSystem {
	public static void main(String[] args) {
		System.out.println("Savings Account");
		System.out.println("---------------");
		SavingsAccount sa = new SavingsAccount(101, 1000, 5.0);
		sa.displayBalance();
		System.out.println("After Interest Balance: " + sa.addInterest());

		System.out.println("\nChecking Account");
		System.out.println("----------------");
		CheckingAccount ca = new CheckingAccount(102, 2000, 1000);
		ca.displayBalance();
		ca.withdraw(2500);

		System.out.println("\nFD Account");
		System.out.println("----------");
		FDAccount fd = new FDAccount(103, 5000, 2, 6);
		fd.displayBalance();
		double maturity = fd.calculateMaturityAmount();
		System.out.println("Maturity Amount (after 2 years at 6%): " + maturity);
	}

}
