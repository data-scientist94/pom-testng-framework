package automation.clientname.project1.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import automation.TestSessionInitiator;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class LoginTest {
	private TestSessionInitiator test;
	
	public LoginTest() {
		test = new TestSessionInitiator();
	}

	@Test
	public void SignUp_with_valid_credential() throws InterruptedException {
		test.login.clickOnSignUpBtton();
		test.driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);
		test.login.switchToNewTab(test.driver);
		test.login.enterMobileNumber("9650434495");
		test.login.userFirstName("Krishna"); 
		test.login.userLastName("Chauhan"); 
		test.login.userEmailTextField("KrishnaChauhan1994@gmail.com"); 
		test.login.pinTextField("10070"); 
		test.login.confirmPinTextField("10070"); 
		test.login.referralCode("10000"); 
		test.login.isAcceptedTermsConditionCheckBox(); 
		test.login.iAmNotRobotCheckBox(); 
		test.login.zebpaysignButton(); 


		assertEquals(false, false);
	}
}
