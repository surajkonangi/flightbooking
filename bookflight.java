package config;

import java.io.IOException;

import org.testng.annotations.Test;

public class bookflight extends searchflight {
	@Test(priority=4)
	public void bookflight1() throws IOException, InterruptedException {
		
		flightreadproperties fb=new flightreadproperties();
		Thread.sleep(5000);
	clickOnElement(driver, fb.readPropertiesFile("selectflightpage.book.txt"));
}
}