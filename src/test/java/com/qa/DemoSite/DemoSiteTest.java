package com.qa.DemoSite;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class DemoSiteTest {

WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	
	@Test
	public void testRegisterLogin() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("http://thedemosite.co.uk/addauser.php");
		DemoSite demoSite = PageFactory.initElements(driver, DemoSite.class);
		demoSite.fillForm(Constants.USER, Constants.PASS);
		driver.get("http://thedemosite.co.uk/login.php");
		demoSite.fillForm(Constants.USER, Constants.PASS);
		Thread.sleep(1000);
	}
	
}
