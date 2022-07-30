package com.SurveyMonkey.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//1
	public WebDriver driver;
		
	//2. Create Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locator for email address
	@FindBy(id="username")
	WebElement txtUsername;
	
	//Locator for Next & Login button
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement btnNextOrLogin;
	
	//Locator for Password
	@FindBy(id="password")
	WebElement txtPassword;
	
	//Entering username
	/***
	 * @author Naresh
	 * @Description This method is used to enter value in the Username field.
	 * @Date 23rd July 2022
	 * @param uname
	 */
	public void enterUsername(String uname) {
		txtUsername.clear();
		txtUsername.sendKeys(uname);
		String userName = txtUsername.getAttribute("value");
		System.out.println("Value entered in Username field is - " + userName);
	}
	
	//Entering password
	public void enterPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
		String passWord = txtPassword.getAttribute("value");
		System.out.println("Value entered in Password field is - " + passWord);
	}
	
	public void clickNextOrLoginButton(String buttonName) {
		btnNextOrLogin.click();
		
		if (buttonName.equalsIgnoreCase("next")) {
			System.out.println("Clicked on Next button");
		} else if(buttonName.equalsIgnoreCase("login")) {
			System.out.println("Clicked on Login button");
		}
	}
	
	
	
}
