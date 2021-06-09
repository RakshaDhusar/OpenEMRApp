package com.cyient.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
	private By welcomeLocator=By.id("welcome");

	private WebDriver driver;
	
	public MainPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String getWelcomeText()
	{
		return driver.findElement(welcomeLocator).getText().trim();
	}
}
