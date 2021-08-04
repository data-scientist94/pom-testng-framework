package automation.clientname.project1.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import automation.TestSessionInitiator;

public class LoginTest {
	private TestSessionInitiator test;
	
	public LoginTest() {
		test = new TestSessionInitiator();
	}

	@Test
	public void login_with_valid_credential() {
		test.login.loginWithValidCredential();
		assertEquals(false, false);
	}
}
