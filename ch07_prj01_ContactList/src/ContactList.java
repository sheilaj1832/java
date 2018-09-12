import java.util.Scanner;

public class ContactList {

	public static void main(String[] args) {

		System.out.println("Welcome to the Contact List application");
		System.out.println();

		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {	
		
		// prompt user for numeric grade
		String firstName = Console.getString("Enter first name: ");
		Contact fn = new Contact(firstName);
		String lastName = Console.getString("Enter last name: ");
		Contact ln = new Contact(lastName);		
		String email = Console.getString("Enter email: ");
		Contact em = new Contact(email);		
		String phone = Console.getString("Enter phone: ");
		Contact ph = new Contact(phone);	
				
				
		// display the Contact List
		System.out.println();;
		System.out.println("--------------------------------");
		System.out.println("----Current Contact-------------");
		System.out.println("--------------------------------");
		System.out.println("first name: : "+fn.getLine());
		System.out.println("last name: : "+ln.getLine());
		System.out.println("email: : "+em.getLine());
		System.out.println("phone : "+ph.getLine());
						
		System.out.println("------------------------------");
		System.out.println();
				
		choice = Console.getString("Continue y/n? ");
		
	}
		System.out.println("Bye!");

	}
}
