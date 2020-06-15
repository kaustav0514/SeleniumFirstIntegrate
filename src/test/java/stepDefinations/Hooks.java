package stepDefinations;

import io.cucumber.java.After;
import utils.Base;

public class Hooks extends Base{
	
	@After()
	public void closebrowser() {
		driver.close();
		
		
	}

}
