package de.hse.swt;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

import com.tngtech.jgiven.Stage;

public class WhenSomeAction extends Stage<WhenSomeAction> {
    
	public WhenSomeAction a_valid_user_is_entered() {
    	WebDriver driver = OrderProcessTest.getDriver();
    	
    	// enter valid user
    	driver.findElement(By.id("vorname")).sendKeys("Mirko");
    	driver.findElement(By.id("nachname")).sendKeys("Sonntag");
    	
        return self();
    }
	
	public WhenSomeAction an_article_is_selected() {
    	WebDriver driver = OrderProcessTest.getDriver();
    	
    	driver.findElement(By.id("art1")).click();
    	driver.findElement(By.id("anzahl")).sendKeys("5");

    	
        return self();
    }
	
	public WhenSomeAction the_form_is_submitted() {
    	WebDriver driver = OrderProcessTest.getDriver();
    	
    	
    	driver.findElement(By.id("submit")).click();

    	
        return self();
    }

}