package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	
//	basic way to write xpath  --- //tagname[@attribute='value']
//   	//input[@type='search']
	By search = By.xpath("//input[@type='search']");
	By validatesearch = By.xpath("//h4[@class='product-name']");
	By increment = By.xpath("//*[@class='increment']");
	By addcartbtn=By.xpath("//*[@class='product-action']//button");
	
	public WebElement getSearch() {
		return driver.findElement(search);
	}
	
	public WebElement validSearch() {
		return driver.findElement(validatesearch);
	}
	public WebElement incremnt() {
		return driver.findElement(increment);
	}
	public WebElement addtocart() {
		return driver.findElement(addcartbtn);
	}

}
