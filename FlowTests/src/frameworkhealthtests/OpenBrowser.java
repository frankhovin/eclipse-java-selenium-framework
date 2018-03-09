package frameworkhealthtests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import selenium.GCDriver;
import authentication.SiteLogin.AuthWindow;;

public class OpenBrowser {
	private GCDriver	automation = GCDriver.getInstance();
	private WebDriver 	driver;
	
	
	
	@Test
	void test() throws InterruptedException {
		driver = automation.openBrowser();
		driver.get("http://my-lab-drop2.telecomputing.com/");
		
		AuthWindow.loginUser("");
		
		//fail("Not yet implemented");
	}

}
