package TestCases.RegressionTest;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import FirstKeyWordFrame.GetFileProperties;
import FirstKeyWordFrame.Keyword;

public class Flipcart {
	@Test
	public void performOperation() throws IOException {
		Keyword.selectBrowser("chrome");
		Keyword.openUrl("https://www.flipkart.com");
		Keyword.maxiMizeWindow();
		Keyword.getTitle();
		String[] path = GetFileProperties.getLocator("user");
		Keyword.enterText(path[0], path[1], "7040007049");
		Keyword.enterText("XPATH", GetFileProperties.getProperty("pass"), "kailas0101");
		Keyword.clickOnElements("XPATH", GetFileProperties.getProperty("submit"));
		Keyword.usingJScriptsOperation(GetFileProperties.getProperty("clickOnLogout"));

	}
}
