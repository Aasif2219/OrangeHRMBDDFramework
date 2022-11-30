package implementation;
import static variables.globalVariables.*;
import static webdriverUtility.webDriverUtils.getDriver;
public class AppAccess {
	public static void accessApp() {
		if(cdriver==null||cdriver.toString().contains("null")) {
			cdriver = getDriver();
		}
	}

	public static void openUrl() {
		cdriver.get("https://opensource-demo.orangehrmlive.com/");
	}
}
