package StepDefenitions;

import java.io.IOException;

import BaseClass.BaseClass;
import Pages.WebTours_HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginTestStepDefenition extends BaseClass {

	// Create Page References
	WebTours_HomePage homePage;

	// Constructor
	public LoginTestStepDefenition() {
		super();
	}

	@Given("User is on WebTours HomePage")
	public void user_is_on_web_tours_home_page() throws IOException {
		System.out.println("***** Application is Launched ******");
		//launchWebTours();
		homePage = new WebTours_HomePage();
	}

	@And("User enters uname and pwd and clicks on Login")
	public void user_enters_uname_and_pwd_and_clicks_on_login() {
		homePage.login("jojo", "bean");
	}

	@Then("Verify user is logged in")
	public void verify_user_is_logged_in() {
		String res = homePage.loginStaus();
		System.out.println(res);
		closeApplication();

	}

}
