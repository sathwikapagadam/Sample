package Browser;

import java.io.FileReader;
import java.util.Properties;

public class Utility {
	
	/*
	 *   Reads data from properties file and returns data 
	 */
	public static String properties(String data) throws Exception {  
		String propertiesData = null;
		try {
			String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\Configure.properties";
			FileReader reader = new FileReader(filePath);
			Properties p = new Properties();
			p.load(reader);
			propertiesData = p.getProperty(data);   
		} catch (Exception e) {
			System.out.println("Properties : " + e);
		}
		return propertiesData;   
	}

}
