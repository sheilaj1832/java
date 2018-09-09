import java.util.Scanner;

public class StudentRegistration02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Student Registration Form");
		
		System.out.print("Enter first name: ");
		String firstName = sc.next();

		System.out.print("Enter last name: ");
		String lastName = sc.next();
		
		System.out.print("Enter birth year: ");
		int birthYear = sc.nextInt();
		System.out.println();
		
		System.out.println("Welcome " + firstName + " " + lastName + "!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: " + firstName + "*" + birthYear);
		

		
		sc.close();
	}

}
