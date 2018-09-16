package Q12;

public class RentalApp {

	public static void main(String[] args) {
		Rental r = new Rental();
		r.setNumOfPersons(5);
		r.addPerson(r);
		System.out.println(r.getNumofPersons());
	}
}
