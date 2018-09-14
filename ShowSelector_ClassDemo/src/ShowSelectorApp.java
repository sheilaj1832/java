
public class ShowSelectorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the show selector app!");
		
		String searchCriteria = Console.getString("Search by (g)enre, (l)ength, "
				+ " or (n)etwork? ");
		String searchValue = "";
		if (searchCriteria.equalsIgnoreCase("g")) {
			searchValue = Console.getString("Comedy, Reality, Sci-Fi, or Drama? ");
		}
		else if (searchCriteria.equalsIgnoreCase("l")) {
			searchValue = Console.getString("30, 60, or 90?");
		}
		else if (searchCriteria.equalsIgnoreCase("n")) {
			searchValue = Console.getString("Hulu, ABC, CBS, or Netflix? ");
		}
		
		Show[] shows = ShowDB.getShow(searchCriteria, searchValue);
		
		for (Show s: shows) {
			System.out.println(s);
		}
		
		System.out.println("bye!");
	}

}
