import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Welcomme to the Dice Roller!");
		Scanner sc = new Scanner(System.in);

	System.out.print("Roll the dice (y/n)?");
	String choice = sc.next();
	while (choice.equalsIgnoreCase("y"))	{
		// new instance will roll the dice
		Dice d = new Dice();
		//Dice toSrig will return the result of the roll
		System.out.println(d);
		
		System.out.print("Roll again (y/n)? ");
		choice = sc.next();

}

		sc.close();
		System.out.println("Bye!");
	}

}
