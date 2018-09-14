import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		System.out.println(numbers);
		
		System.out.println("remove '2'");
		
		//removes the number 2, not the array line 2 (which is represented by the number 3)
		numbers.remove(new Integer (2));
		
		System.out.println(numbers);

	}

}
