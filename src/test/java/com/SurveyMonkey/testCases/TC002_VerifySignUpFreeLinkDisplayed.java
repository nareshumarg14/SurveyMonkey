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

public class TC002_VerifySignUpFreeLinkDisplayed extends BaseClass{
	
	@Test
	public void verifySignUpFreeLinkDisplayedTest() throws IOException {
		HomePage hp = new HomePage(driver);
		boolean val = hp.signUpFreeLinkStatus();
		
		capturescreen(driver, "verifySignUpFreeLinkDisplayedTest");
		
		Assert.assertEquals(val, true,"Sign Up Free link is not displayed");
		logger.info("Sign Up Free link is displayed");
	}

}
