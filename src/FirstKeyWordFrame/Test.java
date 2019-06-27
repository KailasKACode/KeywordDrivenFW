package FirstKeyWordFrame;

import org.openqa.selenium.WebDriver;

public class Test {
	public static void main(String[] args) {
		WebDriver driver=null;
		KeywordWithoutStatic k=new KeywordWithoutStatic(driver);
		k.selectBrowser("chrome");
		k.openUrl("https://fb.com");
		k.maxiMizeWindow();
		k.deleteAllCookies();
	
		
	}
}
