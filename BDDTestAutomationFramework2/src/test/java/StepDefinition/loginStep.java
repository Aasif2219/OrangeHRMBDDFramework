package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static variables.globalVariables.*;

public class loginStep {
	
	@When("user enters valid {string} and {string}")
	public void user_enters_valid_username_and_password(String username, String password) {
		cdriver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		cdriver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
     
	}

	@When("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
     cdriver.findElement(By.xpath("//button[@type='submit']")).click();
     Thread.sleep(4000);
	}

	@Then("Verify Dashboard logo")
	public void verify_dashboard_logo() {
    boolean logo=cdriver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
    System.out.println(logo);
	}

}
