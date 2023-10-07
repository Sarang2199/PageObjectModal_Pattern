package com.pom.flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pom.utility.BaseLocators;
import com.pom.utility.CommonMethods;


public class HomePage  {

	private WebDriver driver =null;
	CommonMethods cm;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		cm = new CommonMethods(this.driver);


	}
	public void closeloginwindow() { try {
		cm.getWebElementLocator(BaseLocators.spanText,"✕").click(); }
	catch(Exception e) { e.printStackTrace(); } }

	public void searchBoxValidation() {
		WebElement inputboxE= cm.getWebElementLocator(BaseLocators.Inputname,"q");
		Assert.assertTrue(inputboxE.isDisplayed());
		String inputbox = cm.getWebElementLocator(BaseLocators.Inputname,"q").getAttribute("title");
		Assert.assertEquals(inputbox, "Search for Products, Brands and More");

	}
	public void helpdropdownValidation() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement helpdropdown = cm.getWebElementLocator(BaseLocators.linkTitle,"Dropdown with more help links");
		WebElement notificationPref = cm.getWebElementLocator(BaseLocators.linkTitle,"Notification Preferences");
		action.moveToElement(helpdropdown).build().perform();

		Assert.assertTrue(helpdropdown.isDisplayed());
		action.moveToElement(helpdropdown).perform();
		action.click(notificationPref).perform();
		Thread.sleep(4000);
	}


}
