package CH11Q11;

import java.util.Arrays;

public class CH11P11 {

	public static void main(String[] args) {

		int[] values = {2, 1, 6, 5, 3};
		Arrays.sort(values);
		int index = Arrays.binarySearch(values,5);
		System.out.println(index);
	}
}
