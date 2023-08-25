package BrowserStack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Selenium_BrowserStack {
	
	public static final String UserName="soumyasantasahoo_0EBiCu";
	public static final String AcessKey="2fRdT5HFxg3SqsAtH79q";
	public static final String Url="https://"+UserName+":"+AcessKey+"@hub-cloud.browserstack.com/wd/hub";
	
	@Test
	public void seleniumBrowserStack() throws Throwable
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("os", "Windows");
		dc.setCapability("os_version", "11");
		dc.setCapability("browser", "chrome");
		dc.setCapability("browser_version", "114");
		dc.setCapability("name", "Soumya_TestScript_BrowserStack");
		
		WebDriver driver = new RemoteWebDriver(new URL(Url),dc);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Appium"+Keys.ENTER);
		System.out.println(driver.getTitle());
	}

}
