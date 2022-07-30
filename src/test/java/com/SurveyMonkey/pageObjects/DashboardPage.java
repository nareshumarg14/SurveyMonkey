package com.SurveyMonkey.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	//1
	public WebDriver driver;
		
	//2. Create Constructor
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locator for Dashboard Link
	@FindBy(linkText="Dashboard")
	WebElement lnkDashboard;
	
	public boolean dashboardLinkStatus() {
		boolean status = lnkDashboard.isDisplayed();
		System.out.println(status);
		return status;
	}
}
