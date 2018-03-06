package selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GCDriver {

    private static GCDriver instance = null;
    private WebDriver 		driver;


    private GCDriver () {}

    public WebDriver openBrowser () {

        driver = new ChromeDriver();

        //driver.manage().window().maximize();
        return driver;
    }

    public static GCDriver getInstance () {
        if(instance==null) {
            instance = new GCDriver();
        }
        return instance;
    }

}
