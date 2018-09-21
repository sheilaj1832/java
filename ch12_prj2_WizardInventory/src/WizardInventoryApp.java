import java.util.HashMap;
import java.util.Map;

public class WizardInventoryApp {
	
	private static HashMap<Integer,String> inventory = new HashMap<>();

	public static void main(String[] args) {
		System.out.println("The Wizard Inventory game");
		populateInitialInventory();
		
		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			displayMenuItems();
			command = Console.getString("Command:  ");
			if (command.equalsIgnoreCase("show")) {
				// show wizard inventory
				showInventoryItems();
			}
			else if (command.equalsIgnoreCase("grab")) {
				// add item to inventory
				String newItem = Console.getString("Item Name: ");
				System.out.println(addInventoryItem(newItem));
			}
			else if (command.equalsIgnoreCase("edit")) {
				// edit an item in inventory
				int itemNbr = Console.getInt("Item Number: ");
				System.out.println(editInventoryItem(itemNbr));
			}
			else if (command.equalsIgnoreCase("drop")) {
				// delete an item from inventory
				int itemNbr = Console.getInt("Item Number: ");
				System.out.println(deleteInventoryItem(itemNbr));
			}
			else if (command.equalsIgnoreCase("menu")) {
				displayMenuItems();
			}
			else if (!command.equalsIgnoreCase("exit")) {
				// user entered an invalid command
				System.out.println("Invalid command!  Try again.");
				displayMenuItems();
			}
		}
		System.out.println("Bye!");
	}
	
	public static void displayMenuItems() {
		System.out.println("COMMAND MENU");
		System.out.println("show - Show all items\r" + 
				"grab - Grab an item\r" + 
				"edit - Edit an item\r" + 
				"drop - Drop an item\r" + 
				"menu - Display the menu\r" + 
				"exit - Exit program\r");
	}

	// starting item#s at 1
	public static void populateInitialInventory() {
		inventory.put(1, "wooden staff");
		inventory.put(2, "wizard hat");
		inventory.put(3, "cloth shoes");
	}
	
	public static void showInventoryItems() {
		for (Map.Entry item: inventory.entrySet()) {
			System.out.println(item.getKey() + ". "+item.getValue());
		}
	}
	
	public static String addInventoryItem(String item) {
		int itemNbr = inventory.size() + 1;
		String msg = "";
		if (itemNbr > 4) {
			msg = "You can't carry any more items. Drop something first.";
		}
		else {
			inventory.put(itemNbr, item);
			msg = item + " was added.";
		}
		
		return msg;
	}
	
	public static String editInventoryItem(int nbr) {
		String value = inventory.get(nbr);
		System.out.println("Item selected: "+value);
		String newValue = Console.getString("Updated Item Name? ");
		inventory.put(nbr, newValue);
		return "Item number " + nbr + " was updated.";
	}

	public static String deleteInventoryItem(int nbr) {
		String removedItemValue = inventory.remove(nbr);
		return removedItemValue + " was dropped.";
	}
}

