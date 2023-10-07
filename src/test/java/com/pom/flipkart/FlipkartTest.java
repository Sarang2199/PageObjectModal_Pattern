package com.pom.flipkart;
import org.testng.annotations.Test;
import com.pom.utility.BaseSetup;



public class FlipkartTest extends BaseSetup{

	
	
    
	
	@Test
	public void homePageTest() throws InterruptedException {
		HomePage hmpage = new HomePage(driver);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		hmpage.closeloginwindow(); 
		hmpage.searchBoxValidation();
		Thread.sleep(4000); 
		hmpage.helpdropdownValidation();
	}

}
