package com.kiwi.qa.base;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.kiwi.qa.util.Testutil;

public class Testbase {

	public WebDriver driver;
	public Properties prop;

	// creating base class constructor
	public Testbase() {

		// read properties
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\kiwisaver\\config.properties");
			prop.load(ip);
			intialization();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	// Initialization method

	public void intialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C://kiwisaver//chromedriver.exe");
			driver = new ChromeDriver();
		} 
		// Maximize window
		driver.manage().window().maximize();
		
		// Delete all cookies
		driver.manage().deleteAllCookies();

		// Page load timeout
		driver.manage().timeouts().pageLoadTimeout(Testutil.pageload_timeout, TimeUnit.SECONDS);

		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(Testutil.implict_wait, TimeUnit.SECONDS);


	}

}
