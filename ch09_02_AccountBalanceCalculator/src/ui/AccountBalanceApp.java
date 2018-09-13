package ui;
import java.text.NumberFormat;

import business.Account;
import business.CheckingAccount;
import business.SavingsAccount;
import util.Console;

public class AccountBalanceApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Account Balance Calculator: ");
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println("Starting balances:");
		CheckingAccount ca = new CheckingAccount(1000);
		SavingsAccount sa = new SavingsAccount(1000);

		System.out.println("Checking: " + cf.format(ca.getBalance()));
		System.out.println("Savings: " + cf.format(sa.getBalance()));

		System.out.println("Enter transactions for the month");

		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {

			String transType = Console.getString("Withdrawal or Deposit (w/d)?", "w", "d");
			String acctType = Console.getString("Checking or Savings (c/s)?", "c", "s");
			double amount = Console.getDouble("Amount?", 0, Double.POSITIVE_INFINITY);

			Account acct = null;
			if (acctType.equalsIgnoreCase("c"))
				acct = ca;
			else if (acctType.equalsIgnoreCase("s"))
				acct = sa;

			if (transType.equalsIgnoreCase("w"))
				acct.withdraw(amount);
			else if (transType.equalsIgnoreCase("d"))
				acct.deposit(amount);

			choice = Console.getString("Continue (y/n)?", "y", "n");
		}
		sa.applyInterestPayment();
		ca.deductMonthlyFee();
		System.out.println();
		System.out.println("Monthly Payments and fees:");
		System.out.println("Checking Fee: " + cf.format(ca.getMonthlyFee()));
		System.out.print("Monthly Interest Payment: " + cf.format(sa.getMonthlyInterestPayment()));
		System.out.println();

		System.out.println();
		System.out.println("Final Balances");
		System.out.println("Checking: " + cf.format(ca.getBalance()));
		System.out.println("Savings: " + cf.format(sa.getBalance()));
		System.out.println();

		System.out.println("Bye!");
	}

}
