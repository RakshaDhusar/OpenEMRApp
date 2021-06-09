package com.cyient.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
import com.cyient.pages.LoginPage;
import com.cyient.pages.MainPage;

public class LoginTest extends WebDriverWrapper {
	@Test
	public void validCredentialTest() {
		
		LoginPage login=new LoginPage(driver);
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clickOnLogin();
		
		MainPage main=new MainPage(driver);
		String actualValue = main.getWelcomeText();
		Assert.assertTrue(actualValue.contains("Welcome"));
	}

	@Test	
	public void invalidCredentialTest() {

		LoginPage login=new LoginPage(driver);
		login.enterUsername("Admin123");
		login.enterPassword("admin123");
		login.clickOnLogin();
		
		String actualvalue = login.getInvalidCredentialErrorMessage();
		Assert.assertEquals(actualvalue, "Invalid credentials");
	}

}
