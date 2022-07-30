package com.SurveyMonkey.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SurveyMonkey.pageObjects.HomePage;
import com.SurveyMonkey.testBase.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_VerifyLoginPageDisplayed extends BaseClass {
		
	@Test
	public void loginPageTest() throws IOException {
		HomePage hp = new HomePage(driver);
		hp.clickLoginLink();
		//Capturing title
		String pageTitle = driver.getTitle();
		
		capturescreen(driver, "loginPageTest");
		
		Assert.assertEquals(pageTitle, "SurveyMonkey - Log in","Survey Monkey Login page is not displayed");

		logger.info("Survey Monkey Login page is displayed");
		logger.info("Executed successfully");
	}
}
