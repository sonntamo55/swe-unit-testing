package de.hse.swt;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

import com.tngtech.jgiven.Stage;

public class ThenSomeOutcome extends Stage<ThenSomeOutcome> {
    public ThenSomeOutcome the_articles_are_ordered() {
    	WebDriver driver = OrderProcessTest.getDriver();
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	//driver.findElement(ByXPath.xpath("//*[@class='gsc-result-info']"));
    	
    	
    	assertEquals("Bestellung erfolgreich", driver.findElement(By.id("status")).getText());
    	
    	
    	
        return self();
    } 
}