import java.util.Scanner;

public class DiceRoller {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dice  Roller");
		System.out.println();
		
		String roll = "y";

		while (roll.equalsIgnoreCase("y")) {
			
		System.out.println("Roll the dice?");
		roll = sc.next();
		}
	}
	public static int getRandomInt (int limit) {
		int die1 = (int) ((Math.random() * 6) + 1);
		int die2 = (int) ((Math.random() * 6) + 1);
		int total = sum (die1 + die2);
				}
		
		private static int sum(int i) {
		return 0;
		
		Scanner scan = new Scanner(System.in);
	
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			
			int die1;
			System.out.println("Die #1: " + die1);
			int die2;
			System.out.println("Die #2: " + die2);
			int total;
			System.out.println("Total: " + total);
			
			if (total >= 12) {
				System.out.println("Boxcars!");
			}
				else if (total <= 2) {
				System.out.println("Snake eyes!");
				}
				else {
					System.out.print(" ");
		}
		}
			System.out.println("Roll again? y/n");
			choice = scan.next();
		}		
		System.out.println("Bye!");
		
	}
