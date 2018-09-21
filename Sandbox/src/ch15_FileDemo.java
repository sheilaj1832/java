import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ch15_FileDemo {

	public static void main(String[] args) {
		System.out.println("Hello!");
		String dirString = "c:/test/test2"; //absolute path name
		String dirString2 = "products.txt"; //relative path name
		Path dirPath = Paths.get(dirString);
		Path dirPath2 = Paths.get(dirString2);
		if (Files.notExists(dirPath)) {
			try {
				Files.createDirectories(dirPath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Bye");
		}
		
	}

}
