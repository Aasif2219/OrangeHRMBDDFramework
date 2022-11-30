package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;
   
@CucumberOptions(features ="src/test/resources/features/DemoFeature.feature",glue = "StepDefinition",plugin = {"pretty","html:target/cucumberReport.html"} )

public class DemoTestRunner extends AbstractTestNGCucumberTests {
	TestNGCucumberRunner testNGCucumberRunner=new TestNGCucumberRunner(this.getClass());

}
