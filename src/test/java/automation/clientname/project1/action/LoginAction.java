package automation.clientname.project1.action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import automation.pageobject.GetPage;

import java.util.Set;

public class LoginAction extends GetPage {
	
	public LoginAction(WebDriver driver, String class_name) {
		super(driver, class_name);
	}

	public void loginWithValidCredential() {
		element("google_search_textfield").sendKeys(Keys.ENTER);
	}

	public void clickOnLoginButton() {
		element("zebpay_login_button").click();
	}

	public void clickOnSignUpBtton() {
		element("zebpay_signup_button").click();
	}

	public void enterMobileNumber(String mobileNumber) {
		element("zebpay_mobileNo_textfield").sendKeys(mobileNumber);
	}

	public void userFirstName(String firstName) {
		element("zebpay_firstName_textfield").sendKeys(firstName);
	}

	public void userLastName(String lastName) {
		element("zebpay_lastName_textfield").sendKeys(lastName);
	}

	public void userEmailTextField(String email) {
		element("zebpay_email_textfield").sendKeys(email);
	}

	public void pinTextField(String requestMethod) {
		element("zebpay_pin_textfield").sendKeys(requestMethod);
	}

	public void confirmPinTextField(String requestMethod) {
		element("zebpay_confirmpin_textfield").sendKeys(requestMethod);
	}

	public void referralCode(String requestMethod) {
		element("zebpay_referralcode_textfield").sendKeys(requestMethod);
	}

	public void isAcceptedTermsConditionCheckBox() {
		element("zebpay_isAcceptedTermsCondition_checkbox").click();
	}

	public void iAmNotRobotCheckBox() {
		element("zebpay_imnotrebot_checkbox").click();
	}


	public void zebpaysignButton() {
		element("zebpay_sigup_button").click();
	}

	public void switchToNewTab(WebDriver driver) {
		String parent = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String actual : handles) {
			if (!actual.equalsIgnoreCase(parent)) {
				driver.switchTo().window(actual);
			}
		}
	}
}
