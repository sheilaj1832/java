
public class StringDemoApp {

	public static void main(String[] args) {
		String code = "java";
		System.out.println("size is "+code.length());
		
		String name = "Mr. Freddy Mercury";
		//index of the occurence of the space
		int n1 = name.indexOf(" ");
		int n2 = name.indexOf(" ", n1+1);
		System.out.println(n1 + " " + n2);
		
		int n3 = name.indexOf("Fred");
		System.out.println(n3);
		String n4 = "Sean Blessing                ";
		System.out.println(n4.trim() + "!!!!");
		
		//project ch 08 prj 02 - hiding copy
		String n5 = "John Hamm";
		String n5ln = n5.substring(5);
		System.out.println(n5ln);
		
		// selects a string that starts at the string index and ends before the last number
		String n6 = "Martin Van Buren";
		String midName = n6.substring(7,11);
		System.out.println(midName);
		//can save this in the console app to use for future reference
		
		// selects a string that starts at the string index and ends before the last number
		String n6a = "Jon Michael Vincent";
		int i1 = n6a.indexOf(" ");
		int i2 = n6a.indexOf(" ", i1+1);
		String midNameA = n6a.substring(i1+1, i2);
		System.out.println(midNameA);
		//can save this in the console app to use for future reference
		
		String n7 = "Hello there ladies and gentlemen!!!";
		String n8 = n7.replace(" ",  "#");
		System.out.println(n8);
		
		//String []
		}

}
