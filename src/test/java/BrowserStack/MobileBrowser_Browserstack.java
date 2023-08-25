package BrowserStack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileBrowser_Browserstack {
	
	public static final String UserName="soumyasantasahoo_0EBiCu";
	public static final String AcessKey="2fRdT5HFxg3SqsAtH79q";
	public static final String Url="https://"+UserName+":"+AcessKey+"@hub-cloud.browserstack.com/wd/hub";
	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws Throwable
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Pixel 5");
		dc.setCapability(MobileCapabilityType.BROWSER_NAME, MobileBrowserType.CHROME);
		dc.setCapability("build", "1.2.4");
		dc.setCapability("name", "Soumya_Mobile_BrowserStack");
		
		driver=new RemoteWebDriver(new URL(Url), dc);
	}
	
	@Test
	public void mobileBrowserTest()
	{
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Appium"+Keys.ENTER);
		System.out.println(driver.getTitle());
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
	}

}
