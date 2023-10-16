package automation.ollion.project.action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import automation.pageobject.GetPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Set;

public class LoginAction extends GetPage {


	@FindBy(xpath = "//input[@name='phone']")
	WebElement phone_number;
	WebDriver driver;
	public LoginAction(WebDriver driver, String class_name) {
		super(driver, class_name);
		this.driver = driver;
	}


	public void expandIcon() {
		element("expand_icon").click();
	}

	public void clickOnUserButton() {
		element("sidenav_bar_users_option").click();
	}

	public void goSecondPageUserSection() {
		element("user_2nd_page").click();
	}

	public List<WebElement> getAllTheUserInfo() {
		return driver.findElements(getLocator("user_details"));
	}


}
