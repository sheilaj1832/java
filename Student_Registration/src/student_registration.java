import java.util.Scanner;

public class student_registration {

	public static void main(String[] args) {

		System.out.println("Student Registration Form");

		System.out.println(); // print a blank line

		// create a Scanner object
		Scanner sc = new Scanner(System.in);

		// display operational messages
		System.out.print("Enter First Name: ");
		String firstName = sc.next();
		System.out.print("Enter Last Name: ");
		String lastName = sc.next();
		System.out.print("Enter year of birth: ");
		String birthYear = sc.next();

		System.out.println("Welcome " + firstName + " " + lastName + "!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: " + firstName + "*" + birthYear);

		System.out.println(); // print a blank line
		sc.close();
	}

}
