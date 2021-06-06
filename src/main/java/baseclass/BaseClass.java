package baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {

	
	static FileInputStream fis;
	static File file;
	static Properties prop;

	@SuppressWarnings("unused")
	private static void initializeProp(String filePath) {

		try {
			fis = new FileInputStream(new File(filePath));
			prop = new Properties();

			prop.load(fis);

		} catch (FileNotFoundException e) {
			System.out.println("FIleNotFound Exception found in initializeProp method");
		} catch (IOException e) {
			System.out.println("IOException found in initializeProp method");
		}
	}
	
	public static String readPropertyValue(String propKey) {
		
		return prop.getProperty(propKey);
		
	}
}
