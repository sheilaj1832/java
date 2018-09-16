package Q12;

public class Rental {
	
	private int numOfPersons;
	
	public int getNumofPersons() {
		return numOfPersons;
	}
	public void setNumOfPersons(int numOfPersons) {
		this.numOfPersons = numOfPersons;
	}
	public void addPerson (Rental rental) {
		rental.numOfPersons++;
	}	
	
}
