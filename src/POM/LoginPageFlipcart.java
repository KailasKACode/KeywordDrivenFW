package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import FirstKeyWordFrame.Keyword;

public class LoginPageFlipcart {

	@FindBy(xpath= "//input[@class='_2zrpKA _1dBPDZ']")
	static WebElement username;

	@FindBy(xpath= "//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	static WebElement password;

	@FindBy(xpath= "//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	static WebElement submit;

	public static void enterUserName(String usrname) {
		username.sendKeys(usrname);
	}

	public static void enterPassword(String pass) {
		password.sendKeys(pass);

	}

	public static void clickLogin() {
		submit.click();

	}

}
