package com.kiwi.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.kiwi.qa.page.KiwisaverRetirementCalculator;


public class KiwisaverRetirementcaltests {
	
	KiwisaverRetirementCalculator KiwiSaver;
	
	
	@BeforeMethod
	public void setup() {
		KiwiSaver = new KiwisaverRetirementCalculator();
	 }
	
	@Test(priority=1)
	public void kiwi() {
		KiwiSaver.kiwisaver();
	}
	@Test(priority=2)
	public void testverify() {
		KiwiSaver.kiwisaver();
		String expectedMessage = "This calculator has an age limit of 64 years old as you need to be under the age of 65 to join KiwiSaver.";
	    WebElement msg = KiwiSaver.driver.findElement(By.xpath("//div[@class='field-message message-info ng-binding']//*[contains(text(),'This calculator has an age limit of 64 years old as you need to be under the age of 65 to join KiwiSaver.')]"));
	  
	  if (msg.isDisplayed()) {
		 System.out.println("Message:"+ msg.getText());
		 }
		 else {
		 System.out.println("Message is not displayed");
		 }
	Assert.assertEquals("This calculator has an age limit of 64 years old as you need to be under the age of 65 to join KiwiSaver.",expectedMessage);
	}
	
	
	@AfterMethod
	public void tearDown() {
		KiwiSaver.driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		KiwiSaver.driver.quit();
	}

}
