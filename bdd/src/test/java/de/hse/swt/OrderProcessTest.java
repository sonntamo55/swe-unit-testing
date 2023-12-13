package de.hse.swt;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.tngtech.jgiven.junit.ScenarioTest;

public class OrderProcessTest extends ScenarioTest<GivenSomeState, WhenSomeAction, ThenSomeOutcome> {

	private static WebDriver webDriver = null;
	
	public static void setDriver(WebDriver driver) {
		webDriver = driver;
	}
	
	public static WebDriver getDriver() {
		return webDriver;
	}
	
	@BeforeClass
	public static void setup() {
		//System.setProperty("webdriver.chrome.driver", "/Users/msonntag/Downloads/chromedriver-mac-arm64/chromedriver"); 
		ChromeOptions chromeOptions = new ChromeOptions();
    	chromeOptions.addArguments("--start-maximized");
    	chromeOptions.addArguments("--remote-allow-origins=*");
		webDriver = new ChromeDriver(chromeOptions);
//		System.setProperty("webdriver.gecko.driver", "C:\\Programme Self\\geckodriver.exe");
//		webDriver = new FirefoxDriver();
		
	}
	
	@AfterClass
	public static void tearDown() {
		webDriver.close();
	}
	
	@Test
	public final void testSubmitOrder() {
		given().order_app_is_called();
        when().a_valid_user_is_entered();
        when().an_article_is_selected();
        when().the_form_is_submitted();
        then().the_articles_are_ordered();
		
	}

}
