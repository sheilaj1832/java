import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class CH03_Interest_Calculator {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Welcome to the Interest Calculator");
	
	String choice = "y";
			
	while (choice.equalsIgnoreCase("y")) {
	
		System.out.println();
		
		//NEED TO HAVE DOUBLES ENTERED AND CONVERTED TO BIG DECIMALS
		System.out.print("Enter loan amount: ");
		BigDecimal loanAmount = sc.nextBigDecimal();		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String loanAmountString = currency.format(loanAmount);
		System.out.print("Enter interest rate: ");
		BigDecimal interestRate = sc.nextBigDecimal();	
		interestRate = interestRate.setScale(3, RoundingMode.HALF_UP);		
		NumberFormat percent = NumberFormat.getPercentInstance();
		String interestRateString = percent.format(interestRate);
		BigDecimal interest = loanAmount.multiply(interestRate);
		interest = interest.setScale(2, RoundingMode.HALF_UP);
		String interestString = currency.format(interest);
		
		// NEED TO GET PERCENT TO HAVE 3 DECIMALS
		System.out.println("Loan amount: " +  loanAmountString);
		System.out.println("Interest Rate: " +  interestRateString);
		System.out.println("Interest: " + interestString);
				
		System.out.println();
		
		System.out.print("Continue y/n? ");
		choice = sc.next();
		
	}
	
	
	sc.close();
	}

}
