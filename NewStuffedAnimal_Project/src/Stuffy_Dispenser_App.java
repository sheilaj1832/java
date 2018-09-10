import java.util.Scanner;

public class Stuffy_Dispenser_App {

	public static void main(String[] args) {
		System.out.println("Welcome to the Stuffy dispenser");
		System.out.println("Create a new Stuffy...");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter stuffy name: ");
		String name = sc.next();
		
		System.out.print("Enter stuffy type (ie: bear, monkey or other animal): ");
		String type = sc.next();
		
		System.out.print("Enter stuffy color: ");
		String color = sc.next();
		
		
		// need to let the strings in the correct order from the Stuffy file)
		Stuffy myStuffy = new Stuffy(name, type, color);
		
		System.out.println("New stuffy: "+myStuffy);
		
		System.out.println("Bye!");
			
		sc.close();
	}

}
