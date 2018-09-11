
public class ToStringDemoApp {

	public static void main(String[] args) {
		System.out.println("ToStringDemoApp says what's up???");

		Toy t1 = new Toy(0, "stuffy", 10);
		
		System.out.println("+t1: "+t1);
		System.out.println("t1 toString(): " +t1.toString());
		
		System.out.println("t1 fields: "+t1.getId()+ ", "+t1.getCode()+", "+t1.getPrice());
		
		System.out.println("bye");
	}
}
