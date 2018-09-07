import java.util.Scanner;

public class ch02_Student_Registration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Student Registration Form");
		System.out.println();
		
		System.out.print("Enter First Name: ");
		String firstName = sc.next();
		
		System.out.print("Enter Last Name: ");
		String lastName = sc.next();
		
		System.out.print("Enter Birth Year: ");
		int birthYear = sc.nextInt();
	
		System.out.println("Welcome " + firstName +" "+ lastName +"!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: " + firstName+"*"+birthYear);
		sc.close();
	
	}

}
//Student Registration Form
//
//Enter first name: Harold
//Enter last name: Moore
//Enter year of birth: 1998
//
//Welcome Harold Moore!
//Your registration is complete.
//Your temporary password is: Harold*1998

