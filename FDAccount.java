package bankAccount_ManagementSystem;

public class FDAccount extends BankAccount {
	private int termInYears;
	private double fdInterestRate;

	public FDAccount(int accountNumber, double balance, int termInYears, double fdInterestRate) {
		super(accountNumber, balance);
		this.termInYears = termInYears;
		this.fdInterestRate = fdInterestRate;
	}

	public double calculateMaturityAmount() {
		double maturity = balance + (balance * fdInterestRate * termInYears / 100);
		return maturity;
	}
}
