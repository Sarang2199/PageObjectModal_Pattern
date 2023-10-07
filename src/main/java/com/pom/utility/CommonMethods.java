package com.pom.utility;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class CommonMethods  {

	private WebDriver driver;
	public CommonMethods(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public By getLocator(String locator) {
		return By.xpath(locator);
	}
	
	public By getLocator(String locator, String value) {
		return By.xpath(String.format(locator, value));
	}
	
	public By getLocator(String locator, String value, String value2) {
		return By.xpath(String.format(locator, value, value2));
	}
	
	public WebElement getWebElementLocator(String locator, String value) {
		return driver.findElement(By.xpath(String.format(locator, value)));
	}
	public WebElement getWebElementLocator(String locator, String value, String value2) {
		return driver.findElement(By.xpath(String.format(locator, value,value2)));
	}
	public WebElement getWebElementLocator(String locator) {
		return driver.findElement(By.xpath(String.format(locator)));
	}
	
	
	
}
