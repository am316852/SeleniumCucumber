package parallel;

import static org.junit.Assert.assertTrue;

import driverfactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.LoginStepPage;

public class LoginSteps {

	LoginStepPage loginStepPage = new LoginStepPage(DriverFactory.getDriver());
	private static String title;

	@Given("user is on login page")
	public void user_is_on_login_page() {

		DriverFactory.getDriver()
				.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

	}

	@When("user gets the title of the page")
	public void user_gets_login_page_title() {
		title = loginStepPage.getLoginPageTitle();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String pageTitle) {
		assertTrue(title.equals(pageTitle));
	}

	@Then("forget your password link should be displayed")
	public void forget_your_password_link_should_be_displayed() {
		assertTrue(loginStepPage.forgetPwdlinkExists());
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
		loginStepPage.enterUsername(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		loginStepPage.enterPassword(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		loginStepPage.doClickLogin();
	}

}
