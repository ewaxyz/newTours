package pl.lait.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class ReservationTest {

	WebDriver driver;

	@Before
	public void openPage() {
		driver = Init.getDriver();

	}

	@Test
	public void reserveFlight() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("eses");
		driver.findElement(By.name("password")).sendKeys("kazik123");
		driver.findElement(By.name("login")).click();
		String oneWayRadioXPath = "/html/body/div/table/tbody/tr/"
				+ "td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/"
				+ "form/table/tbody/tr[2]/td[2]/b/font/input[1]";
		driver.findElement(By.xpath(oneWayRadioXPath)).click();
		
		WebElement fromPort = driver.findElement(By.name("fromPort"));
		Select fromPortSelect = new Select(fromPort);
		fromPortSelect.selectByVisibleText("London");
		
		WebElement passCount = driver.findElement(By.name("passCount"));
		Select passCountSelect = new Select(passCount);
		passCountSelect.selectByValue("2");
		
		WebElement toDay = driver.findElement(By.name("toDay"));
		Select toDaySelect = new Select (toDay);
		toDaySelect.selectByVisibleText("22");
		
		WebElement toMonth = driver.findElement(By.name("toMonth"));
		Select toMonthSelect = new Select(toMonth);	
		toMonthSelect.selectByValue("11");
		
		String bussinessClassXpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody"
				+ "/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table"
				+ "/tbody/tr[9]/td[2]/font/input";
		
		driver.findElement(By.xpath(bussinessClassXpath)).click();
		
		WebElement airLine = driver.findElement(By.name("airline"));
		Select airLineSelect = new Select(airLine);
		airLineSelect.selectByVisibleText("Blue Skies Airlines");
		
		driver.findElement(By.name("findFlights")).click();
		
		
		
		
		
			
		
				
	}

	@After
	public void tearDown() {
		//driver.close();
	}
}
