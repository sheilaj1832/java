import java.util.Scanner;

public class CH03_Rectangle_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Area and Perimeter Calculator");
		System.out.println();
		
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {			
					
			System.out.print("Enter Length: ");
			double length = sc.nextDouble();
			System.out.print("Enter Width: ");
			double width = sc.nextDouble();
			
			double area = width * length;
			double perimeter = (2 * width) + (2 * length);
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			System.out.println();

			System.out.print("Continue (y/n)? ");
			choice = sc.next();
		}
		sc.close();

	}
}
