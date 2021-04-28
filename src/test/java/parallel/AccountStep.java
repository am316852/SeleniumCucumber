package parallel;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import driverfactory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import pages.AccountStepPage;
import pages.LoginStepPage;

public class AccountStep {

	LoginStepPage loginStepPage = new LoginStepPage(DriverFactory.getDriver());

	AccountStepPage accountStepPage;
	private static List list1;

	@Given("user has already loged in to application")
	public void user_has_already_loged_in_to_application(DataTable dataTable) {

		List<Map<String, String>> map = dataTable.asMaps(String.class, String.class);

		DriverFactory.getDriver()
				.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		String username = map.get(0).get("username");
		String password = map.get(0).get("password");

		System.out.println(username + " gggf   " + password);

		accountStepPage = loginStepPage.doLogin(username, password);

	}

	@Given("user is on accounts page")
	public void user_is_on_accounts_page() {
		String title = loginStepPage.getLoginPageTitle();
		System.out.println("Title =" + title);
	}

	@Then("user gets accounts section")
	public void user_gets_accounts_section(DataTable dataTable) {
		List list = dataTable.asList();

		list1 = accountStepPage.getAccountSection();
		list.containsAll(list1);

	}

	@Then("accounts section count should be {int}")
	public void accounts_section_count_should_be(Integer int1) {
		Assert.assertTrue(list1.size() == 6);
	}

}
