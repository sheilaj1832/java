import java.util.Scanner;
import java.text.NumberFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MPGApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Miles Per Gallon calculator");
		System.out.println(); // print a blank line

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter miles driven: ");
			// double miles = sc.nextDouble();
			BigDecimal miles = sc.nextBigDecimal();

			System.out.print("Enter gallons of gas used: ");
			// double gallons = sc.nextDouble();
			BigDecimal gallons = sc.nextBigDecimal();

			// double mpg = miles/gallons;
			// mpg = (double) Math.round(mpg *100) /100;
			// NumberFormat number = NumberFormat.getNumberInstance();
			// number.setMaximumFractionDigits(2);

			BigDecimal mpg = miles.divide(gallons, 2, RoundingMode.HALF_UP);

			System.out.println("Miles per gallon is " + mpg + ".");
			System.out.println();

			System.out.print("Calculate another MPG? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
	}

}
