package pl.lait.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pl.lait.pageObjects.MainPage;

public class ReservationNewStyleTest {
	
	WebDriver driver;
	MainPage mp;
	
	@Before
	public void openPage() {
		System.out.println(" -- wewn before");
		driver = Init.getDriver();
		mp = new MainPage(driver);
	}
	
	@Test
	public void loginTest() {
		System.out.println(" -- wewn loginTest");
		mp.goToLoginPage();
		mp.loginAs("eses", "kazik123");
	}
		
		@After
	  	public void tearDown() {
	  		Init.end();
	  		
	  			
		//ReservationPage
		//...1 etap
		//zatwierdzam guzikiem continue
		//konstruktor dla reservation2page
		//wypełniam 2gi etap
		//zatwierdzam guzikiem
	}

}
