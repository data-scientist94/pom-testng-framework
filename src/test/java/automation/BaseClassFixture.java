package automation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClassFixture {
	private WebDriver driver;
	public BaseClassFixture(WebDriver driver) {
		this.driver = driver;
		manageEventBeforeTestExecution();
	}

	private void manageEventBeforeTestExecution() {
		InitiateSeleniumWait();
	}
	
	@BeforeSuite
	private void InitiateSeleniumWait() {
		System.out.println("Initate Selenium Wait Class...");
		System.out.println("Initate Take Screen Shot Class...");
	}
	

	@AfterSuite
	 void closeCurrentSession() {
		driver.close();
	}
}
