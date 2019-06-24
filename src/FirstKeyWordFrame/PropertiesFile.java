package FirstKeyWordFrame;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	public static String getProperty(String key) throws IOException {
		FileInputStream fis = new FileInputStream("E:\\Newjava\\KDD\\Input\\ObjectRepository.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String value = pro.getProperty(key);
		return value;

	}

}
