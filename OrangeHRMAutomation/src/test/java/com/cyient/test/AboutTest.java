package com.cyient.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
import com.cyient.pages.LoginPage;

public class AboutTest extends WebDriverWrapper {
	
	@Test
	public void verifyCompanyNameTest()
	{
		LoginPage login=new LoginPage(driver);
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clickOnLogin();
		
		//MainPage
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("About")).click();
		String actualValue = driver.findElement(By.xpath("//p[contains(text(),'Company')]")).getText();	
		Assert.assertEquals(actualValue,"Company Name: OrangeHRM");	
	}

}
