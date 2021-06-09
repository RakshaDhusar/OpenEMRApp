package com.cyient.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private By usernameLocator = By.id("txtUsername");
	private By passwordLocator = By.id("txtPassword");
	private By loginLocator = By.id("btnLogin");
	private By forgotPasswordLocator = By.partialLinkText("password");
	private By invalidCredentialLocator = By.xpath("//span[contains(text(),'Invalid')]");

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String username) {
		driver.findElement(usernameLocator).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordLocator).sendKeys(password);
	}

	public void clickOnLogin() {
		driver.findElement(loginLocator).click();
	}

	public void clickOnForgotYourPassword() {
		driver.findElement(forgotPasswordLocator).click();
	}

	public String getInvalidCredentialErrorMessage() {
		return driver.findElement(invalidCredentialLocator).getText();
	}
}
