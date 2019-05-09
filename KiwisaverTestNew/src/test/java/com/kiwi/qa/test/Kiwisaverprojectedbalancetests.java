package com.kiwi.qa.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.kiwi.qa.page.KiwisaverRetirementcal;
import com.kiwi.qa.page.Kiwisaverprojectedbalance;

public class Kiwisaverprojectedbalancetests {
	Kiwisaverprojectedbalance Kiwisaverbal;
	
	
	@BeforeMethod
	public void setup() {
		Kiwisaverbal = new Kiwisaverprojectedbalance();
	 }
	
	@Test(priority=1)
	public void kiwibalCriteriaOne() {
		Kiwisaverbal.kiwisaverbalanceCriteriaOne();
	}	
	
	@Test(priority=2)
	public void kiwibalCriteriaTwo() {
		Kiwisaverbal.kiwisaverbalanceCriteriaTwo();
	}
	
	@Test(priority=3)
	public void kiwibalCriteriaThree() {
		Kiwisaverbal.kiwisaverbalanceCriteriaThree();
	}
	
	@AfterMethod
	public void tearDown() {
		Kiwisaverbal.driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		Kiwisaverbal.driver.quit();
	}

}
