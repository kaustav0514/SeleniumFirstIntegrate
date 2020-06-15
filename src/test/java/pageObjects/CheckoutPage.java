package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
	
	public WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	
	By prdctdetails = By.xpath("//p[@class='product-name']");
	
	public WebElement prdctdetails() {
		
		
		return driver.findElement(prdctdetails);
		
	}
	
	

}
