package automation;

import org.openqa.selenium.WebDriver;

import automation.clientname.project1.action.LoginAction;
import automation.utils.SeleniumWait;
import automation.utils.TakeScreenShot;

public class TestSessionInitiator extends BaseClassFixture{
	
	private static WebDriver driver = WebDriverFactor.getDriver();
	public LoginAction login;
	SeleniumWait wait;
	TakeScreenShot takeScreenShot;
	
	public TestSessionInitiator() {
		super(driver);
		LaunchApplication();
	}

	private void LaunchApplication() {
		InitActionCls();
		InitUtilCls();
		LaunchWebSiteWithValidConfig();
	}

	private void InitUtilCls() {
	}

	private void LaunchWebSiteWithValidConfig() {
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.google.com/");
	}

	private void InitActionCls() {
		login = new LoginAction(driver, "login");
	}
	
	
}
