import java.util.Scanner;

public class CH02_Grade_Converter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		
		while (choice.equalsIgnoreCase("y")) {
		
			System.out.println("Welcome to the Grade Converter");
			System.out.println();
			
			System.out.print("Enter numerical grade: ");
			int grade = sc.nextInt();
			
			String letterGrade = "";

				if (grade >= 88) {
					letterGrade = "A";
				}
				else if (grade  >=80) {
					letterGrade = "B";
				}
				else if (grade >= 67) {
					letterGrade = "C";
				}
				else if (grade >=60) {
					letterGrade = "D";
					}
				else if (grade <60) {
					letterGrade = "F";
					}
			System.out.println("Letter grade: " + letterGrade);
			
			System.out.print("Continue y/n? ");
			choice = sc.next();
		}
		
		sc.close();
	}

}
