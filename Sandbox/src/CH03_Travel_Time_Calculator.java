import java.text.NumberFormat;
import java.util.Scanner;

public class CH03_Travel_Time_Calculator {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Welcome to the Travel Time Calculator");
	
	String choice = "y";
	
	while (choice.equalsIgnoreCase("y")) 
	{
		System.out.println();
		System.out.print("Enter miles: ");
		double miles = sc.nextDouble();
		System.out.print("Enter miles per hour: ");
		double mph = sc.nextDouble();
		System.out.println();
		System.out.println("Estimated travel time");
		System.out.println("---------------------");
		
		//MODULUS ERROR - done see below//
		int hours = (int)miles / (int)mph;
		int milesrem = (((int)miles % (int)mph));
		int minutes = (int) (milesrem/(mph/60));
		
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);

		System.out.println("Continue y/n?");
		choice = sc.nextLine();

	}
	sc.close();
	}
}


