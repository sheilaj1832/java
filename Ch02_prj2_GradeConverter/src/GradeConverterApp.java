import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Letter Grade Converter");
		Scanner sc = new Scanner(System.in);

		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter numerical grade: ");
			int numericalGrade = sc.nextInt();

			String letterGrade = "";

			// Convert the numeric grade to letter grade
			if (numericalGrade >= 88) {
				letterGrade = "A";

			} else if (numericalGrade >= 80) {
				letterGrade = "B";
			} else if (numericalGrade >= 68) {
				letterGrade = "C";
			} else if (numericalGrade >= 60) {
				letterGrade = "D";
			}
			// else without the if catches everything else that is entered
			else {
				letterGrade = "F";
			}
			System.out.println("Letter Grade: " + letterGrade);
			
			System.out.print("Continue y/n ");
			choice = sc.next();
		}
		sc.close();
		System.out.println("Bye");
	}

}
