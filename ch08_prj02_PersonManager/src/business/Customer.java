package business;

public class Customer extends Person {

	public String CustomerNumber;

	public Customer(String firstName, String lastName, String customerNumber) {
		super(firstName, lastName);
		CustomerNumber = customerNumber;
	}

	public String getCustomerNumber() {
		return CustomerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		CustomerNumber = customerNumber;
	}

	@Override
	public String toString() {
		return "Customer: " + CustomerNumber;
	}
	

}
