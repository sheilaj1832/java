
public class Grade {

	private int number;       // creates number instance variable

	public Grade() {
		super();             //empty constructor
		number = 0;
	}

	public Grade(int number) {
		super();
		this.number = number;
	}	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	//  convert the number to a letter grade.
	public String getLetter () {
		String letterGrade = "";

				if (number >= 88) {
					letterGrade = "A";
				}
				else if (number  >=80) {
					letterGrade = "B";
				}
				else if (number >= 67) {
					letterGrade = "C";
				}
				else if (number >=60) {
					letterGrade = "D";
					}
				else  {
					letterGrade = "F";
				}
				return letterGrade;

	}
}
