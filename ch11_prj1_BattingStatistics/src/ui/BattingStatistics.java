package ui;

import business.Account;
import util.Console;

public class BattingStatistics {

	public static void main(String[] args) {

		System.out.println("Welcome to the Batting Average Calculator");
		System.out.println();
		
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
	
			int atBats = Console.getInt("Enter number of times at bat: ");
			System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");
			int[] bats = new int[atBats];
			int bats = Console.getInt("Result for at-bat " +atBats+ ":");
			
			//Avg calculator
			double sum 0.0;
			for (int i =0; i < bats.length; i++ ) {
				sum += bats[i];
			}
			double average = sum / bats.length;	

			}

			choice = Console.getString("Continue (y/n)?", "y", "n");
	}

}
