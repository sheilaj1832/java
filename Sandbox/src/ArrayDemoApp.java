
public class ArrayDemoApp {

	public static void main(String[] args) {
		System.out.println("hi");
		
		double [] prices = {14.95, 44.98, 57.22, 79.11};
		double sum = 0;
//		for (int i=0; i < prices.length; i++) {
//			System.out.println(prices[i]);
//			sum += prices[i];
//			System.out.println("Subtotal = "+sum);
//		}
// or this plan using a for loop
		for (double price : prices) {
			System.out.println(price);
			System.out.println("Subtotal = "+sum);
		System.out.println("bye");	
		}
	}

