
import java.text.NumberFormat;
import java.util.Scanner;

public class CH03_Weather_Converter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Temperature Converter");
		System.out.println();
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter degrees in Fahrenheit: ");
			double temp = sc.nextDouble();
			double celcius = ((temp - 32) * (1 -(4/9)));
			NumberFormat number = NumberFormat.getNumberInstance();
			number.setMaximumFractionDigits(2);
			String celciusString = number.format(celcius);

			System.out.println("Degrees in Celcius: " + celciusString);
			
			System.out.print("Continue y/n? ");
			choice = sc.next();		
			
		}
		sc.close();
	}

}
