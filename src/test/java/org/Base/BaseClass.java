package org.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	WebDriver driver;
	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		return driver;
	}
	
	public void loadUrl(String data) {
		driver.get(data);
	}
	public void maximize() {
         driver.manage().window().maximize();
	}
	
	public void closeAllWindow() {
		driver.quit();
	}
	
	public String printTitle() {
		String title = driver.getTitle();
		return title;
	
	}
	public String printCurrentUrl() {
	String currentUrl = driver.getCurrentUrl();
	return currentUrl;
	}
	
}
