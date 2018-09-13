package business;

public class SavingsAccount extends Account {

	private double monthlyInterestRate;
	private double monthlyInterestPayment;

	// user can't establish an account without a balance,
	// so we need a balance in the constructor. Also
	// we have a business rule that states mothlyInterestRate
	// it 1%. We will not set mnthlyInterestayment until
	// end of month, or when we print result in the app.
	public SavingsAccount(double balance) {
		setBalance(balance); // it extends account which includes balance, so it is needed here.
		this.monthlyInterestRate = .01;
	}

	public double getMonthlyInterestRate() {
		return monthlyInterestRate;
	}

	public void setMonthlyInterestRate(double monthlyInterestRate) {
		this.monthlyInterestRate = monthlyInterestRate;
	}

	public double getMonthlyInterestPayment() {
		return monthlyInterestPayment;
	}

	public void setMonthlyInterestPayment(double monthlyInterestPayment) {
		this.monthlyInterestPayment = monthlyInterestPayment;
	}

	public void applyInterestPayment() {
		// determine what the monthly interest payent is.
		double mip = balance * monthlyInterestRate;
		// set monthlyInterestPayment
		setMonthlyInterestPayment(mip);
		// add mip to balance
		balance += mip;
	}
}
