import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ReservationCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Reservation Calculator");
		System.out.println();

		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {

			int aMonth = Console.getInt("Enter the arrival month (1-12): ");
			int aDay = Console.getInt("Enter the arrival day (1-31): ");
			int aYear = Console.getInt("Enter the arrival year: ");

			LocalDate arrivalDate = LocalDate.of(aYear, aMonth, aDay);

			System.out.println();

			int dMonth = Console.getInt("Enter the departure month (1-12): ");
			int dDay = Console.getInt("Enter the departure day (1-31): ");
			int dYear = Console.getInt("Enter the departure year: ");

			LocalDate departureDate = LocalDate.of(dYear, dMonth, dDay);

			Reservation reservation = new Reservation(arrivalDate, departureDate);
			// The instances below refer to the the reservation above.

			System.out.println();

			System.out.println("Arrival Date: " + reservation.getArrivalDateFormatted());
			System.out.println("Departure Date: " + reservation.getDepartureDateFormatted());
			System.out.println("Price: " + reservation.getPricePerNightFormatted() + " per night");

			System.out.println("Total Price: " + reservation.getTotalPriceFormatted() + " for "
					+ reservation.getNumberOfNights() + " nights.");

			choice = Console.getString("Continue (y/n)? ");
		}
		System.out.println("Bye!");
	}

}