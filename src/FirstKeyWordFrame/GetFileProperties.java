package FirstKeyWordFrame;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetFileProperties {
	public static FileInputStream fis;

	/**
	 * It need to set the path for the Locater type(Xpath,CSS,ID,LINK etc.) and
	 * Locator value(value of X-path)
	 * 
	 * @param path ({@code String will return the path})
	 */
	public static String getProperty(String key) throws IOException {
		String value = null;
		try {
			fis = new FileInputStream("E:\\Newjava\\KDD\\Input\\ObjectRepository.properties");
			Properties pro = new Properties();
			pro.load(fis);
			value = pro.getProperty(key);
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		}

		return value;
	}
	
	public static String getProperty(String key,String path) throws IOException {
		String value = null;
		try {
			fis = new FileInputStream(path);
			Properties pro = new Properties();
			pro.load(fis);
			value = pro.getProperty(key);
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		}

		return value;
	}
	
	public static String[] getLocator(String key) {
		String [] values=null;
		try {
			FileInputStream fis=new FileInputStream("E:\\Newjava\\KDD\\Input\\ObjectRepository.properties");
			Properties prop=new Properties();
			prop.load(fis);
			String part=prop.getProperty(key);
			values=part.split(":");
			System.out.println("Locator type "+values[0]);
			System.out.println("Locator value "+values[1]);

			
		} catch (FileNotFoundException e) {
		System.err.println("File not found");
		} catch (IOException e) {

			System.err.println("File data not loaded");		}
		
		return values;
	}
	public static void main(String[] args) {
		getLocator("FirstName");
	}

}
