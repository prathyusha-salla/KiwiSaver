package com.kiwi.qa.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kiwi.qa.base.Testbase;

public class Kiwisaverprojectedbalance extends Testbase {

	// Page factory -- OR:

	@FindBy(xpath = "/html/body/div/div/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/div/div/input")
	WebElement agefield;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/div")
	WebElement employment;

	@FindBy(xpath = "/html/body/div/div/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/div/span")
	WebElement selfemployment;

	@FindBy(xpath = "/html/body/div/div/div/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input")
	WebElement wages;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[4]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div/div[2]")
	WebElement membercontribution;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[5]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div/div[1]/div")
	WebElement employmentPir;
	
	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div/div[1]/div")
	WebElement otherEmpPir;

	@FindBy(xpath = "/html/body/div/div/div/div[1]/div/div[1]/div/div[5]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input")
	WebElement currentbal;

	@FindBy(xpath = "/html/body/div/div/div/div[1]/div/div[1]/div/div[6]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[1]/div/input")
	WebElement volcontri;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[9]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div/div[3]/div/label")
	WebElement riskhigh;

	@FindBy(xpath = "/html/body/div/div/div/div[1]/div/div[1]/div/div[7]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div/div[2]/div/label")
	WebElement riskmedium;

	@FindBy(xpath = "/html/body/div/div/div/div[1]/div/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input")
	WebElement savingreq;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[6]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/div/div[1]/div/span")
	WebElement fortnightly;
	
	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[1]/div/div[6]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/div/div[1]/div/span")
	WebElement annually;
	
	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[2]/button/span[2]")
	WebElement employedViewProjections;

	@FindBy(xpath = "//*[@id=\"widget\"]/div/div[1]/div/div[2]/button")
	
	WebElement otherViewProjections;
	
	// Initializing the page objects

	public Kiwisaverprojectedbalance() {
		PageFactory.initElements(driver, this);
		driver.get(prop.getProperty("kiwisaverURL"));
	}

	// Actions
	public void kiwisaverbalanceCriteriaOne() {
		// kiwisaverNavig.kiwisaverNav();

		driver.switchTo().frame(0);
		// age
		agefield.sendKeys("30");

		// Employment status
		selectValue(employment, ".//span[contains(text(), 'Employed')]");

		// Salary or wages per year
		wages.sendKeys("82000");

		// KiwiSaver member contribution
		membercontribution.click();

		// PIR
		selectValue(employmentPir, ".//span[contains(text(), '17.5%')]");

		// Risk Profile
		riskhigh.click();

		// View Projections
		employedViewProjections.click();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);

	}

	private void selectValue(WebElement e, String value) {
		e.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath(value)).click();
	}

	
	public void kiwisaverbalanceCriteriaTwo() {

		driver.switchTo().frame(0);
		// age
		agefield.sendKeys("45");

		// Employment status
		selectValue(selfemployment, ".//span[contains(text(),'Self-employed')]");

		// PIR
		selectValue(otherEmpPir, ".//span[contains(text(), '10.5%')]");

		// Current KiwiSaver Balance
		currentbal.sendKeys("100000");

		// Voluntary Contributions
		volcontri.sendKeys("90");
		
		//Frequency
		selectValue(fortnightly, ".//span[contains(text(),'Fortnightly')]");

		// Risk
		riskmedium.click();

		// Saving goal retirement
		savingreq.sendKeys("290000");

		// View Projections
		otherViewProjections.click();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
	}

	public void kiwisaverbalanceCriteriaThree() {
		// kiwisaverNavig.kiwisaverNav();

		driver.switchTo().frame(0);
		// age
		agefield.sendKeys("55");
		// Employment status
		 selectValue(selfemployment, ".//span[contains(text(), 'Not employed')]");

		// PIR
		selectValue(otherEmpPir, ".//span[contains(text(),'10.5%')]" );

		// Current KiwiSaver Balance
		currentbal.sendKeys("140000");

		// Voluntary Contributions
		volcontri.sendKeys("10");
		
		//Frequency
		selectValue(annually, ".//span[contains(text(),'Annually')]");


		// Risk
		riskmedium.click();

		// Saving goal retirement
		savingreq.sendKeys("200000");

		// View Projections
		otherViewProjections.click();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);

	}
}
