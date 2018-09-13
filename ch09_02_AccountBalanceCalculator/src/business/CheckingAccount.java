package business;

public class CheckingAccount extends Account {

	private double monthlyFee;

	public CheckingAccount(double balance) {
		setBalance(balance); //it extends account which includes balance, so it is needed here.
		this.monthlyFee = 1;
	}

	public double getMonthlyFee() {
		return monthlyFee;
	}

	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}
	public void deductMonthlyFee() {
		balance -= monthlyFee;
	}
}
