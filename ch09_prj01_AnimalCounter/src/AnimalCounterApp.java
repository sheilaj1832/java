
public class AnimalCounterApp {

	public static void main(String[] args) {
		
		System.out.println("Counting alligators...");
		System.out.println();
		Alligator a = new Alligator();
		count(a, 3);

		System.out.println("\nCounting sheep...");
		System.out.println();
		
		Sheep s1 = new Sheep("Blackie");
		count(s1, 2);
		System.out.println();
		Sheep s2 = null;
		
		try {
			s2 = (Sheep) s1.clone();
		} 
			catch (CloneNotSupportedException ex) {
			System.out.println(ex);
		}
		
		s2.setName("Dolly");
		count(s2, 3);
		System.out.println();
		count(s1, 1);
	}
	
	public static void count (Countable c, int maxCount) {				
			while (maxCount >0) {
				maxCount--; 
				c.incrementCount();
				System.out.println(c.getCountString());
			}
			
			c.resetCount();
	}
	
}
