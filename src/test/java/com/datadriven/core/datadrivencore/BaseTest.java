package com.datadriven.core.datadrivencore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public WebDriver driver;
	
	public void openBrowser(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src/test/resources"+"chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
	
	
}
