package config;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class flightbookibg {
	WebDriver driver;

	@Test
	public void flight() throws InterruptedException, IOException {
		flightreadproperties fb = new flightreadproperties();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Suraj.konangi\\eclipse-workspace\\selenium\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.cleartrip.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(fb.readPropertiesFile("locators.textarea.From"))).sendKeys("Hyderabad");
		Thread.sleep(5000);
		driver.findElement(By.xpath(fb.readPropertiesFile("locators.textarea.From"))).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(fb.readPropertiesFile("locators.textarea.To"))).sendKeys("Vijayawada");
		Thread.sleep(3000);
		driver.findElement(By.xpath(fb.readPropertiesFile("locators.textarea.To"))).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(fb.readPropertiesFile("locators.textarea.Departon"))).click();
		driver.findElement(By.xpath(fb.readPropertiesFile("locators.textarea.Adults"))).click();
		driver.findElement(By.xpath(fb.readPropertiesFile("locators.textarea.Children"))).click();
		driver.findElement(By.xpath(fb.readPropertiesFile("locators.textarea.Infants"))).click();
		driver.findElement(By.xpath(fb.readPropertiesFile("locators.textarea.searchFlight"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(fb.readPropertiesFile("locators.textarea.book"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(fb.readPropertiesFile("locators.textarea.Insurance"))).click();
		driver.findElement(By.xpath(fb.readPropertiesFile("locators.textarea.ContinueDetails"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(fb.readPropertiesFile("locators.textarea.EmailId")))
				.sendKeys("srinischalthiparani@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath(fb.readPropertiesFile("locators.textarea.Continue"))).click();
		driver.findElement(By.xpath(fb.readPropertiesFile("locators.textarea.Title"))).click();
		driver.findElement(By.xpath(fb.readPropertiesFile("locators.textarea.FirstName"))).sendKeys("Sri Nischal");
		driver.findElement(By.xpath(fb.readPropertiesFile("locators.textarea.LastName"))).sendKeys("Thiparani");
		driver.findElement(By.xpath(fb.readPropertiesFile("locators.textarea.Day"))).click();
	}
}
