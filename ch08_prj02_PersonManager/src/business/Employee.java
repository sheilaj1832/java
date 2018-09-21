package business;

public class Employee extends Person {


	public String ssn;

	public Employee(String firstName, String lastName, String ssn) {
		super(firstName, lastName);
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "Employee: " + ssn;
	}
	
}

//public static string GetMaskedNumber(string number)

public void withdraw(double amt) {
	if (amt > balance)
		System.out.println("Amount exceeds balance");
	else 
		balance -= amt;


//if (String.IsNullOrEmpty(ssn)) {
//    return string.Empty;
//}
//if (ssn.Length <= 5) {
//    return ssn;
//}
//
//String last5 = ssn.Substring(ssn.Length - 5, 5);
//var maskedChars = new StringBuilder();
//for (int i = 0; i < ssn.Length - 5; i++)
//{
//    maskedChars.Append(ssn[i] == '-' ? "-" : "#");
//}
//return maskedChars + last5;
//}
//{

}
