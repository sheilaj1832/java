import java.util.Scanner;

public class ch02prj2 {

	public static void main(String[] args) {

		System.out.println("Welcome to the Letter Grade Converter");
		System.out.println();
		Scanner sc = new Scanner (System.in);
		
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


//Welcome to the Letter Grade Converter
//
//Enter numerical grade: 90
//Letter grade: A
//
//Continue? (y/n): y
//
//Enter numerical grade: 88
//Letter grade: A
//
//Continue? (y/n): y
//
//Enter numerical grade: 80
//Letter grade: B
//
//Continue? (y/n): y
//
//Enter numerical grade: 67
//Letter grade: C
//
//Continue? (y/n): y
//
//Enter numerical grade: 59
//Letter grade: F
//
//Continue? (y/n): n
