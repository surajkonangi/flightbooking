package config;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class bookingsteps extends bookflight {
	@Test(priority = 4)
	public void bookingsteps1() throws IOException, InterruptedException {

		flightreadproperties fb = new flightreadproperties();
		Thread.sleep(5000);
		driver.findElement(By.xpath(fb.readPropertiesFile("Itinerarystep.Insurance.txt"))).click();
		driver.findElement(By.xpath(fb.readPropertiesFile("Itinerarystep.ContinueDetails.txt"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(fb.readPropertiesFile("emailstep.EmailId.txt")))
				.sendKeys("surajkonangii@gmail.com");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",
				driver.findElement(By.xpath(fb.readPropertiesFile("emailstep.Continue.txt"))));

		driver.findElement(By.xpath(fb.readPropertiesFile("travellerstep.Title.txt"))).click();
		driver.findElement(By.xpath(fb.readPropertiesFile("travellerstep.FirstName.txt"))).sendKeys("Suraj");
		driver.findElement(By.xpath(fb.readPropertiesFile("travellerstep.LastName.txt"))).sendKeys("Konangi");
		driver.findElement(By.xpath(fb.readPropertiesFile("locators.textarea.Title"))).click();
		driver.findElement(By.xpath(fb.readPropertiesFile("locators.textarea.FirstName"))).sendKeys("Diksha");
		driver.findElement(By.xpath(fb.readPropertiesFile("locators.textarea.LastName"))).sendKeys("Pamana");
	}
}
