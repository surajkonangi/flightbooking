package config;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class searchflight extends loginflight {
	@Test(priority=2)
	public void searchflight1() throws IOException {
		flightreadproperties fb=new flightreadproperties();
	driver.findElement(By.xpath(fb.readPropertiesFile("searchpage.from.txt"))).sendKeys("Hyderabad");

	driver.findElement(By.xpath(fb.readPropertiesFile("searchpage.from.txt"))).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath(fb.readPropertiesFile("searchpage.to.txt"))).sendKeys("Vijayawada");

	driver.findElement(By.xpath(fb.readPropertiesFile("searchpage.to.txt"))).sendKeys(Keys.ENTER);
	clickOnElement(driver, "//input[@id='DepartDate']");
	clickOnElement(driver, fb.readPropertiesFile("searchpage.depton.txt"));
	selectDropdown(fb.readPropertiesFile("searchpage.Adults.txt"), "1");
	selectDropdown(fb.readPropertiesFile("searchpage.Children.txt"), "1");
	selectDropdown(fb.readPropertiesFile("searchpage.Infants.txt"), "0");
	clickOnElement(driver, fb.readPropertiesFile("searchpage.searchFlight.txt"));
}
	public void selectDropdown(String xpath, String visibleText) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Select noOfpeople = new Select(element);
		noOfpeople.selectByVisibleText(visibleText);

	}

	public void clickOnElement(WebDriver driver, String xpath) {
		driver.findElement(By.xpath(xpath)).click();

	}
}	
	