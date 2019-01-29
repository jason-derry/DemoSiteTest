package com.qa.DemoSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoSite {

	@FindBy(name = "username")
	private WebElement user;
	
	@FindBy(name = "password")
	private WebElement pass;
	
	@FindBy(name = "FormsButton2")
	private WebElement submit;
	
	public void fillForm(String username, String password) {
		user.sendKeys(username);
		pass.sendKeys(password);
		submit.click();
	}	
	
}
