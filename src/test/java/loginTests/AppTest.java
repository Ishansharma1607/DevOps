package loginTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import login.App;

public class AppTest {
	@Test(description = "Valid Test")
	public void loginTest() {
		App ap = new App();
		boolean status = ap.userLogin("userdemo", "password");
		Assert.assertTrue(status,"Login Failed with valid Credential"); 
	}
	
	@Test(description = "Invalid Test")
	public void invalidLoginTest() {
		App ap = new App();
		boolean status = ap.userLogin("userdemo", "password123");
		Assert.assertFalse(status); 
	}
}
