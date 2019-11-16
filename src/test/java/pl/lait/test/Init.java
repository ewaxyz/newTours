package pl.lait.test;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Init {
	
	static WebDriver driver;
	
	public static WebDriver getDriver () {
		
				
		System.setProperty("webdriver.chrome.driver", "C:/Users/Ewa/Desktop/selenium/chromedriver.exe");
        	
		driver = new ChromeDriver();
        
		driver.get("http://newtours.demoaut.com/");
		
		return driver;
		
	}
	

}
