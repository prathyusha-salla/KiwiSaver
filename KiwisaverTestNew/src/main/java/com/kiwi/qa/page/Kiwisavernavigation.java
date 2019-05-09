package com.kiwi.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kiwi.qa.base.Testbase;

public class Kiwisavernavigation extends Testbase {

	// Page factory -- OR:
	@FindBy(xpath = "//*[@id=\"ubermenu-section-link-kiwisaver-ps\"]")
	WebElement Kiwi;

	@FindBy(xpath = "//*[@id=\"sidenav-responsive-children-title-4825-ps\"]")
	WebElement KiwiRetire;

	@FindBy(xpath = "/html/body/div[2]/main/div/div/article/div[2]/div/section/p[4]/a")
	WebElement calbutton;

	// Initializing the page objects

	public Kiwisavernavigation() {
		PageFactory.initElements(driver, this);
		driver.get(prop.getProperty("homePageUrl"));
	}

	// Actions
	public void kiwisaverNav() {
		Kiwi.click();
		Kiwi.click();
		KiwiRetire.click();
		calbutton.click();

	}
}
