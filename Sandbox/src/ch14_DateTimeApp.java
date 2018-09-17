import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ch14_DateTimeApp {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);
		
		LocalDate halloween = LocalDate.of(2018, 10, 31);
		System.out.println(halloween);
		
		LocalDate christmas = LocalDate.of(2018, 12, 25);
		System.out.println(christmas);
		
		LocalDateTime thanksgiving = LocalDateTime.of(2018, 11, 22, 13, 00, 00);
		System.out.println(thanksgiving);
		System.out.println("Thanksgiving is on a "  + thanksgiving.getDayOfWeek());
		System.out.println("Christmas is the " + christmas.getDayOfYear() + " day of the year");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(dtf.format(thanksgiving));
		
		
	}

}

