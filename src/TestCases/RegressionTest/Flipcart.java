package TestCases.RegressionTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import FirstKeyWordFrame.Keyword;
public class Flipcart {
	@Test(invocationCount=1)
	public static void performOperation() {
		Keyword.selectBrowser("chrome");
		Keyword.openUrl("https://www.flipkart.com");
		Keyword.clickOnElements("XPATH", "//button[@class='_2AkmmA _29YdH8']");
		Keyword.clickOnElements("XPATH", "//a[contains(text(),'Login & Signup')]");
		Keyword.enterText("XPATH", "//input[@class='_2zrpKA _1dBPDZ']", "7040007049");
		Keyword.enterText("XPATH", "//input[@type='password']", "kailas0101");
		Keyword.clickOnElements("XPATH", "(//button[@type='submit'])[2]");
		Keyword.maxiMizeWindow();
		
		
	}
}
