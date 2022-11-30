package StepDefinition;

import static variables.globalVariables.cdriver;

import static webdriverUtility.webDriverUtils.getDriver;
import static implementation.AppAccess.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class baseSteps {
	
	@Given("I launch firefox browser")
	public void i_launch_firefox_browser() {
		accessApp();

	}

	@When("I open OrangeHRM home page")
	public void i_open_orange_hrm_home_page() throws InterruptedException {
		openUrl();
		Thread.sleep(4000);

	}
	
	@And("close browser")
	public void close_browser() {
		cdriver.quit();
	
	}

}
