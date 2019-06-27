package TestCases.RegressionTest;

import java.io.IOException;

import org.testng.annotations.Test;

import FirstKeyWordFrame.GetFileProperties;
import FirstKeyWordFrame.Keyword;

public class UnionBank {
	@Test
	public static void test_01() throws IOException, InterruptedException {
		Keyword.selectBrowser("chrome");
		Keyword.openUrl("https://icmt.unionbankofindia.co.in/account/");
		Keyword.maxiMizeWindow();
		Keyword.enterText("XPATH", GetFileProperties.getProperty("FirstName"), "Ramlal");
		Keyword.enterText("XPATH", GetFileProperties.getProperty("FatherName"), "Kisan");
		Keyword.enterText("XPATH", GetFileProperties.getProperty("MotherName"), "TaraBai");
		Keyword.takeScreenshotOfElement("XPATH", GetFileProperties.getProperty("FatherName"));
		Keyword.takeCurrentPageScreenShot();
		Keyword.takefullpageScreenshot();
		Keyword.clickOnElements("XPAT", GetFileProperties.getProperty("Toclick"));
		Keyword.closeBrowser();

	}

}
