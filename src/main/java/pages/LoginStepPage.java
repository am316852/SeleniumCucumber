package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginStepPage {

	private WebDriver driver;
	private By passwordLink = By.linkText("Forgot your password?");
	private By email = By.id("email");
	private By password = By.id("passwd");
	private By submitLogin = By.id("SubmitLogin");

	public LoginStepPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean forgetPwdlinkExists() {

		return driver.findElement(passwordLink).isDisplayed();
	}

	public void enterUsername(String username) {

		driver.findElement(email).sendKeys(username);
		;

	}

	public void enterPassword(String pwd) {

		driver.findElement(password).sendKeys(pwd);

	}

	public void doClickLogin() {

		driver.findElement(submitLogin).click();
	}

	public AccountStepPage doLogin(String uname, String pass) {
		driver.findElement(email).sendKeys(uname);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(submitLogin).click();

		return new AccountStepPage(driver);

	}

}
