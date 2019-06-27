package TestCases.RegressionTest;

import java.io.IOException;

import org.testng.annotations.Test;

import FirstKeyWordFrame.GetFileProperties;
import FirstKeyWordFrame.Keyword;
public class TestAutomate {
	
	@Test
	public static void m1() throws IOException {
		Keyword.selectBrowser("chrome");
		Keyword.openUrl("https://testautomationpractice.blogspot.com/");
		Keyword.maxiMizeWindow();
		Keyword.doubleClick("XPATH", GetFileProperties.getProperty("doubleclick"));

	}
		
	

}
