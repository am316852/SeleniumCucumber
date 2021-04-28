package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import driverfactory.DriverFactory;

public class AccountStepPage {

	private WebDriver driver;

	public AccountStepPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
	}

	private By accountSection = By.cssSelector("div#center_column span");

	public List<String> getAccountSection() {

		List<WebElement> webElements = driver.findElements(accountSection);

		ArrayList<String> list = new ArrayList();

		for (WebElement element : webElements) {

			list.add(element.getText());
		}

		return list;
	}
}