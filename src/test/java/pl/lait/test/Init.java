package pl.lait.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Init {
	
	static WebDriver driver = null;
	
	public static WebDriver getDriver () {
		
		if (driver == null) {
		System.out.println(" -- wewn getDriver null");
			
		System.setProperty("webdriver.chrome.driver", "C:/Users/Ewa/Desktop/Lait materiały/selenium/chromedriver.exe");
		
		
		
		URL remoteAdress = null;
		try {
			remoteAdress = new URL("http://192.168.0.112:4444/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		//driver = new RemoteWebDriver(remoteAdress, capabilities);
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);  
		
		Dimension rozmiarOkna = driver.manage().window().getSize();
		int wys = rozmiarOkna.height;
		int szer = rozmiarOkna.width;
		System.out.println("rozmiar okna"
		+ " to: " + wys + "x" +szer);
		
		driver.get("http://newtours.demoaut.com/");
		
		return driver;
		
	}else {
		System.out.println(" -- wewn getDriver else");
		return driver;
		
	}
	}

	public static void end() {
	driver.quit();
	driver = null;
	
		
	}
}
