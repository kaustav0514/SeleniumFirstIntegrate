package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCartPage {
	
	public WebDriver driver;
	
	public AddCartPage(WebDriver driver) {
		this.driver = driver;
	}

	By carticon = By.xpath("//*[@class='cart-icon']");
	By prcdtocheckbtn=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");

	
	public WebElement carticn() {
		
		return driver.findElement(carticon);
		
	}
	
	public WebElement prcdtocheck() {
		
		return driver.findElement(prcdtocheckbtn);
		
	}
	


}
