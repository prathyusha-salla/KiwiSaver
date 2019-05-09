package com.kiwi.qa.page;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kiwi.qa.base.Testbase;

public class KiwisaverRetirementCalculator extends Testbase {

	// Page factory -- OR:

	@FindBy(xpath = "/html/body/div/div/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/div/div/input")
	WebElement field;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/button/i")
	WebElement i;

	// Initializing the page objects

	public KiwisaverRetirementCalculator() {
		PageFactory.initElements(driver, this);
		driver.get(prop.getProperty("kiwisaverURL"));
	}

	// Actions
	public void kiwisaver() {

		driver.switchTo().frame(0);
		field.sendKeys("30");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		try {
			if (i.isDisplayed()) {
				i.click();
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
	}

}
