/**
 * Project name: Test automation Framework
 * Author : Pankaj Devgade
 * Client: Shashank
 * Organisation: testing Shastra
 * 
 */
package FirstKeyWordFrame;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hwpf.usermodel.DateAndTime;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.implementation.bind.annotation.Super;

public class Keyword {

	private static final TakesScreenshot Driver = null;

	/**
	 * Its open specified browser.
	 * 
	 * @param BrowserName : Browsers should be include the 'chrome', firefox and IE.
	 *                    No browsers will accept apart listed above
	 * @return void
	 */
	public static void selectBrowser(String BrowserName) {
		switch (BrowserName) {
		case "chrome":
			Constant.driver = new ChromeDriver();
			break;
		case "firefox":
			Constant.driver = new FirefoxDriver();
			break;
		case "IE":
			Constant.driver = new InternetExplorerDriver();
		default:
			System.err.println("Invalid browsers:");
			break;
		}

	}

	/**
	 * Delete all cookies from the open browser:
	 * 
	 * @return: void
	 */
	public static void deleteAllCookies() {
		Constant.driver.manage().deleteAllCookies();
		System.out.println("Cookies are deleted: ");
	}

	public static void maxiMizeWindow() {
		Constant.driver.manage().window().maximize();
	}

	/**
	 * Its open the specified Url recently opened browser by Driver instance
	 * 
	 * @param Url({@code String}) to open
	 * @return void
	 */
	public static void openUrl(String Url) {
		Constant.driver.get(Url);
		System.out.println("Please wait loading url....");

	}

	private static WebElement getWebElement(String LocatorType, String locatorValue) {
		WebElement elements = null;
		switch (LocatorType) {
		case "XPATH":
			elements = Constant.driver.findElement(By.xpath(locatorValue));
			break;
		case "CSS":
			elements = Constant.driver.findElement(By.cssSelector(locatorValue));
			break;
		case "ID":
			elements = Constant.driver.findElement(By.id(locatorValue));
			break;
		case "LINK_TEXT":
			elements = Constant.driver.findElement(By.linkText(locatorValue));
			break;
		case "PARTIAL_LINK_TEXT":
			elements = Constant.driver.findElement(By.partialLinkText(locatorValue));
			break;
		case "CLASS_NAME":
			elements = Constant.driver.findElement(By.className(locatorValue));
			break;

		default:
			System.err.println("Invalid Selector: " + LocatorType
					+ "Expected: XPATH,ID,CLASS_NAME,LINK_TEXT,CLASS_NAME,PARTIAL_LINK_TEXT ");
			break;
		}
		return elements;

	}

	/**
	 * 
	 * @param LocatorType :It should be accept the listed locatorType.
	 * @param             locatorValue: It is the Xpath or the Locator value should
	 *                    be listed
	 * @param             textToEnter: Which type the data should be enter in the
	 *                    string format.
	 */
	public static void enterText(String LocatorType, String locatorValue, String textToEnter) {
		getWebElement(LocatorType, locatorValue).sendKeys(textToEnter);
	}

	/**
	 * It will be click on the entered the given web-elements.
	 * 
	 * @param LocatorType:This will locator
	 * @param locatorValue: pass the value which element need to click
	 * @return void
	 */
	public static void clickOnElements(String LocatorType, String locatorValue) {
		getWebElement(LocatorType, locatorValue).click();

	}

	public static void selectFromDropDownList(String LocatorType, String locatorValue, String textToEnter) {
		WebElement elemets = getWebElement(LocatorType, locatorValue);
		Select select = new Select(elemets);
		select.selectByVisibleText(textToEnter);

	}

	/**
	 * It will be double-click on the perticular WebElement
	 * 
	 * @param LocatorType
	 * @param locatorValue
	 */
	public static void doubleClick(String LocatorType, String locatorValue) {
		Actions action = new Actions(Constant.driver);
		WebElement elements = getWebElement(LocatorType, locatorValue);
		action.doubleClick(elements);
		action.build().perform();

	}

	/**
	 * It will switch the new frame Need to enter the frame index value starting @0
	 * Position
	 * 
	 * @param i
	 */
	public static void doIFrameSwitch(int i) {
		Constant.driver.switchTo().frame(i);
		System.out.println("Switched on frame: " + i);
	}

	/***
	 * It will switch the default frame.(Original fram).
	 * 
	 * @return void
	 */
	public static void doDefultIFrame() {
		Constant.driver.switchTo().defaultContent();
	}
	
	
	public static String DateAndTime() {
		String DateAndTime=new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());
		return DateAndTime;
		
	}
	
	public static void takeSimpleScreenshot() throws IOException {
		File src=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		File des=new File("E:\\goal\\Study Material\\AllScreenShot\\"+DateAndTime()+".png");
		FileUtils.copyFile(src, des);
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			System.err.println("File not found");
		}
		
	}

}
