package POM;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import FirstKeyWordFrame.Keyword;

public class Test23 {
	@Test
	public static void m1() {
		 final LoginPageFlipcart page=new LoginPageFlipcart();
		
	Keyword.selectBrowser("chrome");
	PageFactory.initElements(Keyword.driver, LoginPageFlipcart.class);
		Keyword.openUrl("https://www.flipkart.com/");
		LoginPageFlipcart.enterUserName("7040007049");
		LoginPageFlipcart.enterPassword("kailas0101");
		LoginPageFlipcart.clickLogin();
		
		
	}

}
