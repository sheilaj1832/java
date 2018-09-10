import java.util.Scanner;

public class CH04_02_Factorial_Calendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Welcome message
		System.out.println("Welcome to the Factorial Calculator");
		
		String choice = "y";
		
		//While loop for continue
		while (choice.equalsIgnoreCase("y")) {
			System.out.println();
			
		//User information and business logic
			System.out.print("Enter an integer that's greater than 0 and less than 25: ");
			int num = sc.nextInt();
			long numberFactorial = 1;
			for (int i = 1; i<=num; i++ ) {
			  numberFactorial *= i;		 
			}			
			System.out.println("The factorial of " + num + " is " + numberFactorial);
			System.out.println();

			System.out.print("Continue (y/n)? ");
			choice = sc.next();
		}
	// Close scanner	
		sc.close();

	}

}
