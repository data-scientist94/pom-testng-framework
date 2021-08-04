package automation.clientname.project1.action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import automation.pageobject.GetPage;

public class LoginAction extends GetPage {
	
	public LoginAction(WebDriver driver, String class_name) {
		super(driver, class_name);
	}

	public void loginWithValidCredential() {
		element("google_search_textfield").sendKeys("Krishna Chauhan Thrivepass");
		element("google_search_textfield").sendKeys(Keys.ENTER);
	}
}
