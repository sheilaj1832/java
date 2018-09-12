
public class Console {

	import java.util.Scanner;
	    
	    private static Scanner sc = new Scanner(System.in);

	    public static String getString(String prompt) {
	        System.out.print(prompt);
	        boolean isValid = false;
	        String s = "";
	        while (!isValid) {
	        	System.out.print(prompt);;
	        	s = sc.nextLine();
	        if (s.equals("")) {
	        		System.out.println("Error! This entry is required!");
	        }
	        else {
	        	isValid = true;
	        }
	       }
	        return s;
	    } 
	    public static String getString(String prompt) {
	        System.out.print(prompt);
	        boolean isValid = false;
	        String s = "";
	        while (!isValid) {
	        	System.out.print(prompt);;
	        	s = sc.nextLine();
	        if (s.equals("")) {
	        		System.out.println("Error! This entry is required!");
	        }
	        else {
	        	isValid = true;
	        }
	       }
	        return s;

		choice = Console.getString("Continue y/n? ");
	
	System.out.println("Bye!");
	}