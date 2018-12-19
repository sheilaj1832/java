
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String buzz = "buzz";
		String fizz = "fizz"; // Initialize the string variables
		for (int i = 1; i <= 100; i++) {
			if (i % 15 == 0) // check if number in position i is divisible by 15, if so don't check other 2
								// conditions - we don't want a double print
			{
				System.out.println(buzz + fizz + " " + i);
			} else if (i % 3 == 0) {
				System.out.println(buzz + " " + i);
			} else if (i % 5 == 0) {
				System.out.println(fizz + " " + i);
			} else
				System.out.println(i);
		}
	}
}
