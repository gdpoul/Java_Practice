package files;

import java.io.File;

public class GetURI {
	public static void main(String[] args) {
		
		System.out.println(new File("reporter.html").toURI());
	}

}
