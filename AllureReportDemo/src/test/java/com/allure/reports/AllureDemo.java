package com.allure.reports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class AllureDemo {
	
	static WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", ".//chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
	}
		@Test(description="This test case helps me validiting the title of the page")
		@Description("This test case helps me validiting the title of the page")
		@Severity(SeverityLevel.NORMAL)
		@Story("[TRELLO-8] This story check basic element of the web page")
		@Feature("Validate Title")
		public void validateTitle(){
		
			Assert.assertEquals(getPageTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
			
		}
		
		@Test
		@Description("This test case helps me validiting sign in link of the page")
		@Severity(SeverityLevel.BLOCKER)
		@Story("[TRELLO-8995] This story check basic element of the web page")
		@Feature("Sign In Link")
		public void validateSignInLink(){
			WebElement signInLink=driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"));
			Assert.assertTrue(isElementAndTextPresent(signInLink,"Hello, Sign in"), "Sign In Link was not present");
			
		}
		
		@Step("Validiting if element {0} is displyed on the page with text {1}")
		public boolean isElementAndTextPresent(WebElement element, String value ){
			return element.isDisplayed() && element.getText().equalsIgnoreCase(value);
		}
		  

		@Step("Fetching the title of the page")
		public String getPageTitle(){
			return driver.getTitle();
		}
		
		
		@AfterTest
		public void tearDown(){
			driver.quit();
		}
		

	}
