package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class WebTours_HomePage extends BaseClass {

	// Define WebElements|Locators

	@FindBy(xpath = "//input[@name='username']")
	private WebElement Uname;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement Pwd;

	@FindBy(xpath = "//input[@name='login']")
	private WebElement loginBtn;

	@FindBy(xpath = "//blockquote")
	private WebElement loginMessage;

	@FindBy(xpath = "//a[normalize-space()='sign up now']")
	private WebElement signUpNow;

	// Define Constructor

	public WebTours_HomePage() {
		PageFactory.initElements(driver, this);

	}

	// Define Methods

	// Validate Title
	public String homePageTitle() {
		return driver.getTitle();
	}

	// Login Functionality
	public void login(String username, String password) {

		// Provide utility to switch frames

		driver.switchTo().frame("body");
		driver.switchTo().frame("navbar");

		Uname.sendKeys(username);

		Pwd.sendKeys(password);

		loginBtn.click();

		// driver.switchTo().frame("info");

		// String loginStatus = loginMessage.getText();
		// return loginStatus;

	}

	public String loginStaus() {

		driver.switchTo().parentFrame();

		driver.switchTo().frame("info");

		String loginStatus = loginMessage.getText();
		return loginStatus;
	}

}
