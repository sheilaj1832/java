package ui;

import business.Account;
import util.Console;

public class PersonManagerApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Person Manager");
		System.out.println();
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			
			String personType = Console.getString("Create customer or employee? (c/e): ", "c", "e");
			String 
			Person person = null;
			if (personType.equalsIgnoreCase("c"))
				person.customer(amount);
			else if (transType.equalsIgnoreCase("e"))
				person.employee(amount);
		
			
			
			
			choice = Console.getString("Continue (y/n)?", "y", "n");
		}
		
	}

}
