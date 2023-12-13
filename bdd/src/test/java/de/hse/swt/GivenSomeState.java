package de.hse.swt;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.tngtech.jgiven.Stage;

public class GivenSomeState extends Stage<GivenSomeState> {
	
    public GivenSomeState order_app_is_called() {

    	WebDriver driver = OrderProcessTest.getDriver();

		// Launch Website
		driver.navigate().to("http://localhost/orderprocess");
        // driver.navigate().to("https://www.google.com");
        return self();
    }
}