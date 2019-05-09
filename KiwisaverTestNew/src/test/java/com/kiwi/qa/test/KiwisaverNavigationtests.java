package com.kiwi.qa.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.kiwi.qa.page.KiwisaverRetirementcal;
import com.kiwi.qa.page.Kiwisavernavigation;

public class KiwisaverNavigationtests {
	Kiwisavernavigation kiwisaverNavig;

	@BeforeMethod
	public void setup() {
		kiwisaverNavig = new Kiwisavernavigation();
	}

	@Test(priority = 1)
	public void Nav() {
		kiwisaverNavig.kiwisaverNav();
	}

	@AfterMethod
	public void tearDown() {
		kiwisaverNavig.driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		kiwisaverNavig.driver.quit();
	}
}
