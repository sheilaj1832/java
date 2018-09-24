package tv.ui;

import java.util.ArrayList;
import java.util.List;

import tv.business.Show;
import tv.business.ShowDB;
import tv.util.Console;

public class TVShowApp {
	private static ShowDB showDB = new ShowDB();

	public static void main(String[] args) {
		System.out.println("Welcome to the TV Show DB App/n");

		String command = "";
		while (!command.equalsIgnoreCase("7")) {
			displayMenu();
			command = Console.getString("Enter command: ");
			if (command.equals("1")) {
				List<Show> shows = showDB.getAll();
				for (Show s : shows) {
				}
			}
			else if (command.equals("2")) {
				// search by genre or length
				String criteria = Console.getString("Search by (g)enre or (l)ength? ",
													"g","l");
				List<Show> shows = new ArrayList<>();
				if (criteria.equalsIgnoreCase("g")) {
					// search by show genre
					String genre = Console.getString("What type of genre?  Comedy, Sci-Fi, Action, or Drama? ");
					shows = showDB.get(genre);
				}
				else if (criteria.equalsIgnoreCase("l")) {
					// search by show length
					int length = Console.getInt("Enter show length?  30, 60, 90? ");
					shows = showDB.get(length);
				}
				
				System.out.println("Result of search:");
				for (Show s : shows) {
					System.out.println(s);
				}
			}
			else if (command.equals("3")) {
				String name = Console.getString("Enter name: ");
		        String rating = Console.getString("Enter rating: ");
		        int length = Console.getInt("Enter length: ");
		        String genre = Console.getString("Enter genre: ");
		        String network = Console.getString("Enter network: ");

		        Show show = new Show(name, rating, length, genre, network);
		        show.setName(name);
		        show.setRating(rating);
		        show.setLength(length);
		        show.setGenre(genre);
		        show.setNetwork(network);
		        
		        boolean success = showDB.add(show);
		        if (success) {
		            System.out.println(name
		                    + " has been added to the database.\n");
		        } else {
		            System.out.println("Error! Unable to add product.\n");
		        }
		    }
			else if (!command.equals("8")) {
				System.out.println("Invalid command. Try again.");
			}
		}

		System.out.println("bye");

	}

	private static void displayMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("COMMAND MENU\n");
		sb.append("1 - List TV Shows\n");
		sb.append("2 - List TV Shows by Genre or Length\n");
		sb.append("3 - Add a show\n");		
		sb.append("7 - Exit\n");
		System.out.println(sb);
	}
	
}