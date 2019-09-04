package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginflight  {
	WebDriver driver;
	@Test(priority=1)
	public void loginflight1() {
	flightreadproperties fb = new flightreadproperties();

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Suraj.konangi\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
	driver = new ChromeDriver();
	// util.getURL();
	driver.get("http://www.cleartrip.com");
	driver.manage().window().maximize();
}
}