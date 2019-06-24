package TestCases.RegressionTest;

import java.io.IOException;

import org.testng.annotations.Test;

import FirstKeyWordFrame.Keyword;

public class Regression {
	@Test
	public static void test_01() {
		Keyword.selectBrowser("chrome");
		Keyword.openUrl("https://testautomationpractice.blogspot.com/");
		Keyword.maxiMizeWindow();
		Keyword.deleteAllCookies();
		Keyword.doubleClick("XPATH", "//button[@ondblclick='myFunction1()']");
		// Keyword.doIFrameSwitch(1);
		Keyword.enterText("id", "RESULT_TextField-1", "tESTING");
		try {
			Keyword.takeSimpleScreenshot();
		} catch (IOException e) {
			System.out.println("ScreenSHot not taken");
		}

	}

}
