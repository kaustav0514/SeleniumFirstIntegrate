package stepDefinations;


import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddCartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import utils.Base;
//import junit.framework.Assert;

public class Step {
	
	public WebDriver driver;
	public HomePage hp;
	public AddCartPage acp;
	public CheckoutPage cp;
	
	@Before()
	public void start() throws IOException {
		driver = Base.getDriver();
		hp= new HomePage(driver);
		acp = new AddCartPage(driver);
		cp = new CheckoutPage(driver);
	}
	
	@Given("User is on GreenCart Landing page")
	public void user_is_on_GreenCart_Landing_page() throws InterruptedException, IOException {
//		driver = Base.getDriver();
		driver.manage().window().maximize();
	}

	@When("User serch for {string} vegetable")
	public void user_serch_for_vegetable(String string) {

//		hp= new HomePage(driver);
		hp.getSearch().sendKeys(string);
//		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(string);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	@Then("{string} results are displayed")
	public void results_are_displayed(String string) {
		
	String text = hp.validSearch().getText();
		 Assert.assertTrue(text.contains(string));
		
	}
	
	@Then("Added items to cart")
	public void added_items_to_cart() throws InterruptedException {
		//*[@class='increment']
		hp.incremnt().click();
		Thread.sleep(1000);
		
		hp.addtocart().click();
		Thread.sleep(3000);
		
	}

	@Then("User Proceed to check out page")
	public void user_Proceed_to_check_out_page() throws InterruptedException {
//		acp = new AddCartPage(driver);
		acp.carticn().click();
		Thread.sleep(4000);
		acp.prcdtocheck().click();
		Thread.sleep(4000);
	}

	@Then("Verify selected {string} items are displayed in Checkout page")
	public void verify_selected_items_are_displayed_in_Checkout_page(String string) {
//		cp = new CheckoutPage(driver);
		String text = cp.prdctdetails().getText();
		Assert.assertTrue(text.contains(string));
		
	}
	

	

}
