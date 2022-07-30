package com.SurveyMonkey.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//1
	public WebDriver driver;
	
	//2. Create Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//3. Locators
	@FindBy(linkText="Log in")
	WebElement lnkLogin;
	
	@FindBy(linkText="Sign up free")
	WebElement lnkSignupfree;
	
	//4. Click on Login link.
	public void clickLoginLink() {
		lnkLogin.click();
		System.out.println("Clicked on Log In link");
	}
	
	//5. Sign up free link status.
	public boolean signUpFreeLinkStatus() {
		boolean status = lnkSignupfree.isDisplayed();
		System.out.println(status);
		return status;
	}
	

}
