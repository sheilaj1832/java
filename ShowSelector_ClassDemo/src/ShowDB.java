
public class ShowDB {

	// This method will get an instance of Show for the
	// searchCriteria and searchValue entered by the user.
	public static Show[] getShow(String sCriteria, String sValue) {
		Show[] shows = null; // initialize the variable

		if (sCriteria.equalsIgnoreCase("g")) { // genre
			if (sValue.equalsIgnoreCase("comedy")) {
				shows = new Show[1];
				Show s = new Show("Seinfield", "comedy", 30, "Netflix");
				shows[0] = s;
				// shows[0] as this is not a database. Each request is only 1 time.
			} 
			else if (sValue.equalsIgnoreCase("drama")) {
				shows = new Show[1];
				Show s = new Show("West Wing", "drama", 60, "ABC");
				shows[0] = s;

			} 
			else if (sValue.equalsIgnoreCase("sci-fi")) {
				shows = new Show[1];
				Show s = new Show("Star Trek", "sci-fi", 60, "Hulu");
				shows[0] = s;

			} 
			else if (sValue.equalsIgnoreCase("reality")) {
				shows = new Show[1];
				Show s = new Show("Survivor", "reality", 90, "CBS");
				shows[0] = s;

			} 
			else if (sCriteria.equalsIgnoreCase("l")) { // length
				if (sValue.equalsIgnoreCase("30")) {
					shows = new Show[1];
					Show s = new Show("Seinfield", "comedy", 30, "Netflix");
					shows[0] = s;
				} 
				else if (sValue.equalsIgnoreCase("60")) {
					shows = new Show[2];
					Show s1 = new Show("West Wing", "drama", 60, "ABC");
					Show s2 = new Show("Star Trek", "sci-fi", 60, "Hulu");
					shows[0] = s1;
					shows[1] = s2;
				} 
				else if (sValue.equalsIgnoreCase("90")) {
					shows = new Show[1];
					Show s = new Show("Survivor", "reality", 90, "CBS");
					shows[0] = s;
				} 
				else if (sCriteria.equalsIgnoreCase("n")) { // network
					if (sValue.equalsIgnoreCase("Netflix")) {
						shows = new Show[1];
						Show s = new Show("Seinfield", "comedy", 30, "Netflix");
						shows[0] = s;
						// shows[0] as this is not a database. Each request is only 1 time.
					} 
					else if (sValue.equalsIgnoreCase("ABC")) {
						shows = new Show[1];
						Show s = new Show("West Wing", "drama", 60, "ABC");
						shows[0] = s;

					} 
					else if (sValue.equalsIgnoreCase("Hulu")) {
						shows = new Show[1];
						Show s = new Show("Star Trek", "sci-fi", 60, "Hulu");
						shows[0] = s;

					} 
					else if (sValue.equalsIgnoreCase("CBS")) {
						shows = new Show[1];
						Show s = new Show("Survivor", "reality", 90, "CBS");
						shows[0] = s;

					}
				}
			}
		}
		return shows;
}
}