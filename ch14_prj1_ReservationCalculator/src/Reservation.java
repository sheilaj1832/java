import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Reservation {

	private LocalDate arrivalDate;
	private LocalDate departureDate;
	public static final double PRICE_PER_NIGHT = 149.0;

	public Reservation(LocalDate arrivalDate, LocalDate departureDate) {
		super();
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public String getArrivalDateFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		return dtf.format(arrivalDate);
	}

	public void setArrivalDateFormatted(LocalDate arrivalDateFormatted) {
		this.arrivalDate = arrivalDate;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public String getDepartureDateFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		return dtf.format(departureDate);
	}

	public void setDepartureDateFormatted(LocalDate departureDateFormatted) {
		this.departureDate = departureDateFormatted;
	}

	// Set up number of nights calculation
	public long getNumberOfNights() {
		long numberOfNights = ChronoUnit.DAYS.between(arrivalDate, departureDate);
		return numberOfNights;
	}

	public String getPricePerNightFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(PRICE_PER_NIGHT);
	}

	public double getTotalPrice() {
		double totalPrice = getNumberOfNights() * PRICE_PER_NIGHT;
		return totalPrice;
	}

	public String getTotalPriceFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(getTotalPrice());
	}

	@Override
	public String toString() {
		return "Reservation [arrivalDate=" + arrivalDate + ", departureDate=" + departureDate + "]";
	}
}