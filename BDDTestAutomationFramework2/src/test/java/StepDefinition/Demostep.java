package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static webdriverUtility.webDriverUtils.*;
import static variables.globalVariables.*;

public class Demostep {

	@Then("I verify that the logo present on page")
	public void i_verify_that_the_logo_present_on_page() {
		Boolean status =cdriver.findElement(By.xpath("//div[@class='orangehrm-login-slot-wrapper']")).isDisplayed();
		System.out.println(status);
	}



}
