package MobileBrowser;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class ChromeTest {
	
	@Test
	public void chrome() throws Throwable
	{
		 File f=new File("C:\\Users\\Soumya Santa\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
			
			AppiumDriverLocalService service=new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1")
					.usingPort(4723).withTimeout(Duration.ofSeconds(300)).build();
			
			service.start();
			
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M30s");
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
			dc.setCapability(MobileCapabilityType.UDID, "RZ8M83ZJH2W");
			dc.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
			//dc.setCapability("chromedriverExecutables", "path of driver executable file");
			
			URL u=new URL("http://localhost:4723");
			AndroidDriver driver=new AndroidDriver(u,dc);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://facebook.com");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("12345");
	}

}
