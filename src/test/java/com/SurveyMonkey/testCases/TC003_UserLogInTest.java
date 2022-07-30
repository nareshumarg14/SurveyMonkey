package com.SurveyMonkey.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SurveyMonkey.pageObjects.DashboardPage;
import com.SurveyMonkey.pageObjects.HomePage;
import com.SurveyMonkey.pageObjects.LoginPage;
import com.SurveyMonkey.testBase.BaseClass;

public class TC003_UserLogInTest extends BaseClass{
	
	@Test
	public void verifyUserLoginTest() throws InterruptedException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickLoginLink(); //Clicking on Login link
		
		//Enter Username, Password and click on Login button
		
		/*WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));*/
		
		Thread.sleep(50000);
		
		//driver.findElement(By.id("username")).sendKeys("naresh");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementByID('username').value='naresh'");
		
		LoginPage lp = new LoginPage(driver);
		
		capturescreen(driver, "verifyUserLoginTest");
		
		lp.enterUsername("tekinspireinfotech@gmail.com");
		lp.clickNextOrLoginButton("Next");
		lp.enterPassword("nareshtraining");
		lp.clickNextOrLoginButton("Login");
		
		//Check if user has logged in.
		DashboardPage dp = new DashboardPage(driver);
		boolean val = dp.dashboardLinkStatus();
		Assert.assertEquals(val, true, "User did not logged into application successfully");
		System.out.println("User has logged into application successfully");
	}

}
