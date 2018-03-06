package frameworkhealthtests;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import selenium.GCDriver;

public class OpenBrowser {
	private GCDriver	automation = GCDriver.getInstance();
	private WebDriver 	driver;
	
	
	
	@Test
	void test() {
		driver = automation.openBrowser();
		driver.get("http://my-lab-drop.telecomputing.com/");
		
		//fail("Not yet implemented");
	}

}
